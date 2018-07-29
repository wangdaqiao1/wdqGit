package com.wdq.service.impl;

import com.wdq.mapper.UserMapper;
import com.wdq.model.User;
import com.wdq.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
// 此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   kinbridge
 * Date:     2018/7/29 17:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper mapper;

    /**
     * 根据  id  删除 数据
     */
    public boolean delete(int id) {
        return mapper.delete(id);
    }
    /**
     * 查询User的全部数据
     */
    public List<User> findAll() {
        List<User> findAllList = mapper.findAll();
        return findAllList;
    }
    /**
     * 根据 id 查询 对应数据
     */
    public User findById(int id) {
        User user = mapper.findById(id);
        return user;
    }
    /**
     * 新增数据
     */
    public void save(User user) {
        mapper.save(user);
    }
    /**
     * 根据 id 修改对应数据
     */
    public boolean update(User user) {
        return mapper.update(user);
    }

}
