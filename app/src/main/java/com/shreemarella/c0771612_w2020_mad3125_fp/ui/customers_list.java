package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shreemarella.c0771612_w2020_mad3125_fp.R;

import java.util.ArrayList;

public class customers_list extends AppCompatActivity
{
    private RecyclerView rvCustomerList;
    private ArrayList<customer> customers;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rvCustomerList=findViewById(R.id.rvcustomerlist);

        customersInfo();
    }
    protected void onRestart() {

        super.onRestart();

        customersInfo();
    }

    private void customersInfo()
    {

    }
}
