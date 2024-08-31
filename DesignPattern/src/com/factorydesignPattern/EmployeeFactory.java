package com.factorydesignPattern;

public class EmployeeFactory {
	
	public static Employee getEmployee(String empType) {
		
		if(empType.trim().equalsIgnoreCase("Web Developer")) {
			
			return new WebDeveloper();
		}
		else if(empType.trim().equalsIgnoreCase("Android developer")) {
			
			return new AndroidDeveloper();
		}
		else {
			return null;
		}
	}

}
