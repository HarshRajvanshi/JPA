package com;
import javax.persistence.*;

@Entity
public class Employee {
	@Id
	private String eName;
	private String eDept;
	private String eDesignation;
	public Employee(String eName, String eDept, String eDesignation) {
		super();
		this.eName = eName;
		this.eDept = eDept;
		this.eDesignation = eDesignation;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
	public String geteDesignation() {
		return eDesignation;
	}
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}

}
