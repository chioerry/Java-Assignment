/*
 * 
 * Write a method that accepts a Map object having key-value pairs of any size. 
 * The first value and the second value gets swapped. Similarly the next two 
 * should get interchange.  For example

If there are 5 keys and values like 
{"val1": "java", "val2": "c++",”val3”:”c#”,”val4”:”python”,”val5”:”php”}
 Then the output should be 
 {"val1": "c++", "val2": "java",”val3”:”c#”,”val4”:”php”,”val5”:”python”}

Conditions
The size need not to be 5 it may be of any size.
It should swap the value of adjacent value.
If the size is odd then the value in the middle should not be swapped.
 * 
 * 
 * */


package com.demo.maven_Example;

import java.util.HashMap;
import java.util.Map;

public class MapSwap {
	
	public Map<String, String> mapSwap(Map<String, String> map){
		int count = 0;
		int len = map.size();
		String[] keyset = map.keySet().toArray(new String[len]);
		String[] values = map.values().toArray(new String[len]);
		
		if(len % 2 == 1)
		{
			count = len/2 + 1;
			//System.out.println(count);
		}
		for(int i = 0; i <keyset.length-1;)
		{
			if(i == count-1)
			{
				i++;
			}
			else
			{
				map.replace(keyset[i], values[i+1]);
				map.replace(keyset[i+1], values[i]);
				i += 2;
			}
		}
		System.out.println(map);
		return map;
	}
	
	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("v1", "Java");
		myMap.put("v2", "C");
		myMap.put("v3", "jsp");
		myMap.put("v4", "html");
		myMap.put("v5", "C++");
		
		MapSwap ms = new MapSwap();
		Map<String, String> answer = ms.mapSwap(myMap);
	}

}
