package com.abstractFactoryDesignPattern;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 60000;
	}

	@Override
	public String name() {

		System.out.println("i am web developer..");
		return "Web developer";
	}

}
