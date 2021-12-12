package com.example.demo.controller;

import com.sun.org.apache.xpath.internal.operations.Mult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author yjl
 * @Description
 * @create 2021-12-12
 */
@Controller
public class FileUpLoad {
    @RequestMapping(value = "/fileupload")
    public String fileUpLoad(MultipartFile photo){
        String originalFilename = photo.getOriginalFilename();
        System.out.println(originalFilename);

        File file = new File("WEB-INF\\img");
        try {
            photo.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "上传成功";
    }
}
