package com.scheduleApp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;

/* class for schedule screen*/
public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);


        CalendarView calenderView = findViewById(R.id.calendarView);  // calendar View
        TextView selectedDay = findViewById(R.id.selectedDay);        // date text
        TextView opening = findViewById(R.id.openingText);
        TextView closing =findViewById(R.id.closingText);

        // when a date is pressed
        calenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int day) {
                String text = "Selected Day: " + day +", " + (month+1) +", " + year; // add Dow
                selectedDay.setText(text);

                ArrayList<Student> emptyList= new ArrayList<>();
                Schedule schedule = new Schedule(calenderView, emptyList);

                // display opening and closing shifts
                opening.setText("Opening Shift: Student a, Student d");
                closing.setText("Closing Shift: Student b, Student c");
            }
        });


    }

    // menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.schedule_menu, menu);
        return true;
    }

    // menu item selected action
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.editSchedule:
            case R.id.newSchedule:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


//    // build schedule
//    private Schedule buildSchedule(){
//        ArrayList<Student> students ;
//        return null;
//    }




}
