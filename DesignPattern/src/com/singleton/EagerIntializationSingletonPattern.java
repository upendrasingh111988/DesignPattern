package com.singleton;

public class EagerIntializationSingletonPattern {
	
	private static final EagerIntializationSingletonPattern myinstance= new EagerIntializationSingletonPattern();
	
	private EagerIntializationSingletonPattern() {
		
	}
	
	public static EagerIntializationSingletonPattern getInstanceMethod() {
		
		return myinstance;
	}

}
