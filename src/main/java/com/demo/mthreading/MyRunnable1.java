package com.demo.mthreading;

public class MyRunnable1 implements Runnable{
	String name;
	public MyRunnable1(String name){
		this.name=name;		
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Start Thread:"+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ended Thread:"+name);
	}

}
