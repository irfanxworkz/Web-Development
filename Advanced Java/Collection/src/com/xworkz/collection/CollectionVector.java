package com.xworkz.collection;

import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(4);
		
		 v.add(7); v.add(6); v.add(4); v.add(7); v.add(6); v.add(4); v.add(7);
		  v.add(6); v.add(4); v.add(7); v.add(6); v.add(4); v.add(7); v.add(6);
		  v.add(4); v.add(7); v.add(6); v.add(4); v.add(7); v.add(4); v.add(7);
		  v.add(6);
		 
		System.out.println("capacity of Array: "+v.capacity());
		
		System.out.println("======================================");
		
		v.remove(1);
		for(int i: v)
		{
			System.out.println(i);
		}
		
		System.out.println("=======================");

		
	}

}
