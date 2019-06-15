package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListDetails4 extends AppCompatActivity {
    TextView t5, te;
    ImageView book5;
    Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details4);
        book5 = (ImageView) findViewById(R.id.book5);
        t5 = (TextView) findViewById(R.id.t5);
        te = (TextView) findViewById(R.id.te);
        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListDetails4.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
