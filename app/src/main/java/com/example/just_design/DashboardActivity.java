package com.example.just_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView greetingText = findViewById(R.id.greetingText);
        LinearLayout manipulate = findViewById(R.id.manipulate);
        LinearLayout showAll = findViewById(R.id.showAll);
        LinearLayout addNew = findViewById(R.id.addNew);

        showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, DisplayDataActivity.class);
                startActivity(intent);
            }
        });

        addNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, InputActivity.class);
                startActivity(intent);
            }
        });

        manipulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ManipulateActivity.class);
                startActivity(intent);
            }
        });

        // Mendapatkan waktu saat ini
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        // Menentukan selamat pagi atau selamat malam berdasarkan waktu
        if (hourOfDay >= 0 && hourOfDay < 12) {
            greetingText.setText("Good Morning,");
        } else if (hourOfDay >= 12 && hourOfDay < 18) {
            greetingText.setText("Good Afternoon,");
        } else if (hourOfDay >= 18 && hourOfDay < 0) {
            greetingText.setText("Good Evening,");
        }
    }


}