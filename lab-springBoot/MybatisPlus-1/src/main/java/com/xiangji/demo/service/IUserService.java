package com.xiangji.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiangji.demo.domain.User;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Xiangji
 * @since 2021-07-02
 */
public interface IUserService extends IService<User> {
    User queryFirstByName(String name);
}
