package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListDetails6 extends AppCompatActivity {
    TextView t7, tg;
    ImageView book7;
    Button b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details6);
        book7 = (ImageView) findViewById(R.id.book7);
        t7 = (TextView) findViewById(R.id.t7);
        tg = (TextView) findViewById(R.id.tg);
        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListDetails6.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
