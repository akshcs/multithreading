package com.example.multithreading;

import com.example.multithreading.threads.basics.BasicThreadDriver;
import com.example.multithreading.threads.basics.MyRunnableImpl;
import com.example.multithreading.threads.basics.MyThread;
import com.example.multithreading.threads.daemon.DaemonThreadDriver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultithreadingApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MultithreadingApplication.class, args);
		new BasicThreadDriver().run();
		new DaemonThreadDriver().run();
	}

}
