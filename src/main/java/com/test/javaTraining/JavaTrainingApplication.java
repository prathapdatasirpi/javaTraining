package com.test.javaTraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTrainingApplication {

	public static void main(String[] args) {
		// Create object for Employee class and passed values via paramteres for
		Employee emp = new Employee("Prathap", 0123, 10000);

		// calling public method
		emp.printEmployeeDetails();

		// Calling protected method outside class within package
		emp.assignSalary(1000000);
		SpringApplication.run(JavaTrainingApplication.class, args);
	}

	// Single line comment
	/*
	 * Multiple line comment
	 */

}
