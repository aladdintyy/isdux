package com.isdux.mapper.datasource;

import com.isdux.model.datasource.UserOrganization;

public interface UserOrganizationMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserOrganization record);

    int insertSelective(UserOrganization record);

    UserOrganization selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserOrganization record);

    int updateByPrimaryKey(UserOrganization record);
}