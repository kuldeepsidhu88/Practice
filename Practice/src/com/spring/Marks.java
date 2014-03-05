package com.spring;

public class Marks {
	private Integer theoryMarks;
	private Integer practicalMarks;
	
	public Integer getTheoryMarks() {
		return theoryMarks;
	}
	public void setTheoryMarks(Integer theoryMarks) {
		this.theoryMarks = theoryMarks;
	}
	public Integer getPracticalMarks() {
		return practicalMarks;
	}
	public void setPracticalMarks(Integer practicalMarks) {
		this.practicalMarks = practicalMarks;
	}
	
	@Override
	public String toString(){
		return "Theory:"+theoryMarks+"Practical:"+practicalMarks;
	}
	
	
}
