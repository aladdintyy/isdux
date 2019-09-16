package com.isdux.mapper.datasource;

import com.isdux.model.datasource.UserRole;
import com.isdux.model.datasource.UserRoleExample;

public interface UserRoleMapper {
    long countByExample(UserRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}