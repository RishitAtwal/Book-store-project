package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListDetails9 extends AppCompatActivity {
    TextView t10, tj;
    ImageView book10;
    Button b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details9);
        book10 = (ImageView) findViewById(R.id.book10);
        t10 = (TextView) findViewById(R.id.t10);
        tj = (TextView) findViewById(R.id.tj);
        b10 = (Button) findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListDetails9.this, "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
