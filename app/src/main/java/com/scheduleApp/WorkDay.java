package com.scheduleApp;

import java.util.ArrayList;

/**
 * WorkDay:  (unfinished)
 *    used to save which students work in the morning and which work in the evening
 */
public class WorkDay {
    private ArrayList<Student> openingShift;
    private ArrayList<Student> closingShift;

    public WorkDay(ArrayList<Student> openingShift, ArrayList<Student> closingShift) {
        this.openingShift = openingShift;
        this.closingShift = closingShift;
    }

    public WorkDay(){}

    public ArrayList<Student> getClosingShift() {
        return closingShift;
    }

    public String getOpeningShift() {
        String str = openingShift.get(0).toString() + openingShift.get(1).toString();
        return str;
    }

    public void setClosingShift(Student a, Student b) {
    }

    public void setOpeningShift(Student a, Student b) {

    }

    public void addCloser(Student student){
        closingShift.add(student);
    }

    public void removeCloser(Student student){
        if (!closingShift.contains(student)){
            return; // add error
        }
        closingShift.remove(student);
    }

    public void addOpener(Student student){
        openingShift.add(student);
    }

    public void removeOpener(Student student){
        if (!openingShift.contains(student)){
            return; // add error
        }
        openingShift.remove(student);
    }
















}
