package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListDetails5 extends AppCompatActivity {
    TextView t6, tf;
    ImageView book6;
    Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details5);
        book6 = (ImageView) findViewById(R.id.book6);
        t6 = (TextView) findViewById(R.id.t6);
        tf = (TextView) findViewById(R.id.tf);
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListDetails5.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
