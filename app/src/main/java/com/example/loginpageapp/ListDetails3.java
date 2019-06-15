package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListDetails3 extends AppCompatActivity {
    TextView t4, td;
    ImageView book4;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details3);
        book4 = (ImageView) findViewById(R.id.book4);
        t4 = (TextView) findViewById(R.id.t4);
        td = (TextView) findViewById(R.id.td);
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListDetails3.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
