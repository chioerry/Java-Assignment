/*
 * Create a generic class in which we want to access the group of objects from same family.

Create 3 classes A,B and C which having the same method inside of all classes .
A is a super class of B and C. Create generic class Bound  and  try to access the method 
inside the class using that Bound class. 
 * 
 * 
 * A class Continuation
 */
package com.demo.maven_Example;

class Bound<T extends A> {
	
	T obj;
	public Bound(T obj) {
		this.obj = obj;
	}
	
	public void Tempo() {
		this.obj.Tempo();
	}
}

public class Main {
	public static void main(String[] args) {
		Bound<A> boo = new Bound<A>(new A());
		boo.Tempo(); 
		// Accessing C
		Bound<A> coo = new Bound<A>(new C());
		boo.Tempo(); 
		// Accessing B
		Bound<A> doo = new Bound<A>(new B());
		boo.Tempo(); 
	}

}
