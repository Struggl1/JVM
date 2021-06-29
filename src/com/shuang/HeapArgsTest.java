package com.shuang;

/**
 * -XX:+PrintFlagsInitial :查看所有参数的默认初始值
 * -XX:+PrintFlagsFinal : 查看所有参数的最终值，（可能会存在修改，不再是初始值）
 * -Xms:初始对空间内存（默认为堆空间内存的1/64）
 * -Xmx:最大堆空间内存，（默认物理内存的1/4）
 * -Xmn:设置新生代的大小初始值即最大值
 * -XX: NewRatio:配置新生代和老年代在对空间中的结构占比
 * -XX: SurvivalRatio:设置新生代中Eden和s1、s0的占比
 * -XX:MaxTenuringThreshold 设置新生代垃圾的最大年龄
 * -XX:+PrintGCDetails 输出详细的GC日志
 * -XX:+PrintGC 简要信息
 * —XX:HandlerPromotionFailure：是否设置空间分配担保
 */
public class HeapArgsTest {
}
