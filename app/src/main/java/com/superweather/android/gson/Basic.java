package com.superweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    
    public Update update;

    private class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
