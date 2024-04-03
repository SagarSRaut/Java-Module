package com.employee;

public class Test {
  public void showGross(Employee e)
  {
	  System.out.println("Gross Salary:"+e.calculateGross());
	  
  }
  public void showNet(SalariedEmp e)
  {
	  System.out.println("Net salary:"+e.calculateNet());
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t= new Test();
       SaleManager s = new SaleManager(12, "ram", 50000,1000);
//       s.displayIncentive();
       System.out.println(s);
       t.showGross(s);  //up casting
       t.showNet(s);
       Manager m= new Manager(1000, "rohan", 5550);
       System.out.println(m);
       
       Employee []emps=new Employee[3];
       emps[0]=new SaleManager(222,"Sagar",48000,3423);
       emps[1]=new SalariedEmp(21,"Sham",34097);
       emps[2]=new Manager(34, "Kunal", 98439);
       
       for(Employee e:emps)
       {
    	   t.showGross(e);
    	   if(e instanceof SalariedEmp)
    	   {
    		   SalariedEmp g=(SalariedEmp)e; // down casting
    	        t.showNet(g);
    	   }
    	   else if(e instanceof Manager)
    	   {
    		   Manager o= (Manager)e;
    		   t.showGross(e);
//    		   t.showNet(e);
    	   }
    	   
       }
      
	}

}
