package com.yjl.system.str;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

/**
 * @author yjl
 * @Description
 * @create 2021-12-08
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String filename="1.txt";
        File file = new File("E:" + File.separator + 123456 + File.separator+"test"+File.separator+filename);
        File parentFile = file.getParentFile();  //创建父级目录  有父级目录才会创建文件
        System.out.println("parentFile:"+parentFile);
        String parent = file.getParent();
        System.out.println("parent:"+parent);
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
            if (!file.exists()) {
                file.createNewFile();
            }

        OutputStream outputStream=new FileOutputStream(file);
            byte[] bytes=new byte[]{95,96,97};
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
    }
}
