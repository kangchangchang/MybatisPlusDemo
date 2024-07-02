package kc.mybatisplus.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 车型配置表
 * </p>
 *
 * @author llh
 * @since 2022-08-23
 */
@Getter
@Setter
@TableName("base_car_specs")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BaseCarSpecs implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ExcelIgnore
    private Integer id;

    /**
     * 车型id
     */
    private String specId;

    /**
     * 车型名称
     */
    private String specName;

    /**
     * 排量
     */
    @ExcelIgnore
    private String displacement;

    /**
     * 车辆类型1乘用车，2商用车
     */
    @ExcelIgnore
    private String carType;

    /**
     * 车系id
     */

    private String serieId;

    /**
     * 指导价格
     */
    private BigDecimal advisePrics;

    /**
     * 变速方式
     */
    @ExcelIgnore
    private String transmissionType;

    /**
     * 年款
     */
    @ExcelIgnore
    private String versionYear;

    /**
     * 款式发布月份
     */
    @ExcelIgnore
    private String versionDate;

    /**
     * 出厂时间
     */
    @ExcelIgnore
    private String productionYear;

    /**
     * 能源类型
     */
    @ExcelIgnore
    private String energyType;

    /**
     * 删除标识1是0否
     */
    @ExcelIgnore
    private Integer delFlag;

    /**
     * 最后修改时间
     */
    @ExcelIgnore
    private LocalDateTime lastUpdateTime;

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
     * 场景类型
     */
    @ExcelIgnore
    private String businessType;

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


}
