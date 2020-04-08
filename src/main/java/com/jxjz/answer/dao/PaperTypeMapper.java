package com.jxjz.answer.dao;

import com.jxjz.answer.pojo.PaperType;
import com.jxjz.answer.pojo.PaperTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperTypeMapper {
    int countByExample(PaperTypeExample example);

    int deleteByExample(PaperTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaperType record);

    int insertSelective(PaperType record);

    List<PaperType> selectByExample(PaperTypeExample example);

    PaperType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaperType record, @Param("example") PaperTypeExample example);

    int updateByExample(@Param("record") PaperType record, @Param("example") PaperTypeExample example);

    int updateByPrimaryKeySelective(PaperType record);

    int updateByPrimaryKey(PaperType record);
}