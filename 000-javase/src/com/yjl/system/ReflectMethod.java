package com.yjl.system;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yjl
 * @Description     反射读取注解的值
 *  框架时使用注解会在类动态运行时，解析其上的注解属性和其值
 *  使用反射机制创建对象  clazz.newInstance();
 * @create 2021-11-30
 */
public class ReflectMethod {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.yjl.system.UseAnnotation");
            //得到父类 默认继承Object类
            Class<?> superclass = clazz.getSuperclass();
            System.out.println(superclass);

            //利用反射机制创建对象
            Object o = clazz.newInstance();
            if (o instanceof UseAnnotation){
                UseAnnotation useAnnotation=(UseAnnotation)o;
                String test3 = useAnnotation.test3();
                System.out.println(test3);

            }

            //获取类中的所有 "属性"
            Field[] fields = clazz.getDeclaredFields();
            for (Field field:fields){
                System.out.println(field);
            }

            Method declaredMethod = clazz.getDeclaredMethod("test1");
            boolean methodAnnotationPresent = declaredMethod.isAnnotationPresent(MyAnnotation.class);

            //判断该方法上是否存在注解
            if (methodAnnotationPresent){
                //有注解拿到注解
                MyAnnotation annotation = declaredMethod.getAnnotation(MyAnnotation.class);
                //获取注解值
                String value = annotation.value();
                //获取注解的方法名
                String methodName = declaredMethod.getName();
                //封装dto
                List<KeyValueDto> list=new ArrayList<>();
                list.add(new KeyValueDto(methodName,value));

                for (KeyValueDto keyValueDto:list){
                    System.out.println(keyValueDto);
                }
            }else {
                System.out.println("该方法上无注解");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
