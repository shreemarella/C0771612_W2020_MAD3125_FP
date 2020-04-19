package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.shreemarella.c0771612_w2020_mad3125_fp.R;
import com.shreemarella.c0771612_w2020_mad3125_fp.customeradapter.billsadapter;

import java.util.ArrayList;

public class Customer_screen extends AppCompatActivity
{
    private TextView CustomerId;
    private TextView FullName;
    private TextView Email;
    private TextView TotalAmountToPay;
    private RecyclerView rvBills;
    private billsadapter Billsadapter;
    private ArrayList billsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_screen);
        CustomerId = findViewById(R.id.txtCustomerId);
        FullName = findViewById(R.id.txtCustomerName);
        Email = findViewById(R.id.txtCustomerEmail);
        TotalAmountToPay = findViewById(R.id.txtCustomerTotalAmount);
        rvBills=findViewById(R.id.rvbills);
    }
}
