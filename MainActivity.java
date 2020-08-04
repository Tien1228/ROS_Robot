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

    private  void buildViews(){
        btGuide = (Button)findViewById(R.id.btGuide);
        btActivity = (Button)findViewById(R.id.btActivity);
        btDiscount = (Button)findViewById(R.id.btDiscount);

        btGuide.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Guide.class);

                onPause();
                startActivity(intent);
                onStop();
            }
        });

        btActivity.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, rosActivity.class);

                onPause();
                startActivity(intent);
                onStop();
            }
        });

        btDiscount.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Discount.class);

                onPause();
                startActivity(intent);
                onStop();
            }
        });
    }
}