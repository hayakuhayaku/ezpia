package com.example.rais.ezpia;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mulai, bantuan, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulai = (Button) findViewById(R.id.start);
        bantuan = (Button) findViewById(R.id.help);
        keluar = (Button) findViewById(R.id.exit);

        mulai.setOnClickListener(this);
        keluar.setOnClickListener(this);
        bantuan.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.start){
            Intent intent = new Intent(this, nampan.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.help){
            Intent intent = new Intent(this, penjelasan.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.exit){
            finish();
            System.exit(0);
        }
    }
}
