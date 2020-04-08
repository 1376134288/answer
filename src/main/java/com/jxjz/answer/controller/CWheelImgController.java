package com.jxjz.answer.controller;

import com.jxjz.answer.form.WheelImgForm;
import com.jxjz.answer.service.IWheelImgService;
import com.jxjz.answer.util.IMoocJSONResult;
import com.jxjz.answer.util.UploadFileUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/wheelimg")
@Api(value = "轮播图接口", tags = "轮播图接口测试")
public class CWheelImgController {
    @Autowired
    public IWheelImgService iWheelImgService;


    @GetMapping("/getAllImg")
    @ApiOperation(value = "获取所有轮播图数据e")
    public IMoocJSONResult getAllImg(){
        return IMoocJSONResult.ok(iWheelImgService.queryAllImg());
    }

    @PostMapping("/addWheelImg")
    @ApiOperation(value = "增加轮播图相关信息")
    public IMoocJSONResult addWheelImg(@RequestBody WheelImgForm wheelImgForm){
        iWheelImgService.addWheelImge(wheelImgForm);
        return IMoocJSONResult.ok();
    }

    @PostMapping(value = "/uploadImage", consumes = "multipart/*", headers = "content-type=multipart/form-data")
    public IMoocJSONResult upload(@ApiParam(value = "上传的图片", required = true) @RequestParam("file") MultipartFile file){
        return IMoocJSONResult.ok(UploadFileUtils.upload(file));
    }
}
