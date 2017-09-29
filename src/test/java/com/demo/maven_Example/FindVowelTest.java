package com.demo.maven_Example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindVowelTest {
	
	FindVowel vowel;

	@Before
	public void setUp() throws Exception {
		vowel = new FindVowel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheckVowel_sendingVowel() {
		assertEquals(" Vowel ", vowel.checkVowel("a"));
	}
	
	@Test
	public void testCheckConsonant() {
		assertEquals(" Consonant ", vowel.checkVowel("b"));
	}
	
	@Test
	public void testCheckAlphabet() {
		assertEquals(" Not an Alphabet ", vowel.checkVowel("8"));
	}

}
