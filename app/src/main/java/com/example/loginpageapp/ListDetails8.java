package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListDetails8 extends AppCompatActivity {
    TextView t9, ti;
    ImageView book9;
    Button b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details8);
        book9 = (ImageView) findViewById(R.id.book9);
        t9 = (TextView) findViewById(R.id.t9);
        ti = (TextView) findViewById(R.id.ti);
        b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListDetails8.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
