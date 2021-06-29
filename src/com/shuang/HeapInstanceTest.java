package com.shuang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * -Xms600m -Xmx600m
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024*200)];
    public static void main(String[] args) {
        List<HeapInstanceTest> list = new ArrayList<>();
        list.add(new HeapInstanceTest());
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
