/*
 * Write an example, which shows the usage of java.util.HashSet.iterator(). 
 * Print all the elements stored in collection. 
 */
package com.session6.ass2PrintSetElment;
import java.util.*;

public class PrintSetElment {
public static void main (String[] arg){
	HashSet<String> hset = new HashSet<String>();
	hset.add("This ");
	hset.add("is ");
	hset.add("a ");
	hset.add("HashSet");
	
	for (String str : hset){
		System.out.println(str);
	}
	
}
}
