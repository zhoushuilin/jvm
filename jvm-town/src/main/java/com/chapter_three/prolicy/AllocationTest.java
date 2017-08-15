package com.chapter_three.prolicy;

/**
 * Created by lenovo on 2017/8/15.
 */
public class AllocationTest {

    public static final int _1MB = 1024 * 1024;

    /**
     * 测试：对象优先分配在Eden区
     */
//    public static void TestAllocation(){
//        byte[] allocation1,allocation2,allocation3,allocation4;
//        allocation1 = new byte[2 * _1MB];
//        allocation2 = new byte[2 * _1MB];
//        allocation3 = new byte[2 * _1MB];
//        allocation4 = new byte[4 * _1MB];
//    }

    /**
     * 大对象直接进入老年代-XX:PretenureSizeThreshold
     */
//    public static void testPretenureSizeThreshold(){
//        byte[] allocation;
//        allocation = new byte[4 * _1MB];
//    }

    public static void testTenuringThreshold(){
        byte[] allocation1,allocation2,allocation3;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }

    public static void main(String[] args){
//        AllocationTest.TestAllocation();
//        AllocationTest.testPretenureSizeThreshold();
        AllocationTest.testTenuringThreshold();
    }
}
