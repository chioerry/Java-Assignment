/*
 * Create a program that accepts a single character letter and prints whether 
 * it is a consonant or vowel.
Condition: 
Print an error message for an if the input is not a letter
If the input having more than one letter, print the required output 
(Vowel or Consonant) for each letter

If input is:
‘p’
Expected Output is:
Consonant

If input is:
 ‘ap’
Expected Output is:
Vowel Consonant
 * 
 * 
 * */




package com.demo.maven_Example;

import java.util.Scanner;

public class FindVowel {
	public String checkVowel(String str) {
		String value="";
		System.out.println(str.length());
			for(int i = 0; i < str.length(); i++)
			{
				char temp = str.charAt(i);
				System.out.println(temp);
				if(Character.isAlphabetic(temp))
				{
					if((temp == 'a') || (temp == 'e') ||
							(temp == 'i') || (temp == 'o') || (temp == 'u'))
					{
						value = " Vowel ";
					}
					else
					{
						value = " Consonant ";
					}
					System.out.println(value);
				}
				else
				{
					value = " Not an Alphabet ";
					System.out.println(value);
				}
				
			}
			
			
		return value;
	}
	public static void main(String[] args) {
		String retry;
		FindVowel vowel = new FindVowel();
		do {
			System.out.println("Enter a character or a string:");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine().toLowerCase();
			vowel.checkVowel(name);
			System.out.println("Want to retry?");
			retry = sc.nextLine();
		}while(retry.equals("ok"));
		
		
	}

}
