package com.sirius.server.mybatis.mapper;

import com.sirius.server.mybatis.entity.Human;
import com.sirius.server.mybatis.entity.HumanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HumanMapper {
    long countByExample(HumanExample example);

    int deleteByExample(HumanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Human record);

    int insertSelective(Human record);

    List<Human> selectByExample(HumanExample example);

    Human selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Human record, @Param("example") HumanExample example);

    int updateByExample(@Param("record") Human record, @Param("example") HumanExample example);

    int updateByPrimaryKeySelective(Human record);

    int updateByPrimaryKey(Human record);
}