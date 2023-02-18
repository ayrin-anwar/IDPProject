package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Main2Activity extends AppCompatActivity {


    GridView simpleGrid;
    int logos[] = {R.drawable.temp1, R.drawable.sun, R.drawable.water2, R.drawable.chemical,
            R.drawable.weather, R.drawable.temp1};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        simpleGrid = (GridView) findViewById(R.id.simpleGridView);
        CustomAdapter1 customAdapter1 = new CustomAdapter1(getApplicationContext(), logos);
        simpleGrid.setAdapter(customAdapter1);
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                // put image data in Intent
                startActivity(intent); // start Intent
            }
        });

    }
}
