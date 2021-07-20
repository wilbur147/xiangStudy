package com.xiangji.demo.service.impl;

import com.xiangji.demo.domain.User;
import com.xiangji.demo.mapper.UserMapper;
import com.xiangji.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Xiangji
 * @since 2021-07-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public User queryFirstByName(String name) {
        return baseMapper.selectFirstByName(name);
    }
}
