package com.shuang;

/**
 * -Xms600M -Xmx600M -XX:NewRatio=5
 * 设置伊甸园区和老年代的比例是1:2，
 * Eden和另外两个survivor空间所占比例为8:1:1 -XX:SurvivorRatio=8
 * -XX:-UseAdaptiveSizePolicy :关闭自适应的内存分配策略、
 * 使用-Xmn设置新生代最大内存的大小
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("打酱油");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
