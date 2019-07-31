package com.kints.mytestapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    Spinner spinner;
    String[] mobile = {"Appple", "Blackberry", "Nokia", "Samsung", "Redmi", "Oppo", "Vivo", "Realme"};
    String[] country = {"India", "USA", "China", "Japan", "Other"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.mobile_list);
        spinner=findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, mobile);
        listview.setAdapter(adapter);

        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,country);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
    }
}
