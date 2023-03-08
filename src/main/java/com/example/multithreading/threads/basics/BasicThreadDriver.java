package com.example.multithreading.threads.basics;

public class BasicThreadDriver {
    public void run(){
        System.out.println("Current Thread " + Thread.currentThread().getName() + " Starts");
        Thread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnableImpl());
        thread1.start();
        thread2.start();
        System.out.println("Current Thread " + Thread.currentThread().getName() + " Ends");
    }
}
