package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
//You’ll need data to test ‘Student’.  This data should be available for all tests in the Student_Test class (hint: @BeforeClass).
//Add three Course records, add them to an ArrayList of Course
//Add two Semesters, one for Fall, one for Spring.  Add them to an ArrayList of Semester
//Add two Sections for each Course & Semester (total of six Sections).  Add them to an ArrayList of Section
//Create ten Student records, add them to an ArrayList of Student.
public class Student_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}