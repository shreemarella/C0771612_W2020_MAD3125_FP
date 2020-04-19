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

    @Override
    public void onBindViewHolder(@NonNull final customeradapter.customerviewholder holder, final int position) {
        customer mCustomer = customerRepository.getInstance().getCustomers().get(position);
        holder.txtCustomerName.setText(mCustomer.getFullName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer cust = customerRepository.getInstance().getCustomers().get(position);
              //Intent sint = new Intent(holder.itemView.getContext(), Customer_screen.class);
                sint.putExtra("customers", cust);
                holder.itemView.getContext().startActivity(sint);
            }
        });
    }

//    @Override
//    public int getItemCount() {
//        return customerRepository.getInstance().getCustomers().size();
//    }
//
//    public class customerviewholder extends RecyclerView.ViewHolder {
//        TextView txtCustomerName;
//
//        public customerviewholder(@NonNull View itemView) {
//            super(itemView);
//
//            //txtCustomerName = itemView.findViewById(R.id.image_name);
//        }
//    }
}
