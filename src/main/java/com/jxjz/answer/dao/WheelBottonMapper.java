package com.jxjz.answer.dao;

import com.jxjz.answer.pojo.WheelBotton;
import com.jxjz.answer.pojo.WheelBottonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WheelBottonMapper {
    int countByExample(WheelBottonExample example);

    int deleteByExample(WheelBottonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WheelBotton record);

    int insertSelective(WheelBotton record);

    List<WheelBotton> selectByExample(WheelBottonExample example);

    WheelBotton selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WheelBotton record, @Param("example") WheelBottonExample example);

    int updateByExample(@Param("record") WheelBotton record, @Param("example") WheelBottonExample example);

    int updateByPrimaryKeySelective(WheelBotton record);

    int updateByPrimaryKey(WheelBotton record);
}