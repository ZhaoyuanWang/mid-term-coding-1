package com.cisc181.core;

import java.util.UUID;

//Enrollment has the following attributes: SectionID(UUID), StudentID (UUID), EnrollmentID(UUID) and Grade (double).  



public class Enrollment {
		private UUID SectionID;
		private UUID StudentID;
		private UUID EnrollmentID;
		private double Grade;
		
		//Enrollment should have its no-arg constructor private.		
		private Enrollment() {
			super();
		}
		//Enrollment should have a two-arg constructor, with StudentID and SectionID as input parameters. 
		//EnrollmentID should be set in the constructor.	
		public Enrollment(UUID sectionID, UUID studentID) {
			super();
			SectionID = sectionID;
			StudentID = studentID;
			EnrollmentID = UUID.randomUUID();
		}
		//SetGrade(double grade) should be defined as a procedure.		
		public void setGrade(double num) {
			Grade = num;
		}
		public double getGrade() {
			return Grade;
		}
		public void setSectionID(UUID sectionID) {
			SectionID = sectionID;
		}
		public UUID getSectionID() {
			return SectionID;
		}
		public void setStudentID(UUID studentID) {
			StudentID = studentID;
		}
		public UUID getStudentID() {
			return StudentID;
		}
		public void setEnrollmentID(UUID enrollmentID) {
			EnrollmentID = enrollmentID;
		}
		public UUID getEnrollmentID() {
			return EnrollmentID;
		}
		
	}


