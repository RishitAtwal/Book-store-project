package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListDetails2 extends AppCompatActivity {
    TextView t3, tc;
    ImageView book3;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details2);
        book3 = (ImageView) findViewById(R.id.book3);
        t3 = (TextView) findViewById(R.id.t3);
        tc = (TextView) findViewById(R.id.tc);
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListDetails2.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
