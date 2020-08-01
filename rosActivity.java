package com.example.ros;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class rosActivity extends Activity{
    private Button btSpecial;
    private Button btDM;
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
        btSpecial = (Button)findViewById(R.id.btSpecial);
        btDM = (Button)findViewById(R.id.btDM);
        btPerson = (Button)findViewById(R.id.btPerson);
        btBack = (Button)findViewById(R.id.btBack);
        btHome = (Button)findViewById(R.id.btHome);

        btSpecial.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(rosActivity.this, Guide.class);
                startActivity(intent);
            }
        });

        btDM.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(rosActivity.this, rosActivity.class);
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
                intent.setClass(rosActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btHome.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(rosActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
