/*
 *  Write a program which has three thread. 
 *  Each having different value of priority: 
 *  Thread A (minimum), Thread B (normal), and Thread c (maximum). 
 */
package com.session6.ass3Thread;

public class ThreadPriority {
public static void main (String[] args){
	FirstThread worker1 = new FirstThread();
	worker1.setPriority(Thread.MIN_PRIORITY);
	
	SecondThread worker2 = new SecondThread();
	worker2.setPriority(Thread.NORM_PRIORITY);
	
	ThirdThread worker3 = new ThirdThread();
	worker3.setPriority(Thread.MAX_PRIORITY);
	
	worker1.start();
	worker2.start();
	worker3.start();
	
}
}


