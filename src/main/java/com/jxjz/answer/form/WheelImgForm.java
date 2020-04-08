package com.jxjz.answer.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hxf
 * @creterTime 2020/4/8 17:30
 * @package_name com.jxjz.answer.form
 * @文件说明 ${文件说明}
 */
@Data
public class WheelImgForm {
    @ApiModelProperty(value = "排序号")
    private int sort;
    @ApiModelProperty(value = "图片标题")
    private String imgTitle;
    @ApiModelProperty(value = "跳转路径")
    private String toPageurl;
    @ApiModelProperty(value = "图片路径")
    private String imgPath;
}
