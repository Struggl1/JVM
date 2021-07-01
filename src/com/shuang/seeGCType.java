package com.shuang;

import java.util.ArrayList;
/*
查看使用的垃圾回收器：
    -XX:+PrintCommandLineFlags

    设置Serial回收器,同时老年代设置Serial old GC(限定在单核的 场景下才回会去使用，一般在java web的应用场景下是不会使用串行垃圾收集器的)
    -XX:+UseSerialGC

    ParNew 收集器为Serial收集器的多线程版本(只能处理新生代)
    -XX:+UseParNewGC 开始parNewGC，在jdk9之后被移除
    -XX:ParallelGCThreads:限制线程数量，默认和cpu数量是相同的

    CMS:低延迟垃圾收集器，但是会产生内存碎片化，因为是并发收集的，会占用一部分的线程，导致吞吐量下降。
    -XX:+UseConcMarkSweepGC  表明老年代使用cmsGC，同时年轻代出发ParNewGC
    -XX:CMSlintiatingOccupanyFraction:设置堆内存使用率的阈值，一旦达到该阈值，便开始进行回收。jdk5及以前的版本默认为68%，jdk6以后默认为92%

 */
public class seeGCType {
        public static void main(String[] args) throws InterruptedException {
        ArrayList<String> strings = new ArrayList<>();
        int x = 1;
        while (true) {
            Thread.sleep(1000);
            strings.add(x++ +"");
        }
    }
}
