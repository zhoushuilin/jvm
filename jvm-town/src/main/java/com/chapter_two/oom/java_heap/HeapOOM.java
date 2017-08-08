package com.chapter_two.oom.java_heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/8/8.
 */
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<OOMObject>();

        while(true){
            list.add(new OOMObject());
        }
    }
}
