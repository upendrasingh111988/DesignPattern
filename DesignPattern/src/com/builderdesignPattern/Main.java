package com.builderdesignPattern;

public class Main {

	public static void main(String[] args) {

		User user = new User.UserBuilder()
				.setUserId("1").setUsername("Upendra")
				.setEmail("upendra.singh@gmail.com")
				.build();
		
		System.out.println(user);

		User seconduser = User.UserBuilder.mybuilder()
					.setUserId("2").setUsername("Vashu")
					.setEmail("vashu@gmail.com").build();
		
		System.out.println(seconduser);
	}

}
