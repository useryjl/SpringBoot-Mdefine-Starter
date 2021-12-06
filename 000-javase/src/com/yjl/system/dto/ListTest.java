package com.yjl.system.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class ListTest {
    public static void main(String[] args) {
        //lIST中存的是map集合
        List<Map<String,Object>> listMap=new ArrayList<>();
        Map<String,Object> mapNum=new HashMap<>();
        Map<String,Object> mapNum1=new HashMap<>();
        mapNum.put("1",1);
        mapNum.put("2",2);
        mapNum1.put("3",3);
        mapNum1.put("4",4);
        //
         listMap.add(mapNum);
         listMap.add(mapNum1);
        System.out.println(listMap);
        //for (Map<String, Object> mapList:listMap){
        //    System.out.println(mapList);
        //}


        List<KeyValueDto> list=new ArrayList();
        list.add(new KeyValueDto("error",404));
        KeyValueDto dto = list.get(0);
        System.out.println(dto);

        Map<String,Object> map=new HashMap<>();
        Map<String,Object> map2=new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map2.put("3",3);
        map2.put("4",4);
    //   遍历map集合
        System.out.println("遍历map集合");
        for (String s:map.keySet()){
            System.out.println("keySet的key:"+s);
            Object o = map.get(s);
            System.out.println("value:"+o);
        }
    }
}
