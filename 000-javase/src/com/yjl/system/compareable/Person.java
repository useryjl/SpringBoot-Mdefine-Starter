package com.yjl.system.compareable;

/**
 * @author yjl
 * @Description
 * @create 2021-12-06
 */
public class Person implements Comparable<Person>{
   private int age;
   private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    @Override
    public int compareTo(Person o) {
        if (this.age>o.age){
            return 1;
        }else if (this.age<o.age){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
