package kc.mybatisplus.configuration;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * EasyExcel监听器
 *
 * @author tan
 */
public class EasyExcelListener extends AnalysisEventListener<BaseImportExcelBo> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EasyExcelListener.class);
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;
    List<BaseImportExcelBo> dataS = new ArrayList<>();

    /**
     * 返回给用户的List
     */
    List<BaseImportExcelBo> result = new ArrayList<>(8);

    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     */
    public EasyExcelListener() {
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data    one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(BaseImportExcelBo data, AnalysisContext context) {
        dataS.add(data);
        result.add(data);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (dataS.size() >= BATCH_COUNT) {
            // 存储完成清理 list
            dataS.clear();
        }
    }


    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", result.size());
        LOGGER.info("存储数据库成功！");
    }

    public List<BaseImportExcelBo> result() {
        return this.result;
    }
}
