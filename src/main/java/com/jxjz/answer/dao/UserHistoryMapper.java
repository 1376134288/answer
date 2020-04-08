package com.jxjz.answer.dao;

import com.jxjz.answer.pojo.UserHistory;
import com.jxjz.answer.pojo.UserHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHistoryMapper {
    int countByExample(UserHistoryExample example);

    int deleteByExample(UserHistoryExample example);

    int insert(UserHistory record);

    int insertSelective(UserHistory record);

    List<UserHistory> selectByExample(UserHistoryExample example);

    int updateByExampleSelective(@Param("record") UserHistory record, @Param("example") UserHistoryExample example);

    int updateByExample(@Param("record") UserHistory record, @Param("example") UserHistoryExample example);
}