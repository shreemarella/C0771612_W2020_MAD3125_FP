package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.shreemarella.c0771612_w2020_mad3125_fp.R;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.customer;
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

        customer tobj = (customer) getIntent().getParcelableExtra("customers");

        billsArray= tobj.getBills();

        CustomerId.setText(tobj.getCustomerId());
        FullName.setText(tobj.getFullName());
        Email.setText(tobj.getEmailId());
        customersInfo();
    }

    private void customersInfo()
    {
        Billsadapter= new billsadapter(this.billsArray);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvBills.setLayoutManager(mLayoutManager);
        rvBills.setAdapter((RecyclerView.Adapter) Billsadapter);

    }

}
