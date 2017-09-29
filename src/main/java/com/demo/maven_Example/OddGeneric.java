/*
 * Write a generic method to get the sum value of odd elements in a collection.
 * */

package com.demo.maven_Example;

import java.util.Arrays;
import java.util.Collection;

public class OddGeneric {
	
	public <T> int oddSum(Collection<T> types) {		
		int result = 0;
		for(T type : types) {
			Integer i = Integer.parseInt(type.toString());
			if(i % 2 != 0)
			{
				result += i;
			}
		}
		System.out.println(types);
		System.out.println(result);
		return result;		
	}
	
	public static void main(String[] args) {
		
		OddGeneric odd1 = new OddGeneric();
		Collection<Integer> names = Arrays.asList(1,2,3,4,5,65,6,7,3,53);
		odd1.oddSum(names);
	}

}