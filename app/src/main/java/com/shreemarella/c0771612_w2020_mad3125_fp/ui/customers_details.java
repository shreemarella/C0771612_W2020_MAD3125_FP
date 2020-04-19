package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.shreemarella.c0771612_w2020_mad3125_fp.R;

public class customers_details extends AppCompatActivity
{
    private TextInputEditText edtCustomerID;
    private TextInputEditText edtFirstName;
    private TextInputEditText edtLastName;
    private TextInputEditText edtCEmail;
    private Button CAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers_details);
        edtCustomerID=findViewById(R.id.customerIDTextInputEditText);
        edtFirstName=findViewById(R.id.firstNameTextInputEditText);
        edtLastName=findViewById(R.id.lastNameTextInputEditText);
        edtCEmail=findViewById(R.id.customerEmailTextInputEditText);
        CAdd=findViewById(R.id.customerbutton);

        CAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cID = edtCustomerID.getText().toString().trim();
                String fName = edtFirstName.getText().toString().trim();
                String lName = edtLastName.getText().toString().trim();
                String cEmail = edtCEmail.getText().toString().trim();

                if(cID.isEmpty()){
                    edtCustomerID.setError("Enter Customer ID");
                } else if(fName.isEmpty()){
                    edtFirstName.setError("Enter First Name");
                } else if(lName.isEmpty()){
                    edtLastName.setError("Enter Last Name");
                } else if(cEmail.isEmpty()){
                    edtCEmail.setError("Enter email");
                }
    }
}
