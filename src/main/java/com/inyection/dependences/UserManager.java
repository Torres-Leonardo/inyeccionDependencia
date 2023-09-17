package com.inyection.dependences;

public class UserManager {
	private Logger logger;

	public UserManager(Logger logger) {
		this.logger = logger;
	}

	public void createUser(String username) {
		logger.log("User created: " + username);
	}
}
