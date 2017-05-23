package com.superweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/23.
 */

public class Forecast {

    @SerializedName("temp")
    public Temperature temperature;

    private class Temperature {
        public String max;
        public String min;

    }

    @SerializedName("cond")
    public More more;

    private class More {
        @SerializedName("txt_d")
        public String info;
    }
}
