package kc.mybatisplus.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import kc.mybatisplus.configuration.BaseImportExcelBo;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author pc
 * @date Create in  2023/12/7
 */
@Data
@ToString
@TableName( "DEALER_MERCHANT_REL")
@KeySequence("SEQ_DEALER_MERCHANT_REL")
public class DealerMerchantRel  extends BaseImportExcelBo implements Serializable{
    private static final long serialVersionUID = 1L;



    private String merchantNo;//经销商ID

    private String newMerchantNo;//商户号


    private Long handleBankId;//经办行主键

    /**
     * 经销商与商户关系Id
     */
    private String dealerMerchantRelId;

    @ExcelIgnore
    private Integer id;//主键

    @ExcelIgnore

    private int isDel;//是否删除(0否 1是)
    @ExcelIgnore

    private Date createDate;
    @ExcelIgnore

    private Date updateDate;
    @ExcelIgnore

    private String remark;//商户号对应备注

}