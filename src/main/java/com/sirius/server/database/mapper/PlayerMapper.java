package com.sirius.server.database.mapper;

import com.sirius.server.database.entity.Player;

public interface PlayerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);
}