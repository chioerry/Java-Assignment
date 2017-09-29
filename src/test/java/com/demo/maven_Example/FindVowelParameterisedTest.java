package com.demo.maven_Example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FindVowelParameterisedTest {
	
	FindVowel vowel = new FindVowel();
	
	private String input;
	private String output;
	
	
	
	public FindVowelParameterisedTest(String input, String output) {
		super();
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static List<String[]> testParameters(){
		String[][] expectedOutput = {{"aeiou"," Vowel "},{"b", " Consonant "},{"8", " Not an Alphabet "}};
		return Arrays.asList(expectedOutput);
	}

	@Test
	public void testCheckVowel_sendingVowel() {
		assertEquals(output, vowel.checkVowel(input));
	}

}
