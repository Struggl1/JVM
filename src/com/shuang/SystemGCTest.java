package com.shuang;

public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();
        //提醒JVM的垃圾回收期进行GC，但是并不确定马上回进行GC
        System.gc();// ==Runtime.getRuntime().gc();

        System.runFinalization();//强制调用失去引用的对象的finalize() 方法
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用了GC");
    }
}
