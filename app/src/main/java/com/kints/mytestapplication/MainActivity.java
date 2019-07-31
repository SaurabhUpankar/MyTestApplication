package com.kints.mytestapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
 ListView listview;
 String[]mobile={"Appple","Blackberry","Nokia","Samsung","Redmi","Oppo","Vivo","Realme"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.mobile_list);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mobile);
        listview.setAdapter(adapter);
    }
}
