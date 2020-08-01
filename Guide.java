package com.example.ros;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Guide extends Activity{
    private Button btA;
    private Button btB;
    private Button btC;
    private Button btD;
    private Button btE;
    private Button btF;
    private Button btG;
    private Button btH;
    private Button btPerson;
    private Button btBack;
    private Button btHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildViews();
    }

    private  void buildViews(){
        btA = (Button)findViewById(R.id.btA);
        btB = (Button)findViewById(R.id.btB);
        btC = (Button)findViewById(R.id.btC);
        btD = (Button)findViewById(R.id.btD);
        btE = (Button)findViewById(R.id.btE);
        btF = (Button)findViewById(R.id.btF);
        btG = (Button)findViewById(R.id.btG);
        btH = (Button)findViewById(R.id.btH);
        btPerson = (Button)findViewById(R.id.btPerson);
        btBack = (Button)findViewById(R.id.btBack);
        btHome = (Button)findViewById(R.id.btHome);

        btA.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Guide.this, Guide.class);
                startActivity(intent);
            }
        });

        btB.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Guide.this, Guide.class);
                startActivity(intent);
            }
        });

        btC.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Guide.this, Guide.class);
                startActivity(intent);
            }
        });

        btD.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Guide.this, Guide.class);
                startActivity(intent);
            }
        });

        btE.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Guide.this, Guide.class);
                startActivity(intent);
            }
        });

        btF.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Guide.this, Guide.class);
                startActivity(intent);
            }
        });

        btG.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Guide.this, Guide.class);
                startActivity(intent);
            }
        });

        btH.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Guide.this, Guide.class);
                startActivity(intent);
            }
        });

        btPerson.setOnClickListener(new OnClickListener(){
            public void onClick(View v){

            }
        });

        btBack.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Guide.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btHome.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Guide.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
