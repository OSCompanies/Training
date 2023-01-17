package com.android.aos_selectdialog1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.callButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("음식을 선택하시오!")
                        .setIcon(R.mipmap.ic_launcher)
                        .setItems(R.array.food,
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        String[] foods = getResources().getStringArray(R.array.food);
                                        TextView text = findViewById(R.id.text1);
                                        text.setText("선택한 음식은 : " + foods[which]);
                                    }
                                }
                        )
                        .setPositiveButton("취소", null)
                        .show();
            }
        });
    }
}