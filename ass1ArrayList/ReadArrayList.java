/*
 * Write an example for reading all elements from ArrayList by using Iterator.
 * Use next method of Iterator class to get ArrayList element values using while loop. 
 */
package com.session6.ass1ArrayList;
import java.util.*;

public class ReadArrayList {
public static void main(String[] arg){
	ArrayList myArrayList = new ArrayList();
	myArrayList.add("This ");
	myArrayList.add("is ");
	myArrayList.add("fun");
	myArrayList.add("fun");
	
	System.out.println("Original string is: This is run.");
	
	Iterator itr = myArrayList.iterator();
	while (itr.hasNext()){
		System.out.println(itr.next());
		
	}
}
}
