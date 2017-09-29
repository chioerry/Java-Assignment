/*
 * 
 * Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.  Modify and return the given map as follows:

If the key "val1" has a value, set the key "val2" to have that value, and
Set the key "val1" to have the value "" (empty string). 


For example 1: The map {"val1": "java", "val2": "c++"} should return {"val1": "", "val2": "java"}
For example 2: The map {"val1": "mars", "val2": "saturn"} should return {"val1": "", "val2": "mars"}
 * 
 * */


package com.demo.maven_Example;

import java.util.*;

public class MapObject {
	
	public Map<String, String> mapTest(Map<String, String> map){
		
		
		String[] keyset = map.keySet().toArray(new String[map.size()]);
		String[] values = map.values().toArray(new String[map.size()]);
		
		if(keyset[0] != null)
		{
			map.replace(keyset[0], "");
			map.replace(keyset[1], values[0]);
		}
				return map;
	}	

	public static void main(String[] args) {
		
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("key1", "Java");
		myMap.put("key2", "C");		
		MapObject ans = new MapObject();
		Map<String, String> answer = ans.mapTest(myMap);
		System.out.println(answer);

	}

}
