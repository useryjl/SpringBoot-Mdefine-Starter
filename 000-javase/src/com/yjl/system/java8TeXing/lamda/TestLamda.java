package com.yjl.system.java8TeXing.lamda;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

/**
 * @author yjl
 * @Description
 * @create 2021-12-06
 */
public class TestLamda {
    public static void main(String[] args) {
        String[] strings=new String[]{"1","2","3"};
        List<String> list = Arrays.asList(strings);
        list.forEach((s)-> System.out.println(s));
        list.forEach(System.out::println);
    }
}
