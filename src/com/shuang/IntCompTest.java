package com.shuang;

/**
 * 解释器 -Xint:7578
 * JIt编译器 -Xcomp:2341
 * 混合模式 -Xmixed:1172
 */
public class IntCompTest {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        testPrimeNum(1000000);
        long end = System.currentTimeMillis();
        System.out.println(end - l);
    }

    public static void testPrimeNum(int count){
        for (int i = 0; i < count; i++) {
            label:for (int j = 2;j<=100;j++){
                for(int k = 2;k<= Math.sqrt(j);k++){
                    if(j%k == 0){
                        continue label;
                    }
                }
            }
        }
    }
}
