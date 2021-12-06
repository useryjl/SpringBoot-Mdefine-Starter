package com.yjl.system.dl;

public class TestProxyFactory2 {
    public static void main(String[] args) {
        //创建被代理的类
        Teacher teacher=new Teacher();
        //获取teacher类的动态代理类
        /**
         *  获取的动态代理类之后，必须 强制转换 为  与被代理类公共接口的类型：
         *          例如：下面的 Person接口，而不是teacher类型或者student类型
         */
        Person proxyInstance = (Person)ProxyFactory2.getProxyInstance(teacher);
        System.out.println("我们学校最漂亮的老师是："+proxyInstance.getName()+proxyInstance);
        System.out.println("-------------------------");
        System.out.println("她晚饭就吃："+proxyInstance.eat("香蕉")+proxyInstance);
        System.out.println("-------------------------");

    }
}
