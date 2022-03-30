package com;
import javax.persistence.*;


@Entity
public class Student {	
	
	@Id
	private int studentId;
	private String sName ;
	private int semester ;	
	
	
	@ManyToOne(cascade=CascadeType.ALL,targetEntity = Teacher.class)
	private Teacher teacher;
	
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student( int studentId, String sName, int semester ,Teacher teacher) {
		this.teacher=teacher;
		this.studentId = studentId;
		this.sName = sName;
		this.semester = semester;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
