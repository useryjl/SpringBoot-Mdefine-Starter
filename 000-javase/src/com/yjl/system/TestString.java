package com.yjl.system;

import com.sun.deploy.util.StringUtils;
import sun.security.krb5.internal.PAData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yjl
 * @Description
 * @create 2021-11-25
 */
public class TestString {

    //private final Map<String,Object> map=new HashMap<String,Object>;

    public static void main(String[] args) throws IOException {
        //contains方法
        Map<String,Object> map=new HashMap<>();
        map.put("1",1);
        map.put("2","2");
        boolean b = map.containsKey("1");
        boolean d = map.containsKey("2");
        Object o = map.get("1");
        String o2 = (String) map.get("2");
        System.out.println("map.contains(key): "+b+","+o.getClass());
        Integer parseInt = Integer.parseInt(o2);
        System.out.println("map.contains(key): "+d+","+ parseInt.getClass());


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
