package com.example.multithreading.threads.basics;
public class MyRunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("Current Thread " + Thread.currentThread().getName() + " Starts");
        try {
            if(Thread.currentThread().getName().startsWith("Daemon"))
                Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Current Thread " + Thread.currentThread().getName() + " Ends");
    }
}
