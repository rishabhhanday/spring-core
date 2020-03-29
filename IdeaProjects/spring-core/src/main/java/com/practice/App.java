package com.practice;

import com.practice.model.Student;
import com.practice.services.Result;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Result result = (Result) context.getBean("result");
        System.out.println(result.getResult(((Student)context.getBean("student1")).getMarks()));
        System.out.println(result.getResult(((Student)context.getBean("student2")).getMarks()));

    }
}
