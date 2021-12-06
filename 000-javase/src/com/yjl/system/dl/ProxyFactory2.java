package com.yjl.system.dl;

import java.lang.reflect.Proxy;

public class ProxyFactory2 {
    //创建一个静态方法，用来统一获取各个类的代理类
    public static Object getProxyInstance(Object obj){//调用方法的时候需要注入一个被代理类对象obj
        //创建一个InvocationHandler类的实现类对象，作为增强功能类（就是上面创建PersonInvocationHandler类）
        PersonInvocationHanlder invocationHandler=new PersonInvocationHanlder(obj);//obj:  指代被代理的类的对象

        /**
         * newProxyInstance(ClassLoader loader,Class<?>[] interfaces,reflect.InvocationHandler h):返回一个类的代理类
         *  newProxyInstance()方法的三个参数：
         *   loader:　　    一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载。就是获取一个类加载器。
         *          （一般我们自己写的类，无论与代理类或被代理类有没有关系，通过getClassLoader()方法获取的类加载器，都是AppClassLoader这个系统类加载器）
         *   interfaces:　　一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
         *              （至少必须包含一个与被代理类公共的接口，这里就是包含Person接口）
         *    h:　　         一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
         */
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),invocationHandler);
    }
}
