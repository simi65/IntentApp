package com.miss.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //deklarasi
    Button btnIntent, btnIntentData, btnIntentImplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntent = findViewById(R.id.btn_intent);
        btnIntentData = findViewById(R.id.btn_intent_data);
        btnIntentImplicit = findViewById(R.id.btn_intent_implicit);

        btnIntent.setOnClickListener(this);
        btnIntentData.setOnClickListener(this);
        btnIntentImplicit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_intent:
                //kasih alamat untuk perpidahan activity
                Intent pindah_activity = new Intent(MainActivity.this, IntentActivity.class);
                //untuk perpindahan activity
                startActivity(pindah_activity);
                break;

            case R.id.btn_intent_data:
                Intent pindah_activity_dengan_data = new Intent(MainActivity.this, IntentData.class);
                startActivity(pindah_activity_dengan_data);
                break;

            case R.id.btn_intent_implicit:
                Intent inten_implicit = new Intent(MainActivity.this, IntentImplicit.class);
                startActivity(inten_implicit);
                break;
        }
    }
}
