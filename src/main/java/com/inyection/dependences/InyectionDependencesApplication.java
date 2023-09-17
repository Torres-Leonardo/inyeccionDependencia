package com.inyection.dependences;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InyectionDependencesApplication {

	// Clase principal que utiliza UserManager con inyección de dependencias
	public class Main {
		public static void main(String[] args) {
			// Crear una instancia de Logger
			Logger logger = new ConsoleLogger();

			// Crear una instancia de UserManager con la dependencia Logger inyectada
			UserManager userManager = new UserManager(logger);

			// Utilizar UserManager para crear un usuario
			userManager.createUser("Leonardo");
		}
	}

}
