package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;

import android.widget.Button;
import android.widget.ListView;







public class MainActivity extends AppCompatActivity {

    ListView simpleList;

    int flags[] = {R.drawable.plant1, R.drawable.plant1, R.drawable.plant1, R.drawable.plant1, R.drawable.plant1, R.drawable.plant1};
    int arrows[] = {R.drawable.ic_arrow_forward_black_24dp, R.drawable.ic_arrow_forward_black_24dp, R.drawable.ic_arrow_forward_black_24dp, R.drawable.ic_arrow_forward_black_24dp, R.drawable.ic_arrow_forward_black_24dp, R.drawable.ic_arrow_forward_black_24dp};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = findViewById(R.id.simpleListView);
        Button notify_bt=findViewById(R.id.notify_bt);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), arrows, flags);
        simpleList.setAdapter(customAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
        notify_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Notification.class);
                // put image data in Intent
                startActivity(intent);
            }
        });

    }
}



