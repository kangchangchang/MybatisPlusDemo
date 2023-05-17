package kc.mybatisplus.controller;

import kc.mybatisplus.entity.User;
import kc.mybatisplus.service.BatchMybatisService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pc
 * @date Create in  2023/4/3
 */
@RestController
public class UserController {

    @Resource
    BatchMybatisService batchMybatisService;

    @RequestMapping("queryUserList")
    public List<User> getUserList(){
      return   batchMybatisService.queryList();

    }
}
