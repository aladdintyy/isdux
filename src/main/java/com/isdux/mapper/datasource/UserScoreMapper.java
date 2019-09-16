package com.isdux.mapper.datasource;

import com.isdux.model.datasource.UserScore;

public interface UserScoreMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserScore record);

    int insertSelective(UserScore record);

    UserScore selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserScore record);

    int updateByPrimaryKey(UserScore record);
}