package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.shreemarella.c0771612_w2020_mad3125_fp.R;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.customer;
import com.shreemarella.c0771612_w2020_mad3125_fp.customeradapter.customeradapter;
import com.shreemarella.c0771612_w2020_mad3125_fp.repo.customerRepository;

import java.util.ArrayList;

public class customers_list extends AppCompatActivity
{
    private RecyclerView rvCustomerList;
    private ArrayList<customer> customers;
    private com.shreemarella.c0771612_w2020_mad3125_fp.customeradapter.customeradapter customeradapter;

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

//        customerRepository.getInstance().loadDetails();
//        customers = new ArrayList<>(customerRepository.getInstance().getCustomers());
        customeradapter = new customeradapter();
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rvCustomerList.setLayoutManager(mLayoutManager);

        rvCustomerList.setAdapter(customeradapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {         //https://javatpoint.com/android-option-menu-example

        getMenuInflater().inflate(R.menu.newcustomer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu1:
                Intent intent2 = new Intent(customers_list.this, customers_details.class);
                startActivity(intent2);

                return true;
            case R.id.menu2:

                Intent intent = new Intent(customers_list.this, LoginActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
