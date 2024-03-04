package kc.mybatisplus.configuration;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * easyExcel工具类
 *
 * @author tan
 */
@Slf4j
public class EasyExcelUtil {
    private EasyExcelUtil(){}
    private static final String SHEET_NAME = "模板";




    /**
     * 文件上传
     *
     * @param inputStream 表格文件
     * @param clazz       表格基础对象
     * @return
     */
    public static List importProcess(InputStream inputStream, Class clazz, int sheetNum, int headRow) {
        EasyExcelListener linster = new EasyExcelListener();
        EasyExcel.read(inputStream, clazz, linster).sheet(sheetNum).headRowNumber(headRow).doRead();
        List<BaseImportExcelBo> excelDataList = linster.result();
        try {
            return convertData(excelDataList, clazz);
        } catch (Exception e) {
            log.error("转换对象报错:", e);
        }
        return null;
    }

    /**
     * 类型转化
     *
     * @param dataList
     * @param objCls
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    private static List convertData(List<BaseImportExcelBo> dataList, Class objCls) throws IllegalAccessException, InstantiationException {
        List list = new ArrayList(8);
        if (!(objCls.newInstance() instanceof BaseImportExcelBo)) {
            return null;
        }
        if (CollectionUtils.isEmpty(dataList)) {
            return null;
        }

        for (BaseImportExcelBo data : dataList) {
            list.add(data);
        }
        return list;
    }





}
