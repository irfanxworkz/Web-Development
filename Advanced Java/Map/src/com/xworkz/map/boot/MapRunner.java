package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
		
		Map<String, Long> aadhar = new HashMap<String, Long>();
		
		aadhar.put("Irfan Khan", 822660222534L);
		aadhar.put("Rahul Sharma", 658975325478L);
		aadhar.put("Karan Mishra", 698567532459L);
		aadhar.put("Kuldeep", 968542365899L);
		aadhar.put("Nadeem Pasa", 698654213259L);
		aadhar.put("Mosam Khan", 5625478965238L);
		aadhar.put("Wajib Ali", 568925456328L);
		aadhar.put("Saif Ali", 865975324569L);
		aadhar.put("Mubarik Khan", 8654789652345L);
		aadhar.put("Yogendra Chajera", 256458975632L);

		System.out.println("Total Size of Aadhar : "+aadhar.size());
		
		System.out.println("-----------------------------------");
		Set<String> aadharKey= aadhar.keySet();
		aadharKey.forEach(k->System.out.println("Key :"+k));
		
		System.out.println("------------------------------------");
		Collection<Long> addharValues= aadhar.values();
		addharValues.forEach(v->System.out.println("Values is : "+v));
		
		}
		}
