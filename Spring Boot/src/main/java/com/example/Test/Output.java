package com.example.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Output {
    public static void main(String[] args) {
        SpringApplication.run(Output.class, args);

        // Printing to Console
        System.out.print("Hello World!");
        System.out.println("Hello World!");

        String name = "Kasun";
        int age = 25;
        double height = 5.6;

        System.out.printf("Name: %s, Age: %d, Height: %.2f%n", name, age, height);

    }
}



