package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Notification extends AppCompatActivity {


    TextView t1_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        t1_tv = findViewById(R.id.textView12);
        String g=getIntent().getStringExtra("message");
        t1_tv.setText(g);

        //if (getIntent().getExtras() != null) {
           // for (String key : getIntent().getExtras().keySet())//{
               // String value = getIntent().getExtras().getString(key);
               // t1_tv.setText("message");
           // }}

       // Intent incoming = getIntent();
       // if(incoming.getStringExtra("type").compareTo("notification")==0){
           // Intent outgoing = new Intent(this, Notification.class);
            //outgoing.putExtra("title", incoming.getStringExtra("message"));
            //t1_tv.setText("message");
            //startActivity(outgoing);
       // }
    }
}
