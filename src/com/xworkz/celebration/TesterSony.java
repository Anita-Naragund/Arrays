package com.xworkz.celebration;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesterSony {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		
		String name="Elon Musk";
		int age=49;
		
		map.put(name, age);
		map.put("Steve Jobs", 54);
		map.put("Kalam", 83);
		map.put("Anita", 23);
		map.put("Yash", 35);
		map.put("Trupti", 23);
		map.put("Sudeep", 52);
		map.put(null, null);
		
		Integer value=map.get("Yash");
		System.out.println(value);
		
		Set<String> keys=map.keySet();
		
		keys.forEach(anything->{
			Integer v=map.get(anything);
			System.out.println(anything+age+" "+v);
		});
		
		Collection<Integer> values=map.values();
		values.forEach(a->System.out.println(a));
		
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		System.out.println(entrySet.size());
		entrySet.forEach(a->{
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		});
	}
}