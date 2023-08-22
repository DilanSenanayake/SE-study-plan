package com.example.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


@SpringBootApplication
public class WritetoFiles {
    public static void main(String[] args) {
        SpringApplication.run(WritetoFiles.class, args);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("OutputFile.txt"))) {
            writer.write("This is the content");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



