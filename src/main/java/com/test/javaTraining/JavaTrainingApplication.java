package com.test.javaTraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTrainingApplication {
	//Declare static variable
	public static String JAVA_TRAINING = "JAVA_TRAINING";

	//Declare static method
	static void javaConditions() {
				// Java  variables
				String name = "Prathap";
				int rollNo = 12;
				boolean isEmployee = true;
				double doubleValue = 1.43;
				System.out.println("String Type " + name);
				System.out.println("Integer Type " + rollNo);
				System.out.println("Double Type " + doubleValue);
				System.out.println("Boolean Type " + isEmployee);
		
				// Java conditions
		
				if(isEmployee) {
					System.out.println(name + " is a Employee");
				} else {
					System.out.println(name + " is not a Employee");
				}
		
				// for loop 
				int i;
				System.out.println("Print 0 to 9 in for loop");
				for( i = 0; i < 10 ;i++) {
					System.out.print(i + " ");
		
				}
				// while loop 
				System.out.println("\nPrint 0 to 9 in while loop");
				i = 0;
				while(i < 10) {
					System.out.print(i + " ");
					i++;
		
				}
				System.out.println("\nPrint 0 to 9 in do while loop");
				i = 0;
				do {
					System.out.print(i + " ");
					i++;
		
				} while(i < 10);

	}

	public static void main(String[] args) {
		// Calling Static method
		javaConditions();
		// Create object for Employee class and passed values via paramteres for
		Employee emp = new Employee("Prathap", 0123);
		emp.printEmployeeDetails();
		System.out.println("Printing Static variable " + JAVA_TRAINING);
		
		SpringApplication.run(JavaTrainingApplication.class, args);
	}

}
