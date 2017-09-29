package com.demo.maven_Example;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapObjectTest {
	
	MapObject mo = new MapObject();

	@Test
	public void test() {
		
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("key1", "Java");
		myMap.put("key2", "C");	
	
		Map<String, String> expected = new HashMap<String, String>();
		expected.put("key1", "");
		expected.put("key2", "Java");
		
		Map<String, String> actual = mo.mapTest(myMap); 
		assertEquals(expected, actual);

	}

}
