package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.firstapp.gridview.GridViewActivity;
import com.example.firstapp.listview.ListViewActivity;

public class ButtonActivity extends AppCompatActivity {
    private Button mBtn3;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn3=findViewById(R.id.btn_3);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this,"btn3被点击了",Toast.LENGTH_SHORT).show();
            }
        });

//        mBtnEditText= (Button) findViewById(R.id.btn_edittext);
//        mBtnEditText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(ButtonActivity.this,EditTextActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        mBtnRadioButton=findViewById(R.id.btn_radiobutton);
//        mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(ButtonActivity.this,RadioButtonActivity.class);
//                startActivity(intent);
//            }
//        });
        mBtnEditText= (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton=findViewById(R.id.btn_radiobutton);
        mBtnCheckBox=findViewById(R.id.btn_checkbox);
        mBtnImageView=findViewById(R.id.btn_imageview);
        mBtnListView=findViewById(R.id.btn_listview);
        mBtnGridView=findViewById(R.id.btn_gridview);
        setListeners();
    }

    public void showToast(View view){
        Toast.makeText(this,"我被点击了",Toast.LENGTH_SHORT).show();
    }

    private void setListeners(){
        Onclick onclick=new Onclick();
        mBtnEditText.setOnClickListener(onclick);
        mBtnRadioButton.setOnClickListener(onclick);
        mBtnCheckBox.setOnClickListener(onclick);
        mBtnImageView.setOnClickListener(onclick);
        mBtnListView.setOnClickListener(onclick);
        mBtnGridView.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent=null;
            switch (view.getId()){
                case R.id.btn_textview:
                    intent=new Intent(ButtonActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent=new Intent(ButtonActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent=new Intent(ButtonActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent=new Intent(ButtonActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent=new Intent(ButtonActivity.this,ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent=new Intent(ButtonActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent=new Intent(ButtonActivity.this, GridViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}