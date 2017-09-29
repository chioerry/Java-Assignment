package com.demo.maven_Example;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConditionalSolutionTest {
	
	ConditionalSolution cs;

	@Before
	public void setUp() throws Exception {
		cs = new ConditionalSolution();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void testCheckCondition_Sending9() {
		assertEquals("Tom", cs.checkCondition("9"));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testCheckCondition_Sending6() {
		assertEquals("Tom Jerry", cs.checkCondition("6"));
	}
	
	@Test
	public void testCheckCondition_TryingThirdCondition() {
		assertEquals("Jerry", cs.checkCondition("900"));
	}
}
