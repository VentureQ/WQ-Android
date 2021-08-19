package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        mBtnTextView=findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击事件，跳转到TextView演示界面
                Intent intent=new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
                //判断是否有SD卡
//                if(Environment.getExternalStorageState().equals((Environment.MEDIA_MOUNTED))){
//                    Toast.makeText(MainActivity.this,"有sd卡",Toast.LENGTH_SHORT).show();
//                }
            }
        });

//        mBtnButton=findViewById(R.id.btn_Button);
//        mBtnButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this, TextViewActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}