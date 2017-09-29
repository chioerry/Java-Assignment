package com.demo.maven_Example;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortVowelsMainTest {
	
	@Test
	public void test() {
		List<String> params = new ArrayList<String>();
		params.add("length");
		params.add("cream");
		params.add("loft");
		params.add("air");
		params.add("aei");
		params.add("aei");
		
			List<String> expected = new ArrayList<String> ();
			expected.add("aei");
			expected.add("aei");
			expected.add("air");
			expected.add("cream");
			expected.add("loft");
			expected.add("length");
			
			List<String> actual = new ArrayList<String>();
			
		 List<SortVowels> li=SortVowelsMain.vowelCount(params);	
		 Collections.sort(li,new Comparewords());
		 for(SortVowels s:li)
		 {
			 actual.add(s.getName());
		 }
		 
		 assertEquals(expected, actual);
		
	}

}
