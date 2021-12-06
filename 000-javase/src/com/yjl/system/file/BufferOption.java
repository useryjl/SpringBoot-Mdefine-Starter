package com.yjl.system.file;

import java.io.*;

/**
 * @author yjl
 * @Description   使用缓冲输入流 缓冲输出流效率极高
 * 将输入流读到缓冲区，再从缓冲区写到字节数组中
 * BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
 *
 *
 *
 * @create 2021-11-30
 */
public class BufferOption {
    public static void main(String[] args) {
        try {
            String string="C:\\Users\\yjl\\Pictures\\Saved Pictures\\4.png";

            long start = System.currentTimeMillis();
            InputStream inputStream=new FileInputStream(new File(string));
            OutputStream outputStream=new FileOutputStream(
                    new File("E:\\1008\\4.png"));
            //将输入流读到缓冲区中
            BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
            //输出流存入缓冲区 从缓冲区写入数组中
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);

            byte[] bytes=new byte[1024];
            //把文件读到输入流中
            while (bufferedInputStream.read(bytes)!=-1){ //流末尾返回-1
                int i = bufferedInputStream.read(bytes);
                System.out.println("inputStream.read ->:下一字节"+i);

                //输出流将读到的字节写入文件
                System.out.println("开始写入输出流中");
                //bufferedOutputStream.write(bytes);
                // bufferedOutputStream.write(bytes,0,i);

                //读多烧少写多少
                long end = System.currentTimeMillis();
                System.out.println(end-start);

                bufferedOutputStream.flush();
                //    使用完流一定要关闭
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
