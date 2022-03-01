package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1.size());
		
		//getting Iterator from ArrayList to traverse elements
		Iterator<Integer> i = a1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
