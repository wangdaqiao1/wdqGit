package com.wdq.mapper;

import com.wdq.model.User;

import java.awt.*;
import java.util.List;

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserMapper
 * Author:   kinbridge
 * Date:     2018/7/29 17:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface UserMapper{
    void save(User user);
    boolean update(User user);
    boolean delete(int id);
    User findById(int id);
    List<User> findAll();
}
