package com.yjl.system;

import java.io.File;

/**
 * @author yjl
 * @Description
 * @create 2021-11-25
 */
public class TestString {
    public static void main(String[] args) {
        String str1="hello";
        if (str1.endsWith("o")&&str1.startsWith("h")){
            StringBuffer stringBuffer = new StringBuffer();
            String s = stringBuffer.append("1").append("2").toString();
            System.out.println(s);
            System.out.println("endsWith execute");
            File file = new File("F:\\test-spring-project\\000-javase\\src\\com\\yjl\\system\\1.txt");
            if(!file.exists()){
                System.out.println("文件不存在");
                long l = file.lastModified();
                System.out.println(l);
            }
        }else {
            System.out.println("no execute");
        }

    }
}
