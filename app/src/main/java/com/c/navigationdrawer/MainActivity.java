package com.c.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpenDrawer = findViewById(R.id.btnShowDrawer);
        final DrawerLayout drawer = findViewById(R.id.drawerLayout);

      btnOpenDrawer.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              drawer.openDrawer(GravityCompat.START);
          }
      });

    }
}
