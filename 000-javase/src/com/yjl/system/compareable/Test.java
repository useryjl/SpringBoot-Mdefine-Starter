package com.yjl.system.compareable;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author yjl
 * @Description
 * @create 2021-12-06
 */
public class Test {
    public static void main(String[] args) {
        //treemap会进行排序
        TreeMap<Person,String> map=new TreeMap<>();
        map.put(new Person(22,"张三"),"zhangsan");
        map.put(new Person(27,"李四"),"lisi");
        map.put(new Person(8,"ww"),"ww");
        /*map的keyset方法，将map集合转为set集合 存储map的key*/
        Set<Person> people = map.keySet();
        for (Person person:people){
            System.out.println(person);
            System.out.println(person.getAge()+"-"+person.getName());
        }
        /*将String类型数组转换为list集合*/
        String[] string=new String[]{"1","2","3","4","5"};
        List<String> list = Arrays.asList(string);
        System.out.println(list);

        /*集合转数组*/
        String[] strings = list.toArray(new String[0]);
        for (String s:strings){
            System.out.println(s);
        }

        System.out.println(Test.class.getClassLoader());
        System.out.println(Test.class.getClassLoader().getParent());
        System.out.println(Test.class.getClassLoader().getParent().getParent());

    }
}
