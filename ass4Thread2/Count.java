/*
 * Create a program to print the count from 1 to 10 inside run() method of Thread. 
 * Check for live status of Main Thread using while loop. 
 * Call start() method to start executing the thread object within the User defined thread class constructor. 
 */

package com.session6.ass4Thread2;

public class Count {
public static void main(String[] arg){
	Thread thread1 = new Thread(new CountRunner(), "thread1");
	thread1.start();
	
	if (Thread.currentThread().isAlive()){
		System.out.println("Main is still alive");
			
	}
}
}
