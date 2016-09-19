package com.session6.ass4Thread2;

public class CountRunner implements Runnable{
	
	Thread runner;
	public CountRunner(){
		
	}
	
	public CountRunner(String threadName){
		runner = new Thread(this,threadName);
		System.out.println(runner.getName());
		}
	public void run(){
		for (int i=1;i<=10;i++)
		{
			System.out.println(i+"looping in thread "+ Thread.currentThread().getName());
		}
	}

}
