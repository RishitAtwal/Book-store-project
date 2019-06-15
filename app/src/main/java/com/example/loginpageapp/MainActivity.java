package com.example.loginpageapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView head, about, cont, thank;
    Button call, login, menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        head = (TextView) findViewById(R.id.head);
        about = (TextView) findViewById(R.id.about);
        cont = (TextView) findViewById(R.id.cont);
        thank = (TextView) findViewById(R.id.thank);
        call = (Button) findViewById(R.id.call);
        final String number="8920491045";
        login = (Button) findViewById(R.id.login);
        menu = (Button) findViewById(R.id.menu);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, login_book.class);
                startActivity(i);
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this, list.class);
                startActivity(i1);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},0);
                }
                else
                {
                    Intent i= new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+number));
                    startActivity(i);
                }
            }
        });
    }
}
