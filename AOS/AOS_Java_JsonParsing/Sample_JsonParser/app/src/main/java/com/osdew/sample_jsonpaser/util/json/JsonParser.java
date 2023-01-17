package com.osdew.sample_jsonpaser.util.json;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParser {

    public static void jsonPaser(String resultJson) {


        try{
            JSONObject jsonObject = new JSONObject(resultJson);
            JSONArray jsonArray = new JSONArray();
            JSONObject jsonObject2 = new JSONObject();

            jsonArray = jsonObject.getJSONArray("cards");
            for(int i=0; i<=jsonArray.length(); i++){
                jsonObject2 = jsonArray.getJSONObject(i);
                String cardTitle = jsonObject2.getString("cardTitle");
                Log.d("resultData","cardTitle : "+cardTitle);
            }
        } catch (JSONException e) {
        }
    }
}
