/*
 * Consider the following Pokemon class:

class Pokemon{
    String name;
    int power;
    
    Pokemon(String name, int power){
        this.name = name;
        this.power = power;
    }
}

Create a PokemonComparator class with a comparePokemon() method that accepts an array of Pokemon objects.  The comparator should sorts the pokemons in order of decreasing score. If two pokemons have the same score, sort them alphabetically by name. 

You need to use the Comparator class in your implementation.
 * 
 * 
 * */

package com.demo.maven_Example;

import java.util.*;

public class Pokemon {	
	
	private int power;
	private String name;
	
	public int getPower() {
		return power;
	}
	
	public String getName() {
		return name;
	}
	
	public Pokemon(int power, String name) {
		this.power = power;
		this.name = name;
	}
	
	public String toString() {
		return "[power = "+this.power+", name = "+this.name+"]";
	}
	
	public static void main(String[] args) {
		
		Pokemon[] pokemon = new Pokemon[4];
		pokemon[0] = new Pokemon(19, "Pikachu");
		pokemon[1] = new Pokemon(17, "Meow");
		pokemon[2] = new Pokemon(20, "Bulbausar");
		pokemon[3] = new Pokemon(20, "Chalizard");
		
		PokemonComparator p = new PokemonComparator();
		p.comparePokemon(pokemon);
	}

	
}

class PokemonComparator implements Comparator<Pokemon>{
	
	
	public int compare(Pokemon p1, Pokemon p2) {
		int flag = p2.getPower() - p1.getPower();
		if(flag == 0)
		{
			flag = p2.getName().compareTo(p1.getName());
		}
		return flag;
	}
		
	public Pokemon[] comparePokemon(Pokemon[] poke) {
		Arrays.sort(poke, new PokemonComparator());
		System.out.println(Arrays.toString(poke));
		return poke;
	}
}
