package com.session6.ass3Thread;

public class SecondThread extends Thread{
	public void run(){
		try{
			Thread.sleep(200);
			System.out.println("Second thread has normal priority");
		}catch (InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}

}
