package com.demo.maven_Example;

import static org.junit.Assert.*;

import org.junit.Test;

public class PokemonTest {
	
	PokemonComparator pc = new PokemonComparator();
	
	@Test
	public void test() {
		Pokemon[] pokemon = new Pokemon[4];
		pokemon[0] = new Pokemon(19, "Pikachu");
		pokemon[1] = new Pokemon(17, "Meow");
		pokemon[2] = new Pokemon(20, "Bulbausar");
		pokemon[3] = new Pokemon(20, "Chalizard");
		
		Pokemon[] expected = new Pokemon[4];
		expected[2] = new Pokemon(19, "Pikachu");
		expected[3] = new Pokemon(17, "Meow");
		expected[1] = new Pokemon(20, "Bulbausar");
		expected[0] = new Pokemon(20, "Chalizard");
		
		Pokemon[] actual = pc.comparePokemon(pokemon);
		
		int exp =expected[0].getPower(); 
		int act = actual[0].getPower();
		
		assertEquals(exp, act);
	}

}
