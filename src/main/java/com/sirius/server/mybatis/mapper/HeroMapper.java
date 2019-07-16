package com.sirius.server.mybatis.mapper;

import com.sirius.server.mybatis.entity.Hero;
import com.sirius.server.mybatis.entity.HeroExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeroMapper {
    long countByExample(HeroExample example);

    int deleteByExample(HeroExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Hero record);

    int insertSelective(Hero record);

    List<Hero> selectByExample(HeroExample example);

    Hero selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Hero record, @Param("example") HeroExample example);

    int updateByExample(@Param("record") Hero record, @Param("example") HeroExample example);

    int updateByPrimaryKeySelective(Hero record);

    int updateByPrimaryKey(Hero record);
}