package com.jxjz.answer.util;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

/**
 * 自定义上传文件类
 * @author Administrator
 */
@Component
@Log
public class UploadFileUtils {

    /**
     * 轮播图片路径
     */
    @Value("${jxjz.service.path}")
    private String path;

    private static String BASE_PATH;


    @PostConstruct
    public void init() {
        BASE_PATH = path;
    }


    //图片前缀
    public static final String ARTICLE_IMAGE = "/image/";


    /**
     * 上传图片
     * @param file
     * @return
     */
    public static IMoocJSONResult upload(MultipartFile file){
        String filename = file.getOriginalFilename();
        String uploadPath = UUID.randomUUID().toString().replaceAll("-", "") + filename.substring(filename.lastIndexOf("."));
        try {
            File file1 = new File(BASE_PATH + uploadPath);
            System.out.println(file1.getPath());
            if(!file1.getParentFile().exists()){
                try {
                    file1.getParentFile().mkdirs();
                    file1.createNewFile();
                    System.out.println("创建成功!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            file.transferTo(new File(BASE_PATH + uploadPath));
        } catch (IOException e) {
            log.info(e.getMessage());
            return IMoocJSONResult.errorMsg("图片上传失败");
        }
        HashMap map=new HashMap();
        map.put("url",ARTICLE_IMAGE+uploadPath);
        return IMoocJSONResult.ok(map);
    }

}
