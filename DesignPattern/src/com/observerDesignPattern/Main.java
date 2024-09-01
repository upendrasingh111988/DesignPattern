package com.observerDesignPattern;

public class Main {

	public static void main(String[] args) {
		YouTubeChannel youTubeChannel= new YouTubeChannel();
		Subscriber upendra= new Subscriber();
		youTubeChannel.subscribe(upendra);
		youTubeChannel.notificationChanges();

	}

}
