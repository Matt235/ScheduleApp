package com.scheduleApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // button to go to schedule activity
        Button toSchedule = findViewById(R.id.toSchedule);

        // set action
        toSchedule.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, ScheduleActivity.class));
            }
        });

        // button to go to schedule activity
        Button toStudents = (Button) findViewById(R.id.toStudents);

        toStudents.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, AddEmployee.class));
            }
        });

    }



}