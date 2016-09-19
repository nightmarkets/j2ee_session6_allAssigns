package com.session6.ass3Thread;

public class FirstThread extends Thread{
	public void run (){
		try{
			Thread.sleep(200);
			System.out.println("First thread has minimum priority");
		} catch (InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}

}
