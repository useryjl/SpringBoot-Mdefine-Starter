package com.yjl.system.thread;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class MyThread extends Thread{
    private String name;

    public MyThread(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        for (int i=0;i<=40;i++){
            System.out.println(i+"->>>"+name);
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread("YJL");
        MyThread hh = new MyThread("hh");

        thread.start();
        hh.start();

    }
}
