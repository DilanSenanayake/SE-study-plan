package com.example.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class DependencyInjection {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DependencyInjection.class, args);
        Customers c = context.getBean(Customers.class);
        c.display();
    }
}



//@Component
//class Subject {
//    // constructor
//    @Autowired
//    Subject(Teacher teacher) {
//        System.out.println("A instance of subject is creating");
//        teacher.hello();
//    }
//}
//
//@Component
//class Teacher {
//    String name;
//    public void hello() {
//        System.out.println("Hello");
//    }
//}




