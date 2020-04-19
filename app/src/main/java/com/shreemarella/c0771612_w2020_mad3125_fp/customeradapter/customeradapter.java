package com.shreemarella.c0771612_w2020_mad3125_fp.customeradapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shreemarella.c0771612_w2020_mad3125_fp.R;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.customer;
import com.shreemarella.c0771612_w2020_mad3125_fp.repo.customerRepository;

public class customeradapter extends RecyclerView.Adapter<customeradapter.customerviewholder>
{
    @NonNull
    @Override
    public customeradapter.customerviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listcustomers, parent, false);
        customerviewholder mCustomerViewHolder = new customerviewholder(mView);
        return mCustomerViewHolder;
    }


}
