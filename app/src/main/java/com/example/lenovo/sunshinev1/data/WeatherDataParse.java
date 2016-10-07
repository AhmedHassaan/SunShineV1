package com.example.lenovo.sunshinev1.data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Lenovo on 10/7/2016.
 */

public class WeatherDataParse {


    public static double getMaxTemp (String weatherJsonStr, int dayIndex) throws JSONException {

        JSONObject weather = new JSONObject(weatherJsonStr);
        JSONArray days = weather.getJSONArray("list");
        JSONObject dayInfo = days.getJSONObject(dayIndex);
        JSONObject tempInfo = dayInfo.getJSONObject("temp");
        return tempInfo.getDouble("max");
    }



}
