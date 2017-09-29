package com.demo.maven_Example;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConditionalSolutionParameterizedTest {
	
	ConditionalSolution cs = new ConditionalSolution();
	
	private String input;
	private String expectedOutput;
		
	public ConditionalSolutionParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static List<String[]> testParams() {
		String[][] expectedOutputs = {{"9","Tom"},{"6","Tom Jerry"},{"90","Jerry"}};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testCheckCondition_Sending9() {
		assertEquals(expectedOutput, cs.checkCondition(input));
		//fail("Not yet implemented");
	}
	
}
