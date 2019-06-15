package com.example.loginpageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class list extends AppCompatActivity {
    ListView list;
    TextView head;
    String data[]={"You Can Win","The Forest of Enchantment","The Paradoxical Prime Minister","The Fault in Our Stars","A Brief History of Time","India Positive","Revolution 2020","The Giver","Pride and Prejudice","Game of Destiny"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list = (ListView) findViewById(R.id.list);
        head = (TextView) findViewById(R.id.head);
        ArrayAdapter adapter = new ArrayAdapter(list.this, R.layout.activity_list2, data);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent s1 = new Intent(list.this, ListDetails.class);
                        startActivity(s1);
                        break;
                    case 1:
                        Intent s2 = new Intent(list.this, ListDetails1.class);
                        startActivity(s2);
                        break;
                    case 2:
                        Intent s3 = new Intent(list.this, ListDetails2.class);
                        startActivity(s3);
                        break;
                    case 3:
                        Intent s4 = new Intent(list.this, ListDetails3.class);
                        startActivity(s4);
                        break;
                    case 4:
                        Intent s5 = new Intent(list.this, ListDetails4.class);
                        startActivity(s5);
                        break;
                    case 5:
                        Intent s6 = new Intent(list.this, ListDetails5.class);
                        startActivity(s6);
                        break;
                    case 6:
                        Intent s7 = new Intent(list.this, ListDetails6.class);
                        startActivity(s7);
                        break;
                    case 7:
                        Intent s8 = new Intent(list.this, ListDetails7.class);
                        startActivity(s8);
                        break;
                    case 8:
                        Intent s9 = new Intent(list.this, ListDetails8.class);
                        startActivity(s9);
                        break;
                    case 9:
                        Intent s10 = new Intent(list.this, ListDetails9.class);
                        startActivity(s10);
                        break;

                }
            }
        });

    }
}
