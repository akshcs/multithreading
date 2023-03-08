package com.example.multithreading.threads.basics;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    public MyThread() {
    }

    @Override
    public void run(){
        System.out.println("Current Thread " + Thread.currentThread().getName() + " Starts");
        System.out.println("Current Thread " + Thread.currentThread().getName() + " Ends");
    }
}
