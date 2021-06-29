package com.shuang;

import java.util.ArrayList;
import java.util.Random;

/**
 * vm: -Xms600M -Xmx600M
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> objects = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(200);
            }catch (Exception e){
                e.printStackTrace();
            }
            objects.add(new Picture(new Random().nextInt(1024*1024)));
        }
    }
}


class Picture{
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}

