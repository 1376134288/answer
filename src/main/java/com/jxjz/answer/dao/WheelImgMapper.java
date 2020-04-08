package com.jxjz.answer.dao;

import com.jxjz.answer.form.WheelImgForm;
import com.jxjz.answer.pojo.WheelImg;
import com.jxjz.answer.util.MyMapper;
import org.apache.ibatis.annotations.Insert;

public interface WheelImgMapper extends MyMapper<WheelImg> {
    @Insert("insert into wheel_img(img_title,to_pageurl,img_path,sort) values (#{imgTitle},#{toPageurl},#{imgPath},#{sort})")
    void insertWheelImg(WheelImgForm form);
}