package com.wxw.springboot.dao;

import com.wxw.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@Mapper
@CacheConfig(cacheNames = "users")
public interface UserDao {
    /**
     * 删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 添加
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 根据ID获取数据
     * @param id
     * @return
     */
    @Cacheable(key = "#p0")
    User selectByPrimaryKey(Integer id);

    /**
     * 更新
     * @param record
     * @return
     */
    @CachePut(key = "#p0.age")
    int updateByPrimaryKeySelective(User record);

    /**
     * 跟新
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);
}