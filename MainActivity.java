package com.example.ros;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button btGuide;
    private Button btActivity;
    private Button btDiscount;
    private Button btPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildViews();
    }

    private  void buildViews(){
        btGuide = (Button)findViewById(R.id.btGuide);
        btActivity = (Button)findViewById(R.id.btActivity);
        btDiscount = (Button)findViewById(R.id.btDiscount);
        btPerson = (Button)findViewById(R.id.btPerson);

        btGuide.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Guide.class);
                startActivity(intent);
            }
        });

        btActivity.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, rosActivity.class);
                startActivity(intent);
            }
        });

        btDiscount.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Discount.class);
                startActivity(intent);
            }
        });

        btPerson.setOnClickListener(new OnClickListener(){
            public void onClick(View v){

            }
        });
    }
}