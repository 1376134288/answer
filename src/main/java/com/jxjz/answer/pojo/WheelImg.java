package com.jxjz.answer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WheelImg {
    private int sort;
    private String imgTitle;
    private String toPageurl;
    private String imgPath;
    private Date create_time;
    private Date update_time;
    private Integer id;
}