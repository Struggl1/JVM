package com.shuang;


/**
 * 进行回收对象的过程：
 *      一个对象的finalize()方法只能被调用一次
 *      判断一个对象是否能够被回收，至少经历两次标记过程
 *          1、如果对象没有到GC Roots没有引用链，进行第一次标记，
 *          2、判断该对象是否有必要执行finalize()方法。
 *              如果对象没有重写finalize或者是对象应执行过一次finalize方法。对象被判定为不可触及的。
 *              如果对象重写了finalize方法，并且还没被执行过。那么对象会被插入到F_queue队列中，由低优先级的finalizer线程去执行finalize方法
 *              finalize（）方法是对象逃脱死亡的最后机会，在执行finalize()方法时，如果对象与GCRoots中任意一个对象建立了联系，那么该对象将会复活，
 *              但是如果再次失去联系，那么直接被判定为不可触及对象。
 *
 *
 *
 */
public class CanReliveObj {
    public static CanReliveObj obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用finalize方法");
        obj = this;
    }

    public static void main(String[] args) {
        try {
            obj = new CanReliveObj();
            obj = null;
            System.gc();
            System.out.println("第一次GC");
            Thread.sleep(2000);
            if(obj == null){
                System.out.println("obj is dead");
            }else{
                System.out.println("obj is still alive");
            }

            System.out.println("第二次GC");
            obj = null;
            System.gc();
            Thread.sleep(2000);
            if(obj == null){
                System.out.println("obj is dead");
            }else{
                System.out.println("obj is still alive");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
