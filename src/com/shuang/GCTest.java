package com.shuang;

import java.util.ArrayList;
import java.util.List;

//-Xms9m -Xmx9m -XX:+PrintGCDetails
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        List<String> list = new ArrayList<>();
        String a = "ls";
        try {
            while (true) {
                list.add(a);
                a += a;
                i++;
            }
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
