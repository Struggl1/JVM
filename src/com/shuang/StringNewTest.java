package com.shuang;

public class StringNewTest {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        String s1 = "1";
        System.out.println(s == s1);//false
        //s在创建的时候在对空间中new了一个对象，同事也在字符串常量池中添加了1，一共创建了两个对象
        //s指向的是堆空间的地址，s1指向的是字符串常量池中的字符串所以为false

        String s2 = new String("a") + new String("b");
        s2.intern();
        String s3 = "ab";
        System.out.println(s2 == s3);//true
        //s2在创建过程中使用了字符串拼接，Stringbuilder，一共创建了5个对象，最后调用了toString方法，在字符串常量池中是没有ab的
        //调用intern方法，在字符串常量池中将ab指向堆空间中的s2
        //后面新建的ab指向字符串常量池，最后指向堆空间的ab对象
    }
}
