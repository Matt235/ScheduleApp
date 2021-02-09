package com.scheduleApp;

import android.widget.CalendarView;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Schedule Class: (not finished)
 *      class to save schedule: what days which students are working
 */
public class Schedule {
    private CalendarView calendar;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<WorkDay> schedule = new ArrayList<>();

    public Schedule(CalendarView calendarView, ArrayList<Student> students){
        this.calendar = calendarView;
        this.students = students;

//        buildSchedule();
    }

    public Schedule(){

    }

}
