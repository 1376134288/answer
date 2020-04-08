package com.jxjz.answer.service;

import com.jxjz.answer.pojo.WheelImg;

import java.util.List;

/**
 * @author hxf
 * @creterTime 2020/4/8 13:24
 * @package_name com.jxjz.answer.service
 * @文件说明 轮播图服务类
 */

public interface IWheelImgService {
    //查询所有轮播图
    public List<WheelImg> queryAllImg();

    //增加轮播图
    public int addWheelImg(WheelImg wheelImg);


}
