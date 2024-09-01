package com.observerDesignPattern;

public interface Subject {
	
	void subscribe(Observer obj);
	void unsubscribe(Observer obj);
	void notificationChanges();

}
