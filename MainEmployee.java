package com.constructor;

public class MainEmployee {
	public static void main(String[] args) {
		Employee emp=new Employee(123,"Shweta",200000);
		Employee emp1=new Employee();
		emp1.setEmpId(432);
		emp1.setEmpName("Aishwarya");
		emp.setEmpName("Gauri");
		
		System.out.println("Emp Id :"+emp.getEmpId());
		System.out.println("Emp Name: "+emp.getEmpName());
		System.out.println("Emp Sal:"+emp.getEmpSal());
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Emp Id :"+emp1.getEmpId());
		System.out.println("Emp Name: "+emp1.getEmpName());
		System.out.println("Emp Sal:"+emp1.getEmpSal());
	}

}
