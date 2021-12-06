package com.yjl.system.file;

import java.io.File;
import java.io.IOException;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class TestfILE {
    //创建目录的方法
    public static Boolean fileOption(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()&& !file.isDirectory()){
            file.mkdir();
            return true;
        }else{
            file.delete();
            File[] files = file.listFiles();
            for (File file1:files){
                System.out.println("文件内容"+file1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            Boolean aBoolean = TestfILE.fileOption("E:\\newDirectory");
            if (!aBoolean){
                System.out.println("创建目录失败");
            }else {
                System.out.println("创建目录成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
