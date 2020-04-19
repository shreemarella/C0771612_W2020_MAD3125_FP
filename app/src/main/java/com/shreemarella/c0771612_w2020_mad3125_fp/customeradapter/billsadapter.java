package com.shreemarella.c0771612_w2020_mad3125_fp.customeradapter;

import androidx.recyclerview.widget.RecyclerView;

import com.shreemarella.c0771612_w2020_mad3125_fp.classes.Bill;

import java.util.ArrayList;

public class billsadapter extends RecyclerView.Adapter<billsadapter.ViewHolder>
{
    private static ArrayList<Bill> billArrayList;
    public billsadapter(ArrayList<Bill> billArrayList)
    {
        this.billArrayList = billArrayList;
    }

    public billsadapter()
    {

    }
    

}
