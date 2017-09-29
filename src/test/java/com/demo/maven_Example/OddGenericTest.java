package com.demo.maven_Example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;

public class OddGenericTest {

	@Test
	public void test() {
		
		OddGeneric odd1 = new OddGeneric();
		Collection<Integer> names = Arrays.asList(1,2,3,4,5,65,6,7,3,53);
		int expected = 137;
		int actual = odd1.oddSum(names);
		
		assertEquals(expected, actual);
	}

}
