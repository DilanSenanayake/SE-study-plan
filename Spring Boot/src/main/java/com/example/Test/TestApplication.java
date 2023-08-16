package com.example.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}

@Component
class Subject {
	private Teacher teacher;
	// constructor
	@Autowired
	Subject(Teacher teacher) {
		this.teacher = teacher;
		System.out.println("A instance of subject is creating");
		teacher.hello();
	}
	public void say() {
		teacher.hello();
	}
}

@Component
class Teacher {
	public void hello() {
		System.out.println("Hello");
	}
}