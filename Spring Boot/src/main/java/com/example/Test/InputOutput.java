package com.example.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;


@SpringBootApplication
public class InputOutput {
    public static void main(String[] args) {
        SpringApplication.run(InputOutput.class, args);

        // Reading from Console (User Input)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println(name);
    }
}



