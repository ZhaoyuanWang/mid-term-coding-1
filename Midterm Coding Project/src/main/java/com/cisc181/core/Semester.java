package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

//2.Semester has the following attributes: SemesterID (UUID), StartDate (date), EndDate (date).  
public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(UUID ID, Date sDate, Date eDate) {
		super();
		SemesterID = ID;
		StartDate = sDate;
		EndDate = eDate;
	}
	public void setSemesterID(UUID ID) {
		SemesterID = ID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setStartDate(Date sDate) {
		StartDate = sDate;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setEndDate(Date eDate) {
		EndDate = eDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
}
