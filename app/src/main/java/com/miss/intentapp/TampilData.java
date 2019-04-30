package com.miss.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.miss.intentapp.IntentData.KEY_DATE;
import static com.miss.intentapp.IntentData.KEY_NAME;

public class TampilData extends AppCompatActivity {

    TextView nama, tanggal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);

        nama = findViewById(R.id.namaData);
        tanggal = findViewById(R.id.tanggalData);

        Intent data = getIntent();
        String name = data.getStringExtra(KEY_NAME);
        String date = data.getStringExtra(KEY_DATE);

        nama.setText(String.valueOf(name));
        tanggal.setText(String.valueOf(date));
    }
}
