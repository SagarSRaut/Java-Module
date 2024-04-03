package com.employee;

public class SaleManager extends Manager{
	protected double incentive;

	public SaleManager(int empid, String name, double basic,double incentive) {
		super(empid, name, basic);
		this.incentive=incentive;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateGross() {
		// TODO Auto-generated method stub
		return super.calculateGross()+incentive;
	}
	@Override
	public double calculateNet() {
		// TODO Auto-generated method stub
		double tax=calculateGross()*0.3;
		return calculateGross()-tax;
		
	}
	public void displayIncentive()
	{
		System.out.println("Incentive:"+incentive);
	}

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SaleManager s = new SaleManager(12, "ram", 50000, 10000);
//       s.displayIncentive();
       System.out.println(s);
	}
}
