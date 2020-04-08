package com.jxjz.answer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author hxf
 * @creterTime 2020/4/8 16:02
 * @package_name com.jxjz.answer.pojo
 * @文件说明 ${文件说明}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WheelImgGet {
    private int sort;
    private String imgTitle;

    private String toPageurl;

    private String imgPath;
    private Date create_time;
    private Date update_time;
}
