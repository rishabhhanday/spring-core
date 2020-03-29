package com.practice.model;

import com.practice.services.Result;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
public class Student {
    @Autowired
    @Qualifier(value = "result1")
    private Result result;
    private String name;
    private int rollNo;
    private int marks;
    public String getFinalResult(){
       return result.getResult(getMarks());
    }
}
