package com.shuang;

public class StringTest {
    /**
     * jdk 1.6以前，String常量是放在字符串永久代中的
     * 1.7之后移到了堆空间中
     *
     */
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = new String("123");
        System.out.println(s1 == s2);//false
        String s3 = "1"+"2"+"3";
        System.out.println(s1 == s3);//true  编译器优化，相当于“123”
        String temp1 = "1";
        String s4 = temp1+"23";
        System.out.println(s1 == s4);//false
        // 如果拼接符号的前后出现了变量，那么就相当于在堆空间中new String()对象
        // 拼接符两边出现了变量，底层实现使用StringBuilder进行实现的，最后在进行toSting（），toString方法约等于new String()方法
        //intern():判断字符串常量池中是否有需要的值，如果有直接返回值得地址，没有的话则在字符串常量池转加载一份
        String s5 = s4.intern();
        System.out.println(s1 == s5);//true


        final String temp2 = "a";
        final String temp3 = "b";
        String temp4 = "ab";
        System.out.println(temp2 + temp3 == temp4);//true 加上final修饰之后有变量成为常量，会进行编译期优化，使用非StringBuilder方式

        //针对于final修饰的类，方法，基本数据类型，引用数据类型的结构时，可以使用上final尽量使用final
        //使用StringBuilder字符串的速度是远高于使用+进行拼接字符串的方式，
        // 因为字符串每一次拼接都需要创建一个StringBuilder对象，然后在toString，相当于创建了n多个对象
        //StringBuilder优化空间：
        //      时机开发过程中，如果能确定前前后后需要拼接的字符串的长度，可以使用StringBuilder的构造器，new StringBuilder(max)
    }
}
