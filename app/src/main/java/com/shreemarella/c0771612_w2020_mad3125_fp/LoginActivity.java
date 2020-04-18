package com.shreemarella.c0771612_w2020_mad3125_fp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class LoginActivity extends AppCompatActivity
{
    private EditText Email;
    private EditText Password;
    private Switch Remember;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Email=findViewById(R.id.edtEmail);
        Password=findViewById(R.id.edtPassword);
        Remember=findViewById(R.id.swtRemember);
        login=findViewById(R.id.btnLogin);

        SharedPreferences sharedPreferences = getSharedPreferences("login",MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        Email.setText(sharedPreferences.getString("email",null);
        Password.setText(sharedPreferences.getString("password",null));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email1 = Email.getText().toString().trim();
                String password1 = Password.getText().toString().trim();

                if(email1.isEmpty()){
                    Email.setError("Please enter email");
                } else if(password1.isEmpty()){
                    Password.setError("Please enter password");
                } else if(Email.getText().toString().equals("Shree@gmail.com") && Password.getText().toString().equals("shree123")){
                    String email = Email.getText().toString();
                    String password = Password.getText().toString();
                    if (Remember.isChecked()){
                        editor.putString("email",email);
                        editor.putString("password",password);
                        editor.apply();

                        //Intent intent = new Intent(LoginActivity.this, .class);
                        //startActivity(intent);
                    }else {
                        editor.clear();
                        editor.apply();

                        //Intent intent = new Intent(LoginActivity.this, .class);
                        //startActivity(intent);
                    }
                }
                else {
//                    AlertDialog.Builder alert = new AlertDialog.Builder(LoginActivity.this);
//                    alert.setCancelable(false);
//                    alert.setTitle("Login Error");
//                    alert.setMessage("Invalid User ID or Password");
                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog aDialog = alert.create();
                    aDialog.show();
                }
            }
        });





    }
}
