package com.example.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


@SpringBootApplication
public class InputOutput_1 {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(InputOutput_1.class, args);

        // Reading from Files
        try (BufferedReader reader=new BufferedReader(new FileReader("D:\\SE-study-plan\\Spring Boot\\src\\main\\java\\Test.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



