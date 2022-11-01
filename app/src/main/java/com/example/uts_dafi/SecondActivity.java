package com.example.uts_dafi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView TVNAMA, TVNOMOR, TVJALUR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TVNAMA = findViewById(R.id.TVNAMA);
        TVNOMOR = findViewById(R.id.TVNOMOR);
        TVJALUR = findViewById(R.id.TVJALUR);

        Intent intent = getIntent();

        TVNAMA.setText(intent.getStringExtra("VarNama"));
        TVNOMOR.setText(intent.getStringExtra("VarNomor"));
        TVJALUR.setText(intent.getStringExtra("VarJalur"));


    }
}