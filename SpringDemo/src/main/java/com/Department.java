package com;

import java.util.List;

public class Department {
	private String deptName;
	private Human h;
	
	public List<Human> getHumanList() {
		return humanList;
	}

	public void setHumanList(List<Human> humanList) {
		this.humanList = humanList;
	}

	public List<Human> humanList;
	
	
	
	
	public Department(String deptName, Human h) {
		super();
		this.deptName = deptName;
		this.h = h;
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", h=" + h + "]";
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Human getH() {
		return h;
	}
	public void setH(Human h) {
		this.h = h;
	}
	

}
