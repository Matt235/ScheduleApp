package com.scheduleApp;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.time.DayOfWeek;

public class Students {

    public List<Student> studentsList = new ArrayList<>();

    public void addStudents(String firstName, String lastName, int id, int trainingStatus, DayOfWeek[] availableDay, LocalTime[] availableTime){
        studentsList.add(new Student(firstName, lastName, id, trainingStatus, availableDay, availableTime));
    }
    public String showStudents(){
        return studentsList.toString();
    }


}
