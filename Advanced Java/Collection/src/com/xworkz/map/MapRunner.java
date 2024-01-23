package com.xworkz.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
	
		Map<String, Integer> map= new HashMap<String, Integer>();
			
		map.put("Rahul", 28);
		map.put("karan", 29);
		map.put("nadeem", 32);
		map.put("nadeem", 5);
		map.put("Irfan", 27);
		
		System.out.println("nadeem age is : "+map.get("nadeem"));
		
		Set<String> mapkey=	map.keySet();
		
		Iterator<String> itr= mapkey.iterator();
		while (itr.hasNext()) {
			String string =itr.next();
			System.out.println("Keys Using Iterator : "+string);
		}
		System.out.println("------------------------");	
		for (String string1 : mapkey) {
			
			System.out.println("Keys Using forEach loop : "+string1);
		}
		System.out.println("------------------------");	
		
		mapkey.forEach(k->System.out.println("Keys Using forEach() : "+k));
		
		System.out.println("---------------------------");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println("Name : "+entry.getKey()+ " and Age " +entry.getValue()+" using getKey() And getValue() method in forEach loop ");
			
		}
		System.out.println("---------------------------");
		Set<Entry<String, Integer>> entry= map.entrySet();
		Iterator<Entry<String, Integer>> itr1= entry.iterator();
		while (itr1.hasNext()) {
			Entry<String, Integer> entry1= itr1.next();
			System.out.println("Name And Age using iterator : "+entry1);
			
		}
	}

}
