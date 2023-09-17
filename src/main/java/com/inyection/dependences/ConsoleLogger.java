package com.inyection.dependences;

//Implementación de Logger
class ConsoleLogger implements Logger {
	@Override
	public void log(String message) {
		System.out.println("Logging: " + message);
	}
}
