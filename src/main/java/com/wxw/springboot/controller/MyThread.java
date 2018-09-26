package com.wxw.springboot.controller;

public class MyThread extends Thread {
    private static int num = 0;

    public MyThread(){
        num++;
    }

    @Override
    public void run(){
        System.out.println("主动创建的第"+num+"个线程");
    }

    public static void main(String[] args)  {
        MyThread thread = new MyThread();
        thread.start();
        MyThread thread2 = new MyThread();
        thread2.start();
    }
}
