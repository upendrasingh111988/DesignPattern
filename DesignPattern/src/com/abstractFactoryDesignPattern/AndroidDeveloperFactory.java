package com.abstractFactoryDesignPattern;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
