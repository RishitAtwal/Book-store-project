package com.example.loginpageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class login_book extends AppCompatActivity {

    EditText name, email, pno, address;
    RadioGroup group;
    Button submit;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_book);
            name = (EditText) findViewById(R.id.name);
            email = (EditText) findViewById(R.id.email);
            pno = (EditText) findViewById(R.id.pno);
            address = (EditText) findViewById(R.id.address);
            group = (RadioGroup) findViewById(R.id.group);
            txt = (TextView) findViewById(R.id.txt1);
            submit = (Button) findViewById(R.id.submit);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String fullname = name.getText().toString();
                    String emailid = email.getText().toString();
                    String phone = pno.getText().toString();
                    String add = address.getText().toString();
                    if (TextUtils.isEmpty(fullname)) {
                        name.setError("Enter full name");
                    } else if (TextUtils.isEmpty(emailid)) {
                        email.setError("Enter email id");
                    } else if (TextUtils.isEmpty(phone)) {
                        pno.setError("Enter phone number");
                    } else if (TextUtils.isEmpty(add)) {
                        address.setError("Enter address");
                    } else {
                        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int i) {
                                TextView txt = (TextView) findViewById(i);
                                Toast.makeText(login_book.this, txt.getText().toString(), Toast.LENGTH_SHORT).show();
                            }
                        });
                        Toast.makeText(login_book.this, "submitted", Toast.LENGTH_SHORT).show();


                    }

                }


            });
        }
}
