package com.practice;

import com.practice.config.Configuration;
import com.practice.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

        Student student1 = (Student) context.getBean("student1");


        System.out.println(student1.getFinalResult());

    }
}
