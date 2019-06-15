package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListDetails1 extends AppCompatActivity {
    TextView t2, tb;
    ImageView book2;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details1);
        book2 = (ImageView) findViewById(R.id.book2);
        t2 = (TextView) findViewById(R.id.t2);
        tb = (TextView) findViewById(R.id.tb);
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListDetails1.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
