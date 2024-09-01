package com.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
	
	List<Observer> subscriber= new ArrayList<>();

	@Override
	public void subscribe(Observer obj) {
		this.subscriber.add(obj);
		
	}

	@Override
	public void unsubscribe(Observer obj) {
		this.subscriber.remove(obj);
		
	}

	@Override
	public void notificationChanges() {

		for(Observer ob : this.subscriber) {
			ob.notified();
			
		}
		
	}

}
