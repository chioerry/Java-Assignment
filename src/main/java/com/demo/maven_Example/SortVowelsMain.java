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

public class SortVowelsMain {
	public static List<SortVowels> vowelCount(List<String> obj) {
		
		List<SortVowels> li = new ArrayList<SortVowels>();
		
		String[] nest = obj.toArray(new String[obj.size()]);
		int len = nest.length;
		int[] tempArray = new int[len];
		for(int i = 0; i < len; i++)
		{
			int count = 0;
			for(int j = 0; j<nest[i].length(); j++)
			{
				char t = nest[i].charAt(j);
				if(t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u')
				{
					count++;
				}	
			}	
			li.add(new SortVowels(nest[i], count));
		}
		return li;
	}

	public static void main(String[] args) {

		List<String> params = new ArrayList<String>();
		params.add("length");
		params.add("cream");
		params.add("loft");
		params.add("air");
		params.add("aei");
		params.add("aei");
		
		 List<SortVowels> li=SortVowelsMain.vowelCount(params);	
		 Collections.sort(li,new Comparewords());
		 for(SortVowels s:li)
		 {
			 System.out.println(s.getName());
		 }
	}

	

}
class Comparewords implements Comparator<SortVowels>
{
	
	public int compare(SortVowels o2, SortVowels o1) {
		int flag = o1.getCount() - o2.getCount();
		if(flag == 0)
		{
			flag = o2.getName().length() - o1.getName().length();
		}
		return flag;
	}
	
}