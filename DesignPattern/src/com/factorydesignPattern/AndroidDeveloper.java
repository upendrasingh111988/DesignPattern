package com.factorydesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("i am calling Android developer salary method::");
		return 50000;
	}

}
