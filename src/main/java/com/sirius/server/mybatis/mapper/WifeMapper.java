package com.sirius.server.mybatis.mapper;

import com.sirius.server.mybatis.entity.Wife;
import com.sirius.server.mybatis.entity.WifeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WifeMapper {
    long countByExample(WifeExample example);

    int deleteByExample(WifeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Wife record);

    int insertSelective(Wife record);

    List<Wife> selectByExample(WifeExample example);

    Wife selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Wife record, @Param("example") WifeExample example);

    int updateByExample(@Param("record") Wife record, @Param("example") WifeExample example);

    int updateByPrimaryKeySelective(Wife record);

    int updateByPrimaryKey(Wife record);
}