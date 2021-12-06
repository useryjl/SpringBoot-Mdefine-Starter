package com.yjl.system.thread;

/**
 * @author yjl
 * @Description
 * @create 2021-11-30
 */
public class Ticket  extends Thread{
    //共享数据 存在线程安全问题
    private static Integer tickets=100;

    @Override
    public void run() {
      synchronized (this){
          //多线程要执行的代码
          while (true){
              if (tickets>0){
                  System.out.println(Thread.currentThread().getName()+","+tickets--);
              }
          }
      }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();
        ticket.start();
        ticket1.start();
        ticket2.start();
        ticket3.start();
    }
}
