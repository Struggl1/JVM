package com.shuang;

import java.util.Date;

public class StackError {

    private static int x = 1;

    //使用-Xss设置虚拟机栈内存的大小
    public static void main(String[] args) {
        System.out.println(x++);
        main(args);
    }

    public static void testStatic(){
        StackError stackError = new StackError();
        Date date = new Date();
        int count = 10;
        System.out.println(count);
    }
}
