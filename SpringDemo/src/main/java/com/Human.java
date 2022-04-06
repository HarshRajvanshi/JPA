package com;

public class Human {
	public Human(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	private String name;
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", salary=" + salary + "]";
	}
	private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
