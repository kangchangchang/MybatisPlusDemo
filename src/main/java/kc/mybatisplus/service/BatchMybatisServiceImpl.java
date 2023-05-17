package kc.mybatisplus.service;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import kc.mybatisplus.dao.UserDao;
import kc.mybatisplus.entity.User;
import kc.mybatisplus.enums.SexEnum;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author pc
 * @date Create in  2023/3/20
 */
@Service
public class BatchMybatisServiceImpl extends ServiceImpl<UserDao,User> implements BatchMybatisService{

    @Resource
    ThreadPoolTaskExecutor   threadPoolTaskExecutor;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void  batchInsert() throws ExecutionException, InterruptedException {


        List<Future<Boolean>> futureList=new ArrayList<Future<Boolean>>();

        List<User> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            User user=new User(i,"user"+i,"password"+i,0, SexEnum.PRIMARY,i);
            list.add(user);
        }
        List<List<User>> splitList=CollUtil.split(list,50);
        long start=System.currentTimeMillis();
        for (List<User> userList:splitList){
            Future<Boolean> future= threadPoolTaskExecutor.submit(()->saveBatch(userList));
            futureList.add(future);
        }
        futureList.forEach(e->{
            try {
                /**
                 * 可以优化下，记录那一批数据没插入成功
                 */
             boolean   flag = e.get();
                if(!flag){
                    System.out.println("批量插入异常");
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } catch (ExecutionException ex) {
                ex.printStackTrace();
            }

        });

        long end=System.currentTimeMillis();
        long time=end-start;
        System.out.println("批量插入时间："+time);

    }

    @Override
    public void delete(int id) {
        this.removeById(id);
    }

    @Override
    public List<User> queryList() {
        return baseMapper.selectList(null);
    }

    @Override
    public void updateUser(User user) {
        this.updateById(user);
    }

    @Override
    public void insert(User user) {
        baseMapper.insert(user);
    }


}
