package com.demo.maven_Example;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StudentTest {

	StudentSorter ss = new StudentSorter();

	@Test
	public void test() {
		Student s1 = new Student(19, "Sai", 20);
		Student s2 = new Student(17, "Raju", 21);
		Student s3 = new Student(18, "Ramu", 20);	
		
		List<Student> stud = new ArrayList<Student>();
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		
		List<Student> expected = new ArrayList<Student>();
		expected.add(s2);
		expected.add(s1);
		expected.add(s3);
		List<Student> actual = ss.StudentSorter1(stud);
		
		assertEquals(expected, actual);
	}

}
