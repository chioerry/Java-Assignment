/*
 * 
 * From a given set of list, get the string values to be displayed in the order of the 
 * high number of vowels to the least number of vowels from the given string values. 
 * If the number of vowels are same then it should check for the length and display the 
 * minimum one first.
Example: if the values are length, adata, lost then the output should be as adata, lost, llength.
 * 
 * */

package com.demo.maven_Example;

import java.util.*;

public class SortVowels {
	
	private int count;
	private String name;
	
	public int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	
	public SortVowels(String name, int count){
		this.count = count;
		this.name = name;
	}
	
	public String toString() {
		return "[name = "+this.name+", count = "+this.count+"]";
	}
}
