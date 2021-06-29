package com.shuang;

public class DaedThreadTest {
    public static void main(String[] args) {
        Runnable r = ()->{
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread d = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };

        new Thread(r,"线程1").start();
        new Thread(r,"线程2").start();
    }
}


class DeadThread{
    static {
        if (true) {
            System.out.println(Thread.currentThread().getName()+"初始化当前类！");
//            while (true){
//
//            }
        }
    }
}
