package com.practice.services;

import org.springframework.stereotype.Component;

@Component(value = "result1")
public class Result {

    public String getResult(int marks) {
        if (marks > 50)
            return "pass";
        else
            return "fail";
    }
}
