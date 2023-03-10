package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {


Button button1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       button1=findViewById(R.id.button1);
        PieChart pieChart = findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);

        Description desc = new Description();
        desc.setText("");
        desc.setTextSize(20f);
        pieChart.setDescription(desc);


        pieChart.setHoleRadius(0f);
        pieChart.setTransparentCircleRadius(0f);


        List<PieEntry> value = new ArrayList<>();
        value.add(new PieEntry(35f,"moisture"));
        value.add(new PieEntry(65f,"dryness" ));

        PieDataSet pieDataSet = new PieDataSet(value, "");
        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(ColorTemplate.LIBERTY_COLORS);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main3Activity.this, detailactivity.class);
                // put image data in Intent
                startActivity(intent);
            }
        });
    }
}
