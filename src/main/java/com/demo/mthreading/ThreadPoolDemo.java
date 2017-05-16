package com.demo.mthreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ExecutorService executorService=Executors.newFixedThreadPool(5);
        for (int i=0;i<10;i++){
        	Runnable runnable=new MyRunnable1("myworkerThread:"+i);
        	executorService.execute(runnable);
        }
        
        executorService.shutdown();
        
        if(!executorService.isTerminated()){}
        	System.out.println("All requests completed successfully");
        
	}

}
