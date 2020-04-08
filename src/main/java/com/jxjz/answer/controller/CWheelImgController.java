package com.jxjz.answer.controller;

import com.jxjz.answer.pojo.WheelImg;
import com.jxjz.answer.service.IWheelImgService;
import com.jxjz.answer.util.IMoocJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/wheelimg")
@Api(value = "轮播图接口", tags = "轮播图接口")
public class CWheelImgController {
    @Autowired
    public IWheelImgService iWheelImgService;


    @GetMapping("/getAllImg")
    @ApiOperation(value = "获取所有轮播图数据")
    public IMoocJSONResult getAllImg(){
        return IMoocJSONResult.ok(iWheelImgService.queryAllImg());
    }

    @PostMapping("/addWheelImg")
    @ApiOperation(value = "增加轮播图相关信息")
    public IMoocJSONResult addWheelImg(@RequestBody WheelImg wheelImg){
        if(iWheelImgService.addWheelImg(wheelImg)>=1){
            return IMoocJSONResult.ok();
        }else {
            return IMoocJSONResult.errorMsg("轮播信息出现错误!");
        }
    }
}
