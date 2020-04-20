package com.shreemarella.c0771612_w2020_mad3125_fp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.shreemarella.c0771612_w2020_mad3125_fp.R;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.customer;
import com.shreemarella.c0771612_w2020_mad3125_fp.repo.StringExtension;
import com.shreemarella.c0771612_w2020_mad3125_fp.repo.customerRepository;

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
                }else if((StringExtension.emailValidation(edtCEmail.getText().toString())) == true)
                {
                    customer tempObj = new customer(edtCustomerID.getText().toString(),edtFirstName.getText().toString(),edtLastName.getText().toString(),edtCEmail.getText().toString());
                    customerRepository.getInstance().addcustomer(tempObj);
                    finish();

//                } else if()  {
//                    AlertDialog.Builder alert = new AlertDialog.Builder(details_customers.this);
//                    alert.setCancelable(false);
//                    alert.setTitle("New Customer Creation Error");
//                    alert.setMessage("Invalid Email");
//                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            dialog.dismiss();
//                        }
//                    });
//                    alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            dialog.cancel();
//                        }
//                    });
//                    AlertDialog aDialog = alert.create();
//                    aDialog.show();
                } else  {
                    edtCEmail.setError("enter Valid email");
                }

            }
        });
    }
}
