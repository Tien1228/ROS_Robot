package com.example.ros;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class Page extends Activity {
    public void LastPage(Context one, Class two){
        Intent intent = new Intent();
        intent.setClass(one, two);

        onPause();
        startActivity(intent);
        onStop();
        onDestroy();
    }

    public void HomePage(Context one){
        LastPage(one, MainActivity.class);
    }

    public void SwitchPage(Context first, Class second){
        Intent intent = new Intent();
        intent.setClass(first, second);

        onPause();
        startActivity(intent);
        onStop();
    }
}
