package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.shreemarella.c0771612_w2020_mad3125_fp.R;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.Bill;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.HydroBill;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.InternetBill;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.MobileBill;

public class BillDisplay extends AppCompatActivity
{
    private TextView billtext;
    private ImageView billimg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_display);

        billtext = findViewById(R.id.txtBDisplay);
        billimg = findViewById(R.id.imgBDisplay);

        Intent mIntent = getIntent();
        Bill billObj = (Bill) mIntent.getSerializableExtra("billOBJ");
        if(billObj.getBillType().matches("HYDRO"))
        {

            billimg.setImageResource(R.drawable.hydro);

            HydroBill hbillObj = (HydroBill) mIntent.getSerializableExtra("billOBJ");

            billtext.setText("Bill ID    :   "+hbillObj.getBillId()+"\nBill Date    :   "+hbillObj.getBillDate()+"\nBill Type  :   "+hbillObj.getBillType()+"\nAgency Name    :   "+hbillObj.getAgencyName()+"\nUnits Consumed   :    "+hbillObj.getUnitsConsumed()+"\nBill Amount   :    "+hbillObj.getAgencyName());

        }else if(billObj.getBillType().matches("MOBILE"))
        {
            billimg.setImageResource(R.drawable.smartphone);

            MobileBill mbillObj = (MobileBill) mIntent.getSerializableExtra("billOBJ");

            billtext.setText("Bill ID    :   "+mbillObj.getBillId()+"\nBill Date    :   "+mbillObj.getBillDate()+"\nBill Type  :   "+mbillObj.getBillType()+"\nMobile No    :   "+mbillObj.getMobileNo()+"\nModel Name  :   "+mbillObj.getMobileManufacturer()+"\nPlan Name  :   "+mbillObj.getPlanName()+"\nInternet Used   :   "+mbillObj.getInternetGBused()+"\nMinutes used    :   "+mbillObj.getMinutesUsed()+"\nBill Amount  :   "+mbillObj.getTotalBillAmount());

        }else if(billObj.getBillType().matches("INTERNET"))
        {
            billimg.setImageResource(R.drawable.smarthouse);

            InternetBill ibillObj = (InternetBill) mIntent.getSerializableExtra("billOBJ");

            billtext.setText("Bill ID    :   "+ibillObj.getBillId()+"\nBill Date    :   "+ibillObj.getBillDate()+"\nBill Type  :   "+ibillObj.getBillType()+"\nInternet Provider  :   "+ibillObj.getProviderName()+"\nInternet Used  :  "+ibillObj.getInternetGBused()+"\nBill Amount  :   "+ibillObj.getTotalBillAmount());

        }else {

            billtext.setText("no bill found");
        }



    }
}
