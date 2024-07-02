package kc.mybatisplus.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 车SKU编码物料详细配置
 * </p>
 *
 * @author llh
 * @since 2022-09-23
 */
@Getter
@Setter
@TableName("base_car_sku_detail")
public class BaseCarSkuDetail extends Model<BaseCarSkuDetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ExcelIgnore

    private Integer id;

    /**
     * SKU编码
     */
    private String skuCode;

    /**
     * SKU名称
     */
    private String skuName;

    /**
     * 商品编码
     */
    private String shopCode;

    /**
     * 购车类型
     */
    @ExcelIgnore

    private String buyCarType;

    /**
     * 物料编码
     */
    private String skuDetailCode;

    /**
     * 物料描述
     */
    private String skuDetailDesc;

    /**
     * 车辆价格
     */
    private BigDecimal carTotalPrice;

    /**
     * 年款
     */
    private String versionYear;

    /**
     * 车系id
     */
    private String serieId;

    /**
     * 车系名称
     */
    private String serieName;

    /**
     * 车型id
     */
    private String specId;

    /**
     * 车型名称
     */
    private String specName;

    /**
     * 选配续航
     */
    @ExcelIgnore

    private String optionaiEndurance;

    /**
     * 选配动力
     */
    private String optionaiPower;

    /**
     * 外饰风格id
     */
    private String appearanceId;

    /**
     * 外饰风格名称
     */
    private String appearanceName;

    /**
     * 内饰
     */
    @ExcelIgnore

    private String interior;

    /**
     * 轮毂
     */
    @ExcelIgnore

    private String hub;

    /**
     * 车顶
     */
    @ExcelIgnore

    private String roof;

    /**
     * 选装包
     */
    @ExcelIgnore

    private String optionalPack;

    /**
     * 电池电芯
     */
    @ExcelIgnore

    private String battery;

    /**
     * 删除标识1是0否
     */
    @ExcelIgnore

    private Integer delFlag;

    /**
     * 创建人姓名
     */
    @ExcelIgnore

    private String createdName;

    /**
     * 修改人姓名
     */
    @ExcelIgnore

    private String updatedName;

    /**
     * 创建人
     */
    @ExcelIgnore

    private String createdBy;

    /**
     * 修改人
     */
    @ExcelIgnore

    private String updatedBy;

    /**
     * 创建时间
     */
    @ExcelIgnore

    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @ExcelIgnore

    private LocalDateTime updateTime;

    /**
     * 最后修改时间
     */
    @ExcelIgnore

    private LocalDateTime lastUpdateTime;


}
