package kc.mybatisplus.service;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import kc.mybatisplus.dao.BaseCarSkuDetailMapper;
import kc.mybatisplus.dao.BaseCarSpecsMapper;
import kc.mybatisplus.dao.DealerMerchantRelMapper;
import kc.mybatisplus.dao.FinanceReportMapper;
import kc.mybatisplus.entity.BaseCarSkuDetail;
import kc.mybatisplus.entity.BaseCarSpecs;
import kc.mybatisplus.entity.DealerMerchantRel;
import kc.mybatisplus.entity.FinanceReport;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author pc
 * @date Create in  2023/12/2
 */
@Service
public class FinanceReportServiceImpl implements FinanceReportService, InitializingBean {

    @Resource
    FinanceReportMapper financeReportMapper;

    @Resource
    BaseCarSpecsMapper baseCarSpecsMapper;


    @Resource
    BaseCarSkuDetailMapper baseCarSkuDetailMapper;

    AtomicInteger i= new AtomicInteger();

    //财务报表导入
    @Override
    public void readBatch() throws FileNotFoundException {



    }


    @Override
    public void afterPropertiesSet() throws Exception {
        String fileName = "C:\\Users\\pc\\Desktop\\gxh\\工行新一代订单进件明细（全量）-2024-06-01~2024-06-30.xlsx";
        // 这里默认每次会读取100条数据 然后返回过来 直接调用使用数据就行
        // 具体需要返回多少行可以在`PageReadListener`的构造函数设置
        EasyExcel.read(fileName, FinanceReport.class, new PageReadListener<FinanceReport>(dataList -> {
            for (FinanceReport demoData : dataList) {
                financeReportMapper.insert(demoData);
            }
        })).sheet().doRead();

        LocalDateTime date=LocalDateTime.now();
        List<String> list=new ArrayList<>();
//        String fileName = "C:\\Users\\pc\\Desktop\\gxh\\base_car_sku_detail1.xlsx";
        // 这里默认每次会读取100条数据 然后返回过来 直接调用使用数据就行
        // 具体需要返回多少行可以在`PageReadListener`的构造函数设置
//        EasyExcel.read(fileName, BaseCarSpecs.class, new PageReadListener<BaseCarSpecs>(dataList -> {
//            for (BaseCarSpecs demoData : dataList) {
//                if(!list.contains(demoData.getSpecId())){
//                    demoData.setDelFlag(0);
//                    demoData.setCreateTime(date);
//                    demoData.setUpdateTime(date);
//                    demoData.setLastUpdateTime(date);
//                    demoData.setBusinessType("stages,trial");
//                 //   demoData.setSpecName("24款"+demoData.getSpecName());
//                    demoData.setVersionYear("2024");
//                    System.out.println(demoData.getSpecName());
//                    baseCarSpecsMapper.insert(demoData);
//                    list.add(demoData.getSpecId());
//                }
//            }
//        })).sheet().doRead();

//
//        EasyExcel.read(fileName, BaseCarSkuDetail.class, new PageReadListener<BaseCarSkuDetail>(dataList -> {
//            for (BaseCarSkuDetail demoData : dataList) {
//                    demoData.setDelFlag(0);
//                    demoData.setCreateTime(date);
//                    demoData.setUpdateTime(date);
//                    demoData.setLastUpdateTime(date);
//
//                    System.out.println(demoData.getSpecName());
//                    baseCarSkuDetailMapper.insert(demoData);
//                    list.add(demoData.getSpecId());
//
//            }
//        })).sheet().doRead();
    }
}
