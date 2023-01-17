package com.osdew.sample_jsonpaser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.osdew.sample_jsonpaser.util.json.HttpConnector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpConnector thread = new HttpConnector();
        thread.start();
    }
}
