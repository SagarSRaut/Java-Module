package com.employee;

public abstract class Employee {

	 
		 protected int Empid;
		 protected String Name;
		 public Employee(int empid,String name)
		 {
			 this.Empid=empid;
			 this.Name=name;
			 
		 }
		 public abstract double calculateGross();
		 public String toString()
		 {
			 return "Employee ID :"+Empid+"Name:"+Name;
		 }
	
}

