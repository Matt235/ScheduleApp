package com.scheduleApp;

import java.util.ArrayList;

/**
 * class to save day ( not sure if this is useful)
 * list of day, month, year
 */
public class Day {
    private ArrayList<Integer> date;

    public void Day(Integer day, Integer month, Integer year){
        date.add(day);
        date.add(month);
        date.add(year);
    }

    public ArrayList<Integer> getDate() {
        return date;
    }
}

