package com.c.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTask3 extends AppCompatActivity {
    TextView txtWelcom;
    private Button button_review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        final Button btnVerifyPhoneNumber = (Button) findViewById(R.id.BtnReview);


        txtWelcom = findViewById(R.id.txtWelcom);
        final EditText EdtName = (EditText) findViewById(R.id.EdtName);
        final EditText EdtFamily = (EditText) findViewById(R.id.EdtFamily);
        final EditText EdtAge = (EditText) findViewById(R.id.EdtAge);
        final EditText EdtPHONE = (EditText) findViewById(R.id.EdtPhone);
        final EditText EdtAddress = (EditText) findViewById(R.id.EdtAdress);


        String string = PreferenceManager.getDefaultSharedPreferences(ActivityTask3.this)
                .getString("First_Name", "Unknown user, please register!");
        txtWelcom.setText(string);
        btnVerifyPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityTask3.this, UserInformation.class);


                btnVerifyPhoneNumber.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name = EdtName.getText().toString();
                        String family = EdtFamily.getText().toString();
                        String age = EdtAge.getText().toString();
                        String phone = EdtPHONE.getText().toString();
                        String address = EdtAddress.getText().toString();

                        Intent intent = new Intent(ActivityTask3.this, UserInformation.class);
                        intent.putExtra("name", name);
                        intent.putExtra("family", family);
                        intent.putExtra("age", age);
                        intent.putExtra("phone", phone);
                        intent.putExtra("address", address);


                        startActivityForResult(intent, 150);


                    }
                });
            }


        });
    }
}