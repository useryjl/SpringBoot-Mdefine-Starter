package com.yjl.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yjl
 * @Description
 * @create 2021-11-25
 */
public class TestString {
    public static void main(String[] args) throws IOException {
        String str1="hello";
        if (str1.endsWith("o")&&str1.startsWith("h")){
            StringBuffer stringBuffer = new StringBuffer();
            String s = stringBuffer.append("1").append("2").toString();
            System.out.println(s);
            System.out.println("endsWith execute");
            File file=new File("F:\\test-spring-project\\000-javase\\AAA.txt");
            System.out.println(file);
            String name = file.getName();
            System.out.println("文件名:"+name);


            FileOutputStream fileOutputStream=new FileOutputStream("hello");
            byte[] bytes = str1.getBytes();
            System.out.println(bytes+":::bytes");
            fileOutputStream.write(bytes);
            //try {
            //    //文件输出流
            //    //File file1=new File("F:\\test-spring-project\\000-javase\\AAA.txt");
            //    //FileOutputStream fileOutputStream=new FileOutputStream(file1);
            //
            //
            //    //fileOutputStream.write();
            //} catch (FileNotFoundException e) {
            //    e.printStackTrace();
            //}

            String s1="F:\\src\\com\\yjl\\system\\1.txt";
        //            获取文件名
            int i = s1.lastIndexOf("\\");
            String substring = s1.substring(i + 1,i+2);
            System.out.println("文件名:"+substring);

        //    获取文件类型
            String substring1 = s1.substring(i + 3, i + 6);
            System.out.println("文件类型："+substring1);
        }else {
            System.out.println("no execute");
        }

    }
}
