package com.wxw.springboot.service;

import com.wxw.springboot.model.User;

import java.util.List;

public interface UserService {

    /**
     * 根据ID获取数据
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 添加
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);
}
