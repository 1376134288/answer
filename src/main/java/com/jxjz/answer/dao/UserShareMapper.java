package com.jxjz.answer.dao;

import com.jxjz.answer.pojo.UserShare;
import com.jxjz.answer.pojo.UserShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserShareMapper {
    int countByExample(UserShareExample example);

    int deleteByExample(UserShareExample example);

    int insert(UserShare record);

    int insertSelective(UserShare record);

    List<UserShare> selectByExample(UserShareExample example);

    int updateByExampleSelective(@Param("record") UserShare record, @Param("example") UserShareExample example);

    int updateByExample(@Param("record") UserShare record, @Param("example") UserShareExample example);
}