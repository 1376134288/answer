package com.jxjz.answer.service.impl;

import com.jxjz.answer.dao.WheelImgMapper;
import com.jxjz.answer.pojo.WheelImg;
import com.jxjz.answer.service.IWheelImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hxf
 * @creterTime 2020/4/8 13:24
 * @package_name com.jxjz.answer.service.impl
 * @文件说明 ${文件说明}
 */

@Service
public class WheelImgServiceImpl implements IWheelImgService {
    @Autowired
    public WheelImgMapper wheelImgMapper;

    @Override
    public List<WheelImg> queryAllImg() {
        return wheelImgMapper.selectAll();
    }

    @Override
    public int addWheelImg(WheelImg wheelImg) {
        return wheelImgMapper.insert(wheelImg);
    }
}
