package com.example.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CustomExceptions {
    public static void main(String[] args) {
        SpringApplication.run(CustomExceptions.class, args);

        try {
            throw new MyException("Test Exception");
        } catch (MyException e) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(e.getMessage());
        }

    }
}

class MyException extends Exception {
    public MyException(String s) {
        // call the constructor of parent Exception
        super(s); // This is not mandatory
    }
}

