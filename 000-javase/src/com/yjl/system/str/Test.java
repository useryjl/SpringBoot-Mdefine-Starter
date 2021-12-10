package com.yjl.system.str;

import java.io.IOException;
import java.util.UUID;

/**
 * @author yjl
 * @Description
 * @create 2021-12-08
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //随机字符
        String string = UUID.randomUUID().toString();
        String replace = string.replace("-", "");


        String filename="11312dadadad.txt";
        int i = filename.lastIndexOf(".");
        String substring = filename.substring(i);
        System.out.println("fileType:"+substring);

        String newFileName = replace + substring;
        System.out.println("newFileName:"+newFileName);


        //File file = new File("E:" + File.separator + 123456 + File.separator+"test"+File.separator+filename);
        //File parentFile = file.getParentFile();  //创建父级目录  有父级目录才会创建文件
        //System.out.println("parentFile:"+parentFile);
        //String parent = file.getParent();
        //System.out.println("parent:"+parent);
        //if (!parentFile.exists()) {
        //    parentFile.mkdirs();
        //}
        //    if (!file.exists()) {
        //        file.createNewFile();
        //    }
        //
        //String path = file.getPath();
        //System.out.println("path:"+path);
        //
        //String absolutePath = file.getAbsolutePath();
        //System.out.println("absolutePath:"+absolutePath);
        //
        //OutputStream outputStream=new FileOutputStream(file);
        //    byte[] bytes=new byte[]{95,96,97};
        //    outputStream.write(bytes);
        //    outputStream.flush();
        //    outputStream.close();
    }
}
