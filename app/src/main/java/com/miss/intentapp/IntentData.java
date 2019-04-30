package com.miss.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntentData extends AppCompatActivity {


     static final String KEY_NAME = "nama";
     static final String KEY_DATE ="tanggal" ;
    TextView nama, tanggal;
    Button btnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_data);

        nama = findViewById(R.id.nama);
        tanggal  = findViewById(R.id.tanggal);

        btnShow = findViewById(R.id.btn_show);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nama.getText().toString();
                String date = tanggal.getText().toString();

                Intent pindah_dengan_data = new Intent(IntentData.this, TampilData.class);
                pindah_dengan_data.putExtra(KEY_NAME, name);
                pindah_dengan_data.putExtra(KEY_DATE, date);

                startActivity(pindah_dengan_data);
            }

        });
    }
}
