package com.employee;

 

public class SalariedEmp  extends Employee implements TaxPayer{
	protected double Basic;
     SalariedEmp(int empid,String name,double basic)
     {
    	 super(empid,name);
    	 this.Basic=basic;
     }
	public double calculateGross()
	{
		double hra= Basic*0.4;
		double da= Basic*0.12;
		return Basic+ hra+da;
	}
	public double calculateNet()
	
	{
		double tax=calculateGross()*0.2;
		return calculateGross()-tax;
	}
	@Override
	 public double calculateTax()
	 {
		  
		 return calculateGross()*0.2;
	 }
	public String toString() {
		 
		return "Employee ID:"+Empid+"Name:"+Name+"Gross:"+calculateGross()+"Net:"+calculateNet();
	}
}
