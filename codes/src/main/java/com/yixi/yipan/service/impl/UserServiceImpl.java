package com.yixi.yipan.service.impl;

import com.yixi.yipan.entity.User;
import com.yixi.yipan.mapper.UserMapper;
import com.yixi.yipan.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yixi
 * @since 2024-10-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
