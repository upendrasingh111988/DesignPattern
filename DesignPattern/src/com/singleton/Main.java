package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		
		LazzyIntializationSingletonPattern instanceMethod = LazzyIntializationSingletonPattern.getInstanceMethod();
		LazzyIntializationSingletonPattern instanceMethod1 = LazzyIntializationSingletonPattern.getInstanceMethod();
		System.out.println("hashcode of lazzyintisingletonclass::"+ instanceMethod.hashCode());
		System.out.println(instanceMethod1.hashCode());
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		EagerIntializationSingletonPattern instnace2=EagerIntializationSingletonPattern.getInstanceMethod();
		EagerIntializationSingletonPattern instnace3=EagerIntializationSingletonPattern.getInstanceMethod();
		System.out.println(instnace2.hashCode());
		System.out.println(instnace3.hashCode());
		System.out.println("Breaking sileton pattern::");
		// for breaking singleton pattern through reflection api::
		Constructor<LazzyIntializationSingletonPattern> declaredConstructor = LazzyIntializationSingletonPattern.class.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		LazzyIntializationSingletonPattern newInstance = declaredConstructor.newInstance();
		System.out.println("before serialization::"+ newInstance.hashCode());
		LazzyIntializationSingletonPattern ds1 = LazzyIntializationSingletonPattern.getInstanceMethod();
		// using deserialization we can break singleton
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("abc.ob"));
		oos.writeObject(instanceMethod);
		System.out.println("serialization done..");
		ObjectInputStream ois= new ObjectInputStream( new FileInputStream("abc.ob"));
		Object ds2 = ois.readObject();
		System.out.println(ds2.hashCode());
		System.out.println(ds1.hashCode());
		

	}

}
