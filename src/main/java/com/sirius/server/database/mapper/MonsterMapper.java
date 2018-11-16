package com.sirius.server.database.mapper;

import com.sirius.server.database.entity.Monster;

public interface MonsterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Monster record);

    int insertSelective(Monster record);

    Monster selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Monster record);

    int updateByPrimaryKey(Monster record);
}