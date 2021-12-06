
package com.yjl.system.dl;

public class Teacher implements Person {
    @Override
    public String getName() {
        System.out.println("这是Teacher类的getName()方法");
        return "王老师";
    }

    @Override
    public String eat(String food) {
        System.out.println("这是Teacher类的eat()方法");
        return food;
    }
}
