package com.yjl.system.file;

import java.io.*;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class ByteFileOption {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            InputStream inputStream=new FileInputStream(
                    new File("C:\\Users\\yjl\\Pictures\\Saved Pictures\\4.png"));

            OutputStream outputStream=new FileOutputStream(new File("E:\\1008\\4.png"));

            byte[] bytes=new byte[1024];
            //把文件读到字节数组中
            while (inputStream.read(bytes)!=-1){ //流末尾返回-1
                int i = inputStream.read(bytes);
                System.out.println("inputStream.read ->:下一字节"+i);

                //输出流将读到的字节写入文件
                System.out.println("开始写入输出流中");
                outputStream.write(bytes);
                long end = System.currentTimeMillis();
                System.out.println(end-start);

                //    使用完流一定要关闭
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
