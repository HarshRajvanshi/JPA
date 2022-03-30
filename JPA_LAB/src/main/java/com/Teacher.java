package com;
import java.util.*;
import javax.persistence.*;

@Entity
public class Teacher {		
	
	@Id
	private int id;
	private String teacherName;	
	private String subject;
	
	@OneToMany(cascade=CascadeType.ALL,targetEntity = Student.class)
	List<Student> studentList;
	
	
	
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Teacher(int id, String teacherName, String subject) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.subject = subject;
	}
	
	

}
