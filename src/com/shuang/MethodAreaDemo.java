package com.shuang;

/**
 * 设置方法区大小参数的默认值
 * jdk以前：
 * -XX:PermSize=100M -XX:MaxPermSize=100M
 *
 * jdk8及以后：-XX:MetaspaceSize=100M   -XX:MaxMetaspaceSize=100M
 * jinfo -flag MetaspaceSize
 *
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
