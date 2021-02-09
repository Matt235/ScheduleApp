package com.scheduleApp;

import java.time.DayOfWeek;
import java.time.LocalTime;
public class Student {

    String firstName;
    String lastName;
    int id;  // not sure if they will have a id number or not
    int trainingStatus; // default status is 0 cant open or close, 1 can open, 2 can close, 3 can both open and close
    DayOfWeek[] availableDay;  //  i was thinking about starting the week with monday and it being 1 and sunday being the last day 7
    LocalTime[] availableTime; // time in 24 hour clock with .25 being 15 mins and .50 being 30 mins and .75 being 45 mins

    public Student(String firstName, String lastName,int id, int trainingStatus,DayOfWeek[] availableDay,LocalTime[] availableTime){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id =id;
        this.trainingStatus = trainingStatus;
        this.availableDay = availableDay;
        this.availableTime = availableTime;
    }

    public String toString(){
        StringBuilder tempWeek = new StringBuilder();
        for (int i =0;i < availableDay.length;i++){
            tempWeek.append(availableDay[i].name()+' '+availableTime[0]+'-'+availableTime[1]+" ,");
        }
        return firstName+" "+lastName+" id:"+id+" Training Status:"+trainingStatus+" "+tempWeek+'\n';
    }

}
