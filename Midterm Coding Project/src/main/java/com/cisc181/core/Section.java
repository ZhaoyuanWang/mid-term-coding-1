package com.cisc181.core;

import java.util.UUID;

//Create new class named ‘Semester’.  
//Semester has the following attributes: SemesterID (UUID), StartDate (date), EndDate (date). 
public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(UUID cID, UUID semesterID, UUID sectionID, int rID) {
		super();
		CourseID = cID;
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = rID;
	}
	public void setCourseID(UUID cID) {
		CourseID = cID;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setRoomID(int rID) {
		RoomID = rID;
	}
	public int getRoomID() {
		return RoomID;
	}
	
}
