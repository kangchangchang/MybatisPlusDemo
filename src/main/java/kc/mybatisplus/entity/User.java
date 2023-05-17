package kc.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import kc.mybatisplus.enums.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author pc
 * @date Create in  2023/3/20
 */
@TableName("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {


    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;
    @TableField("username")
    private String username;
    @TableField("password")
    private String password;
    @TableField("is_delete")
    @TableLogic
    private Integer  isDelete;
    @TableField("sex")
    private SexEnum sex;

    @TableField("tenant_id")
    private Integer  tenantId;
}
