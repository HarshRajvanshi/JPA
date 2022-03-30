package com;
import java.util.*;
import javax.persistence.*;

@Entity
public class Student {
	@Id
	private String sName ;
	private int marks ;
	private int semester ;
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public Student(String sName, int marks, int semester) {
		super();
		this.sName = sName;
		this.marks = marks;
		this.semester = semester;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
