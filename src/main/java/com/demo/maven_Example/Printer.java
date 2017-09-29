/*
 * Category: Generic
Create a Printer class with a printArray() single method (No method overloading) that accept a 
single argument that can be String or integer array, and prints the array elements.
 * 
 * */


package com.demo.maven_Example;

public class Printer {
	
	public static <E> void printArray(E[] elements) {
		
		for(E element : elements) {
			System.out.println(element);
		}
		
		System.out.println();	
	}
	public static void main(String[] args) {
		Character[] song = {'d','a','n','c','e'};
		Integer[] number = {1,2,3,33,4,44};
		Boolean[] bool = {true, false};
		
		System.out.println("Char Array: ");
		printArray(song);
		
		System.out.println("Integer Array: ");
		printArray(number);
		
		System.out.println("Boolean Array: ");
		printArray(bool);
	}
}
