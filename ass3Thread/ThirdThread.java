package com.session6.ass3Thread;

public class ThirdThread extends Thread{
	public void run(){
		try{
			Thread.sleep(200);
			System.out.println("Third thread has maximum priority");
		} catch (InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
