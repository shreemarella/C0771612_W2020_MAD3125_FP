package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import com.shreemarella.c0771612_w2020_mad3125_fp.R;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.HydroBill;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.InternetBill;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.MobileBill;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.customer;
import com.shreemarella.c0771612_w2020_mad3125_fp.repo.StringExtension;

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
    private TextView billamount;
    private Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_bill);
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.hide();

        btnAdd=findViewById(R.id.btnAdd);
        billID=findViewById(R.id.BillDtxtipet);
        billDate = findViewById(R.id.BillDatetxtipet);
        unitsUsed = findViewById(R.id.enterunitsusedtxtipet);
        agencyName = findViewById(R.id.enteragencynametxtipet);
        minutesUsed = findViewById(R.id.enterminutesusedtxtipet);
        manufacturerName = findViewById(R.id.entermanufacturernametxtipet);
        planName = findViewById(R.id.enteryourplannametxtipet);
        mobilenumber = findViewById(R.id.mobilenumbertxtipet);
        dataused = findViewById(R.id.datausedtxtipet);
        spbillType = findViewById(R.id.SpinnerType);
        billamount=findViewById(R.id.billAmounttxtipet);

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
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK);
        ((TextView) parent.getChildAt(0)).setTextSize(18);
        ((TextView) parent.getChildAt(0)).setTypeface(null, Typeface.BOLD);

        if(position == 0)
        {
            initFields();
            clearfields();
            unitsUsed.setVisibility(View.INVISIBLE);
            agencyName.setVisibility(View.INVISIBLE);
            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(StringExtension.mobileValidation(mobilenumber.getText().toString()) == true) {

                        Intent mIntent = getIntent();
                        customer customerObj = mIntent.getParcelableExtra("CustomerOBJ");


                        MobileBill tempmobile = new MobileBill(billID.getText().toString(), billDate.getText().toString(), spbillType.getSelectedItem().toString(), Double.parseDouble(billamount.getText().toString()), manufacturerName.getText().toString(), planName.getText().toString(), mobilenumber.getText().toString(), Integer.parseInt(dataused.getText().toString()), Integer.parseInt(minutesUsed.getText().toString()));

                        customerObj.addBill(tempmobile.getBillId(), tempmobile);

                        Intent intent3 = new Intent(addNewBill.this, Customer_screen.class);

                        intent3.putExtra("CustomerOBJ", customerObj);

                        startActivity(intent3);
                    }else{
                        mobilenumber.setError("Enter Valid Mobile Number");
                    }


                }
            });
        }
        if(position == 1)
        {
            hidefields();
            clearfields();
            unitsUsed.setVisibility(View.VISIBLE);
            agencyName.setVisibility(View.VISIBLE);
            agencyName.setHint("ENTER AGENCY NAME");
//            unitsUsed.setHint("ENTER UNITS USED");
            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mIntent = getIntent();
                    customer customerObj = mIntent.getParcelableExtra("CustomerOBJ");


                    HydroBill tempHydro = new HydroBill(billID.getText().toString(),billDate.getText().toString(),spbillType.getSelectedItem().toString(),Double.parseDouble(billamount.getText().toString()),agencyName.getText().toString(),Integer.parseInt(unitsUsed.getText().toString()));

                    customerObj.addBill(tempHydro.getBillId(),tempHydro);
                    Intent intent3 = new Intent(addNewBill.this,Customer_screen.class);

                    intent3.putExtra("CustomerOBJ",customerObj);

                    startActivity(intent3);






                }
            });
        }

        if(position == 2)
        {
            hidefields();
            clearfields();
            dataused.setVisibility(View.VISIBLE);
            agencyName.setVisibility(View.VISIBLE);
            agencyName.setHint("ENTER PROVIDER NAME");
//            unitsUsed.setHint("ENTER DATA USED");
            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mIntent = getIntent();
                    customer customerObj = mIntent.getParcelableExtra("CustomerOBJ");

                    InternetBill tempinternet = new InternetBill(billID.getText().toString(),billDate.getText().toString(),spbillType.getSelectedItem().toString(),Double.parseDouble(billamount.getText().toString()),agencyName.getText().toString(),Integer.parseInt(billamount.getText().toString()));


                    customerObj.addBill(tempinternet.getBillId(),tempinternet);
                    Intent intent3 = new Intent(addNewBill.this,Customer_screen.class);

                    intent3.putExtra("CustomerOBJ",customerObj);

                    startActivity(intent3);



                }
            });
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void initFields()
    {
        minutesUsed.setVisibility(View.VISIBLE);
        mobilenumber.setVisibility(View.VISIBLE);
        dataused.setVisibility(View.VISIBLE);
        minutesUsed.setVisibility(View.VISIBLE);
        planName.setVisibility(View.VISIBLE);
        manufacturerName.setVisibility(View.VISIBLE);
    }
    public void hidefields()
    {
        minutesUsed.setVisibility(View.INVISIBLE);
        mobilenumber.setVisibility(View.INVISIBLE);
        dataused.setVisibility(View.INVISIBLE);
        minutesUsed.setVisibility(View.INVISIBLE);
        planName.setVisibility(View.INVISIBLE);
        manufacturerName.setVisibility(View.INVISIBLE);
    }

    public void clearfields()
    {
        mobilenumber.setText("");
        dataused.setText("");
        minutesUsed.setText("");
        planName.setText("");
        manufacturerName.setText("");
        billDate.setText("");
        billID.setText("");
        agencyName.setText("");
        dataused.setText("");
        unitsUsed.setText("");
    }
}
