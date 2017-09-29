/*
 * Create a generic class in which we want to access the group of objects from same family.

Create 3 classes A,B and C which having the same method inside of all classes .
A is a super class of B and C. Create generic class Bound  and  try to access the method 
inside the class using that Bound class. 
 * 
 */

package com.demo.maven_Example;

public class A {
	
	public void Tempo() {
		System.out.println("In A");
	}

}

class B extends A{
	public void Tempo() {
		System.out.println("In B");	
	}
}

class C extends A{
	public void Tempo() {
		System.out.println("In C");	
	}
}
