package kc.mybatisplus.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import kc.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author pc
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
