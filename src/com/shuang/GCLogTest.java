package com.shuang;

import java.util.ArrayList;

public class GCLogTest {
    public static void main(String[] args) {
        ArrayList<byte[]> objects = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            byte[] bytes = new byte[1024 * 100];
            objects.add(bytes);
        }
    }
}
