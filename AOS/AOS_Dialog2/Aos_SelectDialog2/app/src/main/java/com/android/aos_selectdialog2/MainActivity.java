package com.android.aos_selectdialog2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.callButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final LinearLayout linear = (LinearLayout) View.inflate(MainActivity.this, R.layout.order, null);
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("주문 정보를 입력하세요")
                        .setIcon(R.mipmap.ic_launcher)
                        .setView(linear)
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                EditText product = linear.findViewById(R.id.product);
                                EditText number = linear.findViewById(R.id.number);
                                CheckBox paymethod = linear.findViewById(R.id.paymethod);
                                TextView text = findViewById(R.id.text1);
                                text.setText("주문정보\n" + product.getText() + "상품\n" + number.getText() + "개" + (paymethod.isChecked() ? "\n착불결제" : ""));

                            }
                        })
                        .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                TextView text = findViewById(R.id.text1);
                                text.setText("주문을 취소했습니다.");
                            }
                        })
                        .show();
            }
        });
    }
}