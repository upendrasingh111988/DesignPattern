package com.factorydesignPattern;

public class DevloperClient {

	public static void main(String[] args) {

		Employee webemployee = EmployeeFactory.getEmployee("Web Developer");
		int salary = webemployee.salary();
		System.out.println(salary);
		
		Employee adroiddeveloper = EmployeeFactory.getEmployee("Android developer");
		int wbedevlopersalary = adroiddeveloper.salary();
		System.out.println(wbedevlopersalary);

	}

}
