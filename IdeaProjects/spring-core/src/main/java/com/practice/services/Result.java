package com.practice.services;

import com.practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class Result {


    public String getResult(int marks) {
        if (marks > 50)
            return "pass";
        else
            return "fail";
    }
}
