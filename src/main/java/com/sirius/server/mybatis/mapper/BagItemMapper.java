package com.sirius.server.mybatis.mapper;

import com.sirius.server.mybatis.entity.BagItem;
import com.sirius.server.mybatis.entity.BagItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BagItemMapper {
    long countByExample(BagItemExample example);

    int deleteByExample(BagItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BagItem record);

    int insertSelective(BagItem record);

    List<BagItem> selectByExample(BagItemExample example);

    BagItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BagItem record, @Param("example") BagItemExample example);

    int updateByExample(@Param("record") BagItem record, @Param("example") BagItemExample example);

    int updateByPrimaryKeySelective(BagItem record);

    int updateByPrimaryKey(BagItem record);
}