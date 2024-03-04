package kc.mybatisplus.component;

import kc.mybatisplus.dao.UserDao;
import kc.mybatisplus.entity.User;
import kc.mybatisplus.enums.SexEnum;
import org.apache.ibatis.cache.TransactionalCacheManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author pc
 * @date Create in  2023/5/17
 */
@Component
public class UserService {

    OrderService  orderService;
    @Resource
    UserDao userDao;


    @Transactional
    public  void a(){

        System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
        User user=new User(1,"user"+1,"password"+1,0, SexEnum.PRIMARY,1);
        userDao.insert(user);
        try {
            b();
        }catch (Exception e){
        }
    }
    @Transactional
    public void b(){
        User user=new User(2,"user"+21,"password"+2,0, SexEnum.PRIMARY,2);
        userDao.insert(user);
        System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println(1/0);

    }
}
