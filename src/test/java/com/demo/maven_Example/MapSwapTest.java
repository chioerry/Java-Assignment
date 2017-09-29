package com.demo.maven_Example;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapSwapTest {
	
	MapSwap ms = new MapSwap();

	@Test
	public void test() {
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("v1", "Java");
		myMap.put("v2", "C");
		myMap.put("v3", "jsp");
		myMap.put("v4", "html");
		myMap.put("v5", "C++");
		
		Map<String, String> expected = new HashMap<String, String>();
		expected.put("v1", "C");
		expected.put("v2", "Java");
		expected.put("v3", "jsp");
		expected.put("v4", "C++");
		expected.put("v5", "html");
		
		Map<String, String> actual = ms.mapSwap(myMap);
		assertEquals(expected, actual);
		
	}

}
