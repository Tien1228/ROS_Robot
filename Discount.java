package com.example.ros;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Discount extends Page {
    private Context one = Discount.this;
    private Class two = MainActivity.class;

    private Button btBrand;
    private Button btGame;
    private Button btBack;
    private Button btHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildViews();
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }

    private  void buildViews() {
        btBrand = (Button) findViewById(R.id.btBrand);
        btGame = (Button) findViewById(R.id.btGame);
        btBack = (Button)findViewById(R.id.btBack);
        btHome = (Button)findViewById(R.id.btHome);

        btBrand.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Discount.super.SwitchPage();
            }
        });

        btGame.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Discount.super.SwitchPage();
            }
        });

        btBack.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Discount.super.LastPage(one, two);
            }
        });

        btHome.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Discount.super.HomePage(one);
            }
        });
    }
}
