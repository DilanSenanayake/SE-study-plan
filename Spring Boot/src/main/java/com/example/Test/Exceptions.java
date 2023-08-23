package com.example.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class Exceptions {
    public static void main(String[] args) {
        SpringApplication.run(Exceptions.class, args);

        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        try {
            System.out.println("Enter first number: ");
            a = scanner.nextInt();
            System.out.println("Enter second number: ");
            b = scanner.nextInt();
            c = a/b;
            System.out.println("Answer is " + c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("bye");
        }

    }
}



