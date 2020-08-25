package com.example.ros;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Dm extends Page {

    int[] images = new int[] { R.drawable.page_1,R.drawable.page_2,R.drawable.page_3,R.drawable.page_4,R.drawable.page_5,
                                R.drawable.page_6,R.drawable.page_7,R.drawable.page_8,R.drawable.page_9,R.drawable.page_10,
                                R.drawable.page_11,R.drawable.page_12,R.drawable.page_13,R.drawable.page_14,R.drawable.page_15,
                                R.drawable.page_16,R.drawable.page_17,R.drawable.page_18,R.drawable.page_19,R.drawable.page_20,
                                R.drawable.page_21,R.drawable.page_22,R.drawable.page_23,R.drawable.page_24,R.drawable.page_25,
                                R.drawable.page_26,R.drawable.page_27,R.drawable.page_28,R.drawable.page_29,R.drawable.page_30,
                                R.drawable.page_31,R.drawable.page_32};


    private ZoomImageView zoomImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dm);

        zoomImageView = (ZoomImageView) findViewById(R.id.zoom_image_view);
//        Bitmap bitmap = ;
//        zoomImageView.setImageBitmap(bitmap);
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
    }
    @Override
    public void onStop()
    {
        super.onStop();
    }
    @Override
    public void onRestart()
    {
        super.onRestart();
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }
}
