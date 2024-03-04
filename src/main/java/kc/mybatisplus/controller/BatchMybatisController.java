package kc.mybatisplus.controller;

import kc.mybatisplus.entity.User;
import kc.mybatisplus.service.BatchMybatisService;
import kc.mybatisplus.service.FinanceReportServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @author pc
 * @date Create in  2023/3/20
 */
@RestController
public class BatchMybatisController {

    @Resource
    BatchMybatisService batchMybatisService;
    @Resource
    FinanceReportServiceImpl financeReportService;

    @RequestMapping("/batchInsert")
    public void test() throws ExecutionException, InterruptedException {
        batchMybatisService.batchInsert();
    }

    @RequestMapping("/insert")
    public void insert(@RequestBody User user)  {
        batchMybatisService.insert(user);
    }


    @RequestMapping("/delete")
    public void delete( int  id) {
        batchMybatisService.delete(id);
    }

    @RequestMapping("/query")
    public List<User> query() {
        return batchMybatisService.queryList();
    }


    @RequestMapping("/update")
    public void update(@RequestBody  User user) {
         batchMybatisService.updateUser(user);
    }

    @RequestMapping("/financeReport")
    public void  financeReport() throws FileNotFoundException {
        financeReportService.readBatch();;
    }
}
