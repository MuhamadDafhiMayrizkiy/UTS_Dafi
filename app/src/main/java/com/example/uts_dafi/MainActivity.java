package com.example.uts_dafi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Nama_et, Nomor_et;
    Spinner SpinnerJalur;
    Button btn_daftar;
    CheckBox Cb_jalur;

    String Nama, Nomor_pd, jalur_df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama_et = findViewById(R.id.Nama_et);
        Nomor_et =findViewById(R.id.Nomor_et);
        SpinnerJalur = findViewById(R.id.SpinnerJalur);
        btn_daftar = findViewById(R.id.btn_daftar);
        Cb_jalur = findViewById(R.id.Cb_jalur);

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nama = Nama_et.getText().toString();
                Nomor_pd = Nomor_et.getText().toString();
                jalur_df = SpinnerJalur.getSelectedItem().toString();


                if (Nama.trim().equals("")){
                    Nama_et.setError("Nama Tidak Boleh Kosong");
                }
                else if (Nomor_pd.trim().equals("")){
                    Nomor_et.setError("Nomor Pendaftaran Tidak boleh kosong");
                } else{
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("VarNama", String.valueOf(Nama));
                    intent.putExtra("VarNomor", String.valueOf(Nomor_pd));
                    intent.putExtra("VarJalur", String.valueOf(jalur_df));
                    startActivity(intent);
                }


            }
        });

        Cb_jalur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Cb_jalur.isChecked()) {
                    Toast.makeText(MainActivity.this, "Konfirmasi", Toast.LENGTH_SHORT).show();
                } else if (!Cb_jalur.isChecked()){
                    Toast.makeText(MainActivity.this, "Silahkan centang konfirmasi", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}