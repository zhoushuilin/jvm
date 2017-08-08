package com.chapter_two.stack.java_stack;

/**
 * Created by lenovo on 2017/8/8.
 */
public class JavaStackSOF {
    private int stackLength=1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args){
        JavaStackSOF javaStackSOF = new JavaStackSOF();
        try{
            javaStackSOF.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length：" + javaStackSOF.stackLength);
            e.printStackTrace();
        }
    }
}
