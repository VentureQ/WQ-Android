package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView mTv4;
    private TextView mTv5;
    private TextView mTv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv4= (TextView) findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//设置一个中划线
        mTv4.getPaint().setAntiAlias(true);//中划线可能有锯齿效果，去锯齿

        mTv5=findViewById(R.id.tv_5);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线

        mTv6=findViewById(R.id.tv_6);
        mTv6.setText(Html.fromHtml("<u>wang wang</u>"));//也是下划线
    }
}