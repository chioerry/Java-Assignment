/*
 * 1. Write a method that given an integer num, it performs the following conditional actions:
Print Tom if num is odd
Print Jerry, if  num is even and > 2 but < 9
Print Tom, if  num >=  6 but <= 20,
print Jerry, if num is even and  > 25 
*/

package com.demo.maven_Example;

import java.util.Scanner;

	public class ConditionalSolution {

	        private static Scanner sc = null;
	        
	        public String checkCondition(String input) {        	
	        	
	        	String answer = "";
	        	int dummy = Integer.parseInt(input);
	        	             
		            if((dummy % 2 != 0) || (dummy > 5 && dummy < 21))
		            {
		            	answer = "Tom";
		            	if(dummy == 6 || dummy == 8)
		            	{
		            		answer = "Tom Jerry";
		            	}
		            }
		            else if((dummy % 2 == 0) && ((dummy > 2 && dummy < 9) || dummy > 25))
		            {
		            	answer = "Jerry";
		            }
		            
		            System.out.println(answer);
		            return answer;			
	        }

			public static void main(String[] args) {
				
				ConditionalSolution cs = new ConditionalSolution();
				String res = "";				
				do
				{
					sc = new Scanner(System.in);
		            System.out.println("Enter a number:");
					String n=sc.nextLine(); 
					cs.checkCondition(n);
					System.out.println("Do You want to try again?");
		            sc =new Scanner(System.in);
		            res = sc.nextLine();
		            
				}while(res.equals("ok"));
				
				
			}
	    }


