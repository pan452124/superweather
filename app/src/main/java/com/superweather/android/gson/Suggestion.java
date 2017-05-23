package com.superweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/23.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    private class Comfort {
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public CarWash carWash;

    private class CarWash {
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("sport")
    public Sport sport;

    private class Sport {
        @SerializedName("txt")
        public String info;
    }
}
