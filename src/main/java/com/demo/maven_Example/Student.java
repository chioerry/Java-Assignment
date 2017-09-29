/*
 * 
 * Create a Student class that represents the following information of a student: id, name, and age. 

Create a StudentSorter class with a sortStudent() method that accepts Student object. 
Sort the list based on their age in decreasing order. For student having same age, 
sort based on their name.
 For students having same name and age, sort them according to their iD. 
 * 
 * */

package com.demo.maven_Example;

import java.util.*;

public class Student {	

			private int id, age;
			private String name;
			
			public int getId() {
			return id;
			}
			
			public int getAge() {
			return age;
			}
			
			public String getName() {
			return name;
			}
			
			public Student(int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age = age;
			}
			
			public String toString() {
				return "[id = "+this.id+", name = "+this.name+", age = "+this.age+"]";
			}
				
			public static void main(String[] args) {
			
			Student s1 = new Student(19, "Sai", 20);
			Student s2 = new Student(17, "Raju", 21);
			Student s3 = new Student(18, "Ramu", 20);	
			
			List<Student> stud = new ArrayList<Student>();
			stud.add(s1);
			stud.add(s2);
			stud.add(s3);
			
			StudentSorter s = new StudentSorter();
			
			s.StudentSorter1(stud);
			
			}

			
}

class StudentSorter implements Comparator<Student>{
	
	public List<Student> StudentSorter1(List<Student> sorter) {		
		Collections.sort(sorter, new StudentSorter());
		System.out.println(sorter.toString());
		return sorter;
	}
		
		public int compare(Student s1, Student s2) {
			int flag  = s2.getAge() - s1.getAge();
				if(flag == 0)
				{
					flag = s2.getName().compareTo(s1.getName());
					if(flag == 0)
					{
						flag = s2.getId() - s1.getId();
					}
				}
			return flag;
		}

}
