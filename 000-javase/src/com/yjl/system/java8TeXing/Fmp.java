package com.yjl.system.java8TeXing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author yjl
 * @Description
 * @create 2021-12-06
 */
public class Fmp {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"->>>run execute");
            }
        });
        thread.start();

        /*
        * lamda 表达式
        * **/
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"->>>123456")).start();


        /**/
        Integer[] ints=new Integer[]{1,12,12,5,5,65,4};
        List<Integer> list = Arrays.asList(ints);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        System.out.println(list);



        //lamda表达式  （参数）-> 返回值表达试
        Integer[] intss=new Integer[]{5565,12,12,5,5,65,4};
        List<Integer> lists = Arrays.asList(intss);
        Collections.sort(lists,(Integer o1,Integer o2)->o1-o2);
        System.out.println(lists);
    }
}
