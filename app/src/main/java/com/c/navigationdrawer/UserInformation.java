package com.c.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserInformation extends AppCompatActivity {

    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);


        TextView Txtname = (TextView) findViewById(R.id.TxtFisrtname);
        TextView Txtfamily = (TextView) findViewById(R.id.TxtSecondName);
        TextView TxtAge = (TextView) findViewById(R.id.TxtTagAge);
        TextView TxtPhone = (TextView) findViewById(R.id.TxtPhoneNumber);
        TextView TxtAddress = (TextView) findViewById(R.id.TxtTagAddress);

        Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        final String family = intent.getStringExtra("family");
        final String age = intent.getStringExtra("age");
        final String phone = intent.getStringExtra("phone");
        final String address = intent.getStringExtra("address");


        Txtname.setText(name);
        Txtfamily.setText(family);
        TxtAge.setText(age);
        TxtPhone.setText(phone);
        TxtAddress.setText(address);


        Button btnVerifyPhoneNumber =  findViewById(R.id.btnEdit);

        btnVerifyPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserInformation.this, ActivityTask3.class);
                startActivity(i);
                finish();


                PreferenceManager
                        .getDefaultSharedPreferences(UserInformation.this)
                        .edit(

                        )
                        .putString("name", name)
                        .apply();
                PreferenceManager
                        .getDefaultSharedPreferences(UserInformation.this)
                        .edit()
                        .putString("family", family)
                        .apply();
                PreferenceManager
                        .getDefaultSharedPreferences(UserInformation.this)
                        .edit()
                        .putString("phone", phone)
                        .apply();
                PreferenceManager
                        .getDefaultSharedPreferences(UserInformation.this)
                        .edit()
                        .putString("_Age", age)
                        .apply();
                PreferenceManager
                        .getDefaultSharedPreferences(UserInformation.this)
                        .edit()
                        .putString("address", address)
                        .apply();


            }
        });


         Button btnConfirm = findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent();
                j.putExtra("welcome", "Your profile data has been saved successfully " + name + " !");
                setResult(ActivityTask3.RESULT_OK, j);
                finish();
            }

        });


    }


}