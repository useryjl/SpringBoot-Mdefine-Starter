package com.yjl.system.java8TeXing;

/**
 * @author yjl
 * @Description
 * @create 2021-12-06
 */
public interface T1 {
    //接口中方法默认public abstract的
    public void t1();

    /*java8新特性 使用default修饰符修饰方法  类实现接口的时候无需实现此方法*/
    default void t2(){


    }
}
