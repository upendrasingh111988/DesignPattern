package com.abstractFactoryDesignPattern;

public class MainClient {

	public static void main(String[] args) {

		Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
		e1.name();
		Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
		e2.name();
	}

}
