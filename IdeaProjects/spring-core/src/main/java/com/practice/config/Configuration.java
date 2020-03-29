package com.practice.config;

import com.practice.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan(value = "com.practice")
public class Configuration {
    @Bean
    public Student student1(){
        Student student = new Student();
        student.setMarks(56);
        student.setName("rishabh");
        return student;
    }
    @Bean
    public Student student2(){
        Student student = new Student();
        student.setMarks(12);
        student.setName("rishi");
        return student;
    }
}
