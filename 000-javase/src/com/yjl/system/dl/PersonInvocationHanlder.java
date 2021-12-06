package com.yjl.system.dl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yjl
 * @Description
 * @create 2021-12-01
 */
public class PersonInvocationHanlder implements InvocationHandler {
    private Object object;
    //被代理对象，目标对象

    //构造方法注入被代理对象
    public PersonInvocationHanlder(Object object) {
        this.object = object;
    }

    //invoke(): 当我们通过代理类的对象，调用某个方法时，就会自动的调用invoke();将被代理类要执行的某个方法的功能就声明在invoke()中
    //         *
    //         * @param proxy 就是代理对象，newProxyInstance方法的返回对象
    //         * @param method 指代的是我们所要调用真实对象的某个方法的Method对象
    //         * @param args 指代的是调用真实对象某个方法时接受的参数
    //         * @return 返回结果
    //         * @throws Throwable 抛出一个异常


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //增强功能1
        System.out.println("在执行原方法之前，增加的功能1：这是代理类的invoke方法");
        //原本功能
        Object res = method.invoke(object, args);
        //增强功能2
        System.out.println("在执行原方法之后，增加的功能2：这是代理类的invoke方法");
        //返回调用原方法的结果
        return res;
    }
}
