package com.yjl.system;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class StringTest {
    public static void main(String[] args) {
        String name="12212212121";
        String[] split = name.split(",");
        System.out.println(split);//{"123456789"}
        //for (String s:split){
        //    System.out.println("s:"+s);
        //}

        for (int i=0;i<split.length;i++){
            System.out.println(split[i]);
            //int i1 = Integer.parseInt(split[i]);
            //System.out.println(i1);
        }


        //构建空字符串
        String s=new String();
        System.out.println("s:"+s);

    //用已知字符串构造字符串
        String s1=new String("abcd");
        System.out.println(s1);


    //
        char[] chars=new  char[]{'a','b'};
        String s2=new String(chars);
        System.out.println(s2);

    //    concat连接字符串
        String concat = s1.concat(s2);
        System.out.println(concat);

    //字符串替换
        String s3=new String("1-2-3");
        String replace = s3.replace("-", "");
        System.out.println(replace+"replace:");

    //    trim
        String s4=" AB C ";
        System.out.println(s4.length());
        System.out.println(s4.trim().length());

    //Split 字符串分解
        String s5="12-@ADA21@-121";
        String[] strings = s5.split("-");
        for (String s6:strings){
            System.out.println(s6);
        }

    //    parseint  valueof
        String s6=new String("123");
        System.out.println(s6.getClass()+","+s6);

        int i = Integer.parseInt(s6);
        System.out.println(i);

        Integer integer=4;
        System.out.println(integer.getClass()+","+integer);

        String s7 = String.valueOf(integer);
        System.out.println(s7.getClass()+","+s7);
    }

}
