package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListDetails7 extends AppCompatActivity {
    TextView t8, th;
    ImageView book8;
    Button b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details7);
        book8 = (ImageView) findViewById(R.id.book8);
        t8 = (TextView) findViewById(R.id.t8);
        th = (TextView) findViewById(R.id.th);
        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListDetails7.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
