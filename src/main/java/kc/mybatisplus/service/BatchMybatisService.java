package kc.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import kc.mybatisplus.entity.User;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @author pc
 */
public interface BatchMybatisService extends IService<User> {
    /**
     *
     */
     void  batchInsert() throws ExecutionException, InterruptedException;

     void delete(int id);

     List<User> queryList();

     void  updateUser(User user);


     void  insert(User user);

}
