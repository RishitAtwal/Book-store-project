package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListDetails extends AppCompatActivity {
    ImageView book1;
    TextView t1,ta;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details);
        book1 = (ImageView) findViewById(R.id.book1);
        t1 = (TextView) findViewById(R.id.t1);
        ta = (TextView) findViewById(R.id.ta);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListDetails.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
