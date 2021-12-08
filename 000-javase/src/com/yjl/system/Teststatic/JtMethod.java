package com.yjl.system.Teststatic;

import org.omg.PortableInterceptor.INACTIVE;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yjl
 * @Description
 * @create 2021-12-06
 */
public class JtMethod {
    int c;
    int d;

    public JtMethod() {
        System.out.println("c:"+c);
        System.out.println("d:"+d);
    }

    public JtMethod(int c, int d, int a) {
        this.c = c;
        this.d = d;
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        JtMethod.b = b;
    }

    public static void print(){
        System.out.println("static method");
        //System.out.println(a);  //无法从静态上下文中引用非静态 变量 a
        System.out.println(b);
    }

    /*泛型方法*/
    public static <E>void printArray(E[]  array){
        for (E e:array){
            System.out.println(e);
        }
    }


    int a;
    static int b=0;

    //Error:(19, 36) java: 无法从静态上下文中引用非静态 变量 a
    /*
    * 静态在类加载的时候执行，放在内存中、而实例变量只有在创建对象的时候赋值；
    *
    * */
    public static void main(String[] args) {
        JtMethod jtMethod = new JtMethod();


        //Byte Short Integer Longer 常量池中有缓冲区 [-128,127]  默认从这取值
        Integer integer=33; //以上四种类型 在字符串常量池中默认创建了值，范围在-128~127
        Integer integer1=new Integer(33);
        System.out.println("integer==integer1:"+(integer==integer1));   //false

        Integer integer2=55;
        Integer integer3=55;
        System.out.println("integer2==integer3:"+(integer2==integer3));



        /*泛型方法调用*/
        Integer[] array ={1,4,9};
        String array2[]={"hello","test","world"};
        JtMethod.printArray(array);
        JtMethod.printArray(array2);

        String pwd="123456";
        boolean equals = pwd.equals("123456");
        System.out.println(equals);
        System.out.println(pwd.hashCode());
        System.out.println("123456".hashCode());

        // Java泛型提供了编译时期的类型检查机制
        // list.add("ss");
        List<Integer> list=new ArrayList<>();
        list.add(1);

        //伪泛型机制  在运行时期被搽除  反射
        Class<? extends List> listClass = list.getClass();
        try {
            Method method = listClass.getDeclaredMethod("add", Object.class);
            method.invoke(list, "a");
            System.out.println("list:"+list);  // list:[1, a]

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        JtMethod.print();
        System.out.println(JtMethod.b);
        /*
        System.out.println(JtMethod.a);
        //内存中还不存在这个变量
        */
    }
}
