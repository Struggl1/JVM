package com.shuang;

public class LocalVariablesTest {
    public void test1(){
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }

        //变量c使用之前已经销毁的变量b的占据的slot的位置
        int c = a+1;
    }

    /**
     * 变量的分类
     *      按照数据类型分类：
     *          基本数据类型，
     *          引用数据类型
     *      按照在类中的位置分：
     *          1成员变量：在试用前，都经过默认初始化赋值
     *              类变量：linking的prepare阶段， --- 》initial阶段：给类变量显式赋值，即静态代码块赋值
     *              实例变量：随着对象的创建，会在堆空间中分配实例变量空间，并进行默认赋值。
     *          2局部变量:在试用前必须要进行显示赋值，否则编译不通过
     *
     *
     *
     */
}
