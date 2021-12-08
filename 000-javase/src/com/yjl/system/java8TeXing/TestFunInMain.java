package com.yjl.system.java8TeXing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yjl
 * @Description
 * @create 2021-12-06
 */
public class TestFunInMain {
    void lamndaFor() {
        List<String> strings = Arrays.asList("1", "2", "3");
        //传统foreach
        for (String s : strings) {
            System.out.println(s);
        }


        //Lambda foreach
        strings.forEach((s) -> System.out.println(s));
        //or
        strings.forEach(System.out::println);
        //map
        Map<Integer, String> map = new HashMap<>();
        map.forEach((k,v)->System.out.println(v));
    }



    public static void test(TestFunctionalInterface i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        TestFunInMain.test(()-> System.out.println("my define function interface"));
    }
}
