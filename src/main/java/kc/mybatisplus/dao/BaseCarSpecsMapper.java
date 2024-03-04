package kc.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import kc.mybatisplus.entity.BaseCarSkuDetail;
import kc.mybatisplus.entity.BaseCarSpecs;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author pc
 * @date Create in  2023/12/2
 */
@Mapper
public interface BaseCarSpecsMapper extends BaseMapper<BaseCarSpecs> {
}
