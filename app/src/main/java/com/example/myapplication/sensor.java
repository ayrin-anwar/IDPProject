package com.example.myapplication;

import com.jjoe64.graphview.series.DataPointInterface;

public class sensor  {

    String Temperature1;
    public sensor()
    {

    }
    public sensor(String t1)
    {

        Temperature1=t1;
    }

    public void setTemperature(String t1)
    {
        Temperature1=t1;
    }
    public String getTemperature()
    {
        return Temperature1;
    }
}
