package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.shreemarella.c0771612_w2020_mad3125_fp.R;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.Bill;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.HydroBill;

public class BillDisplay extends AppCompatActivity
{
    private TextView billtext;
    private ImageView billimg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_display);

        billtext = findViewById(R.id.txtbillDisplay);
        billimg = findViewById(R.id.imgBilldisplay);

        Intent mIntent = getIntent();
        Bill billObj = (Bill) mIntent.getSerializableExtra("billOBJ");
        if(billObj.getBillType().matches("HYDRO"))
        {

            billimg.setImageResource(R.drawable.hydro);

            HydroBill hbillObj = (HydroBill) mIntent.getSerializableExtra("billOBJ");

            billtext.setText("Bill ID    :   "+hbillObj.getBillId()+"\nBill Date    :   "+hbillObj.getBillDate()+"\nBill Type  :   "+hbillObj.getBillType()+"\nAgency Name    :   "+hbillObj.getAgencyname()+"\nUnits Consumed   :    "+hbillObj.getUnitsconsumed()+"\nBill Amount   :    "+hbillObj.getAgencyname());

        }



    }
}
