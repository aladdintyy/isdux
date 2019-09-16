package com.isdux.mapper.datasource;

import com.isdux.model.datasource.UserRight;

public interface UserRightMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserRight record);

    int insertSelective(UserRight record);

    UserRight selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserRight record);

    int updateByPrimaryKey(UserRight record);
}