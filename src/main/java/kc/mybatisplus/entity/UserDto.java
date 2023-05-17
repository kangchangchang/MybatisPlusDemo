package kc.mybatisplus.entity;

/**
 * @author pc
 * @date Create in  2023/3/22
 */
public class UserDto {

    /**
     * 1男  2女
     */
    private int   sex;
    /**
     * 前端展示
     */
    private String sexName;

    public String getSexName() {
        return sex==1?"男":"女";
    }
}
