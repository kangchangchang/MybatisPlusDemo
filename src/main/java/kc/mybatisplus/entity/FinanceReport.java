package kc.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author pc
 * @date Create in  2023/12/2
 */
@Getter
@Setter
@EqualsAndHashCode
@TableName("gong")
public class FinanceReport {

    //订单号
    String orderNo;
    /**
     * 机构订单号
     */
    String jigou;
    /**
     * 经办分行
     */
    String jbfh;
    /**
     * 业务经办行
     */
    String ywjbh;
    /**
     * 机构名称
     */
    String jigoum;
    /**
     * 订单创建时间
     */
    String createTime;
    /**
     * 业务类型
     */
    String type;
    /**
     * 开户日期
     */
    String kaihu;

}
