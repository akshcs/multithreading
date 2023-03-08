package com.example.multithreading.threads.daemon;

import com.example.multithreading.threads.basics.MyRunnableImpl;
import com.example.multithreading.threads.basics.MyThread;

public class DaemonThreadDriver {
    public void run(){
        Thread thread1 = new MyThread("UserThread");
        Thread thread2 = new Thread(new MyRunnableImpl(), "DaemonThread");
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}
