package com.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

// lazzy singleton design
public class LazzyIntializationSingletonPattern implements Serializable {
	
	private static LazzyIntializationSingletonPattern singleInstance;
	
	private LazzyIntializationSingletonPattern() {
		/*
		 * if(singleInstance!=null) { throw new
		 * RuntimeException("you are trying to break singleton class.."); }
		 */
	}
	public static LazzyIntializationSingletonPattern getInstanceMethod() {
		
		/*
		 * if(singleInstance==null) {
		 * 
		 * singleInstance= new LazzyIntializationSingletonPattern(); }
		 */
		
		if(singleInstance==null) {
			
			synchronized (LazzyIntializationSingletonPattern.class) {
				
				if(singleInstance==null) {
					
					singleInstance= new LazzyIntializationSingletonPattern();
				}
				
			}
			
		}
		return singleInstance;
		
	}
	
	// Prevents another instance from being created during deserialization
    private Object readResolve() throws ObjectStreamException {
        return getInstanceMethod();
    }
}
