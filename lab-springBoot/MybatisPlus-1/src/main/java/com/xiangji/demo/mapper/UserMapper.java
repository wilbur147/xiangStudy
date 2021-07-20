package com.xiangji.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiangji.demo.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Xiangji
 * @since 2021-07-02
 */
public interface UserMapper extends BaseMapper<User> {

    User selectFirstByName(@Param("firstName")String name);

}
