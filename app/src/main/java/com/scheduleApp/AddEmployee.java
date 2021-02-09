package com.scheduleApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * AddEmployee adds an employee to the company
 */
public class AddEmployee extends AppCompatActivity {

    // string names for first and last name to create Student object
    private String firstName = "", lastName = "";

    /**
     * onCreate adds an employee using activity_add_employee.xml and code below
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        // editTexts holding first and last name
        EditText editTextFirstName = (EditText) findViewById(R.id.editTextFirstName);
        EditText editTextLastName = (EditText) findViewById(R.id.editTextLastName);

        // textviews for each week day
        TextView teMonday = (TextView) findViewById(R.id.textViewMonday);
        TextView teTuesday = (TextView) findViewById(R.id.textViewTuesday);
        TextView teWednesday = (TextView) findViewById(R.id.textViewWednesday);
        TextView teThursday = (TextView) findViewById(R.id.textViewThursday);
        TextView teFriday = (TextView) findViewById(R.id.textViewFriday);
        TextView teSaturday = (TextView) findViewById(R.id.textViewSaturday);
        TextView teSunday = (TextView) findViewById(R.id.textViewSunday);

        // edittext of start and end of shift for each day of the week
        EditText etMondayStart = (EditText) findViewById(R.id.editTextMondayStart);
        EditText etMondayClose = (EditText) findViewById(R.id.editTextMondayClose);

        EditText etTuesdayStart = (EditText) findViewById(R.id.editTextTuesdayStart);
        EditText etTuesdayClose = (EditText) findViewById(R.id.editTextTuesdayClose);

        EditText etWednesdayStart = (EditText) findViewById(R.id.editTextWednesdayStart);
        EditText etWednesdayClose = (EditText) findViewById(R.id.editTextWednesdayClose);

        EditText etThursdayStart = (EditText) findViewById(R.id.editTextThursdayStart);
        EditText etThursdayClose = (EditText) findViewById(R.id.editTextThursdayClose);

        EditText etFridayStart = (EditText) findViewById(R.id.editTextFridayStart);
        EditText etFridayClose = (EditText) findViewById(R.id.editTextFridayClose);

        EditText etSaturdayStart = (EditText) findViewById(R.id.editTextSaturdayStart);
        EditText etSaturdayClose = (EditText) findViewById(R.id.editTextSaturdayClose);

        EditText etSundayStart = (EditText) findViewById(R.id.editTextSundayStart);
        EditText etSundayClose = (EditText) findViewById(R.id.editTextSundayClose);

        // add button on the end of the of screen to add student
        Button addButton = (Button) findViewById(R.id.buttonAddEmployee);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}