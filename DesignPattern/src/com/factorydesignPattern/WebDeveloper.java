package com.factorydesignPattern;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("web developer salary method is calling..");
		return 60000;
	}

}
