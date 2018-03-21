package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

//1.Course has the following attributes: CourseID (UUID),
//CourseName (String).  GradePoints(int)   5 points.

public class Course {
		private UUID CourseID;
		private String CourseName;
		private int GradePoints;
		//Add Major to Course as an attribute.  
		private eMajor Major;
		
		public Course(UUID ID, String Name, int grade, eMajor major) {
			super();
			CourseID = ID;
			CourseName = Name;
			GradePoints = grade; 
			Major = major;
		}
		public void setCourseID(UUID ID) {
			CourseID = ID;
		}
		public UUID getCourseID() {
			return CourseID;
		}
		public void setCourseName(String Name) {
			CourseName = Name;
		}
		public String getCourseName() {
			return CourseName;
		}
		public void setGradePoints(int grade) {
			GradePoints = grade;
		}
		public int getGradePoints() {
			return GradePoints;
		}
		public void setMajor(eMajor major) {
			Major = major;
		}
		public eMajor getMajor() {
			return Major;
		}
		
		
	}


