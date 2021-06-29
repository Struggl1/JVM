package com.shuang;

import java.nio.ByteBuffer;
import java.util.Scanner;

public class BufferTest {
    public static final int buffer = 1024*1024*100;

    public static void main(String[] args) {
        //直接分配本地的内存空间
        //访问直接内存的速度是要优于直接访问java堆的速度
        //nio速度快的原因是少了属于copy的过程
        //直接内存是在堆空间之外的，是不受-Xms -Xmx设置大小的影响的，受限于操作系统给出内存的大小的限制
        //通过设置-XX: MaxDirectMemorySize=10M 设置直接内存的大小
        ByteBuffer allocate = ByteBuffer.allocate(buffer);
        System.out.println("直接内存分配完毕");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        String 是= "";

        System.out.println("直接内存 释放");
        allocate = null;
        System.gc();
        scanner.next();
    }
}
