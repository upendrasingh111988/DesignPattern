package com.abstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		
		return 50000;
	}

	@Override
	public String name() {
		System.out.println("i am andoid developer");
		return "Android developer";
	}

}
