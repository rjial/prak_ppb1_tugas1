package com.rijal.curicullumvitae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNama, txtEmail, txtTTL, txtDeskripsi;
    Button btnTampil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNama = (TextView) findViewById(R.id.txtNama);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtTTL = (TextView) findViewById(R.id.txtTTL);
        txtDeskripsi = (TextView) findViewById(R.id.txtDeskripsi);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNama.setText("Rizal Abdul Basith");
                txtEmail.setText("201111027@mhs.stiki.ac.id");
                txtTTL.setText("Malang, 24 Juli 2000");
                txtDeskripsi.setText(getString(R.string.bio));
            }
        });
    }
}