package com.xworkz.map.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		
		map.put("Java", 20);
		map.put("C++", 45);
		map.put("Unix", 67);
		map.put("Mac", 26);
		map.put("Why this Kolavari", 93);

		Map<String, Integer> sortedMap = map.entrySet()
				.stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(sub, code) -> sub,
						LinkedHashMap :: new
						));
		System.out.println("Sorting values desending order");
		sortedMap.forEach((tech,code)->System.out.println(tech+" ==== "+code));
		
		System.out.println("Total Size : "+map.size());
		Set<Entry<String, Integer>> entry= map.entrySet();
		System.out.println("----------------------------");
		System.out.println("entrySet Using forEach loop...");
		for (Entry<String, Integer> entry2 : entry) {
			System.out.println(entry2);
			String key=entry2.getKey();
			Integer values=entry2.getValue();
			System.out.println(key+" ==== "+values);
		}
		System.out.println("entrySet Using forEach() method...");
		entry.forEach(es->System.out.println(es));
		
		System.out.println("entrySet Using Iterator");
		Iterator<Entry<String, Integer>> itr= entry.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> entitr= itr.next();
			System.out.println(entitr);
		}
		System.out.println("-------------------------------");
		System.out.println("using forEach loop...");
		for (Entry<String, Integer> entry1 :map.entrySet()) {
			String key=entry1.getKey();
			Integer value=entry1.getValue();
			System.out.println(key+" ==== "+value);
		}
		
		List<String> names=Arrays.asList("karan","rahul","irfan","jam","jam","kyug");
		names.forEach(n->System.out.println(n));
		System.out.println("=============================");
		names.forEach(System.out::println);
		
		System.out.println("==================");
		map.forEach((sub, code)->System.out.println(sub+" ==== "+code));
	}

}
