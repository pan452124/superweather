package com.superweather.android.gson;

/**
 * Created by Administrator on 2017/5/23.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
