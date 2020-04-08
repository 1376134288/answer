package com.jxjz.answer.dao;

import com.jxjz.answer.pojo.PaperSubject;
import com.jxjz.answer.pojo.PaperSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperSubjectMapper {
    int countByExample(PaperSubjectExample example);

    int deleteByExample(PaperSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaperSubject record);

    int insertSelective(PaperSubject record);

    List<PaperSubject> selectByExample(PaperSubjectExample example);

    PaperSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaperSubject record, @Param("example") PaperSubjectExample example);

    int updateByExample(@Param("record") PaperSubject record, @Param("example") PaperSubjectExample example);

    int updateByPrimaryKeySelective(PaperSubject record);

    int updateByPrimaryKey(PaperSubject record);
}