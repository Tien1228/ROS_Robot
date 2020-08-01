package com.example.ros;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Discount extends Activity{
    private Button btBrand;
    private Button btGame;
    private Button btPerson;
    private Button btBack;
    private Button btHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildViews();
    }

    private  void buildViews() {
        btBrand = (Button) findViewById(R.id.btBrand);
        btGame = (Button) findViewById(R.id.btGame);
        btPerson = (Button)findViewById(R.id.btPerson);
        btBack = (Button)findViewById(R.id.btBack);
        btHome = (Button)findViewById(R.id.btHome);

        btBrand.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Discount.this, Guide.class);
                startActivity(intent);
            }
        });

        btGame.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Discount.this, rosActivity.class);
                startActivity(intent);
            }
        });

        btPerson.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

            }
        });

        btBack.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Discount.this, Discount.class);
                startActivity(intent);
            }
        });

        btHome.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Discount.this, Discount.class);
                startActivity(intent);
            }
        });
    }
}
