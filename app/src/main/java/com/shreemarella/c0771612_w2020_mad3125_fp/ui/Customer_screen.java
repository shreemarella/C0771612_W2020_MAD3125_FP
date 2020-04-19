package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        getMenuInflater().inflate(R.menu.add_bill, menu);
        return true;
    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.menu3:
//                Intent intent3 = new Intent(Customer_screen.this, newHydroBill.class);
//                startActivity(intent3);
//
//                return true;
//            case R.id.menu4:
//
//                Intent intent4 = new Intent(Customer_screen.this, newmobileBill.class);
//                startActivity(intent4);
//                return true;
//            case R.id.menu5:
//
//                Intent intent5 = new Intent(Customer_screen.this, newInternetBill.class);
//                startActivity(intent5);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }

}
