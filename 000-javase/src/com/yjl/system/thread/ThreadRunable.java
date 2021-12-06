package com.yjl.system.thread;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class ThreadRunable implements Runnable {

    private int tickets=200;

    @Override
    public void run() {
        //多线程要执行的代码
        while (true){
            if (tickets>0){
                System.out.println(Thread.currentThread().getName()+","+tickets--);
            }
        }
    }
    public static void main(String[] args) {
        ThreadRunable threadRunable = new ThreadRunable();
        Thread thread1 = new Thread(threadRunable);
        Thread thread2 = new Thread(threadRunable);
        Thread thread3 = new Thread(threadRunable);
        Thread thread4 = new Thread(threadRunable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
