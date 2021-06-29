package com.shuang;

public class ClassLoaderTest {

    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.getClass().getClassLoader());//null 启动类加载器，Bootstrap 加载出来为null
        //对于用户自定义类来说默认使用系统类加载器进行加载
        ClassLoaderTest classLoader = new ClassLoaderTest();
        System.out.println(classLoader.getClass().getClassLoader());//AppClassLoader  应用程序类加载器
        System.out.println(classLoader.getClass().getClassLoader().getParent());//扩展类加载器
        System.out.println(classLoader.getClass().getClassLoader().getParent().getParent());//null 启动类加载器，Bootstrap 加载出来为null

        System.out.println(classLoader.getClass().getClassLoader() == ClassLoader.getSystemClassLoader());

        //String类使用引导 类加载器进行加载》》》java的核心类库使用引导类加载器进行加载
        System.out.println(String.class.getClassLoader());
    }
}
