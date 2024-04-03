package com.employee;

public class Manager extends SalariedEmp{

	static protected double travel=1500;
	static protected double telephone=1000;
	
	Manager(int empid,String name,double basic)
	{
		super(empid,name,basic);
	}
	public  double calculateGross() {
		  
		 return super.calculateGross()+travel+telephone;
	}
	 @Override
	public double calculateNet() {
		// TODO Auto-generated method stub
		 double tax=calculateGross()*0.2;
		return calculateGross()-tax;
	}
	 @Override
	public String  toString()
	{
		return super.toString()+"Gross:"+calculateGross()+"Net:"+calculateNet();
	}
}
