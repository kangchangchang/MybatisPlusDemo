package kc.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author pc
 * @date Create in  2023/3/21
 */

public enum SexEnum   {

    PRIMARY(1, "男"),
    SECONDORY(2, "女");

    SexEnum(int code,String sex) {
        this.code = code;
        this.sex=sex;
    }
    /**
     * 标记数据库存的值是code
     */
    @EnumValue
    private final int code;
    /**
     * 标记前端展示、已经更新传的值
     */
    @JsonValue
    private final String sex;

    public int getCode() {
        return code;
    }

    public String getSex() {
        return sex;
    }
}
