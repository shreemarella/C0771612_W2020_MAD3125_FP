package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import com.shreemarella.c0771612_w2020_mad3125_fp.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class addNewBill extends AppCompatActivity implements  AdapterView.OnItemSelectedListener
{
    private TextView billID;
    private TextView billDate;
    private TextView unitsUsed;
    private TextView agencyName;
    private TextView minutesUsed;
    private TextView manufacturerName;
    private TextView planName;
    private Spinner spbillType;
    private TextView mobilenumber;
    private TextView dataused;
    private Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_bill);
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.hide();

        btnAdd=findViewById(R.id.btnAdd);
        billID=findViewById(R.id.BillIDTextInputEditText);
        billDate = findViewById(R.id.BillDateTextInputEditText);
        unitsUsed = findViewById(R.id.enterunitsusedInputEditText);
        agencyName = findViewById(R.id.enteragencynameInputEditText);
        minutesUsed = findViewById(R.id.enterminutesusedInputEditText);
        manufacturerName = findViewById(R.id.entermanufacturernameInputEditText);
        planName = findViewById(R.id.enteryourplannameInputEditText);
        mobilenumber = findViewById(R.id.mobilenumberInputEditText);
        dataused = findViewById(R.id.datausedInputEditText);
        spbillType = findViewById(R.id.spinnertype);

        ArrayList<String> billType = new ArrayList<>();
        billType.add("MOBILE");
        billType.add("HYDRO");
        billType.add("INTERNET");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, billType);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spbillType.setAdapter(dataAdapter);

        spbillType.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        final Calendar myCalendar = Calendar.getInstance();
        String myFormat = "MM/dd/yy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                String myFormat = "MM/dd/yy";
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                billDate.setText(sdf.format(myCalendar.getTime()));
                billDate.setTextColor(Color.BLACK);

            }

        };

        billDate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new DatePickerDialog(addNewBill.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }

        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
