package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User1 {
	
	
	private String na;
	private int salary;
	@Id
	private String empNo;
	
	

	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return na;
	}
	public void setName(String nam) {
		this.na = nam+" hai";
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

public String toString() {
	return this.na + " ---- " + this.salary;
	
}



}
