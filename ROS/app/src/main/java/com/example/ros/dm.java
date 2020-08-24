package com.example.ros;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class dm extends Page {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("dm_start", "start");
        setContentView(R.layout.dm);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
//        buildViews();

        webview = (WebView)findViewById(R.id.webview);
//        Log.d("dm_start", "start");
        webview.loadUrl("http://www.edamall.com.tw/DM_MALL/DM_Mobile/DM_1/index.html");
        Log.d("dm_end", "end");



//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                HttpURLConnection conn = null;
//                try {
//                    String mWeatherUrl = "http://www.edamall.com.tw/DM_MALL/DM_Mobile/DM_1/index.html";
//
//                    URL url = new URL(mWeatherUrl);
//
////                    SSLContext sslContext = null;
////                    try {
////                        TrustManager[] tm = {
////                                new X509TrustManager() {
////                                    @Override
////                                    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
////                                    @Override
////                                    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
////                                    @Override
////                                    public X509Certificate[] getAcceptedIssuers() { return null; }
////                                }
////                        };
////                        sslContext = SSLContext.getInstance("SSL");
////                        sslContext.init(null, tm, null);
////                        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
////                            @Override
////                            public boolean verify(String hostname, SSLSession session) {
////                                return true;
////                            }
////                        });
////                    } catch(Exception e) {
////                        e.printStackTrace();
////                    }
//
//                    conn = (HttpURLConnection) url.openConnection(); // open connect
////                    conn.setSSLSocketFactory(sslContext.getSocketFactory());
//                    conn.setRequestMethod("GET");										 // using GET method
//                    int responseCode = conn.getResponseCode();       // responseCode will return what eror.
//                    BufferedReader in = new BufferedReader(
//                            new InputStreamReader(conn.getInputStream()));   //read your data
//                    String inputLine = "";
//                    StringBuffer response = new StringBuffer();
//                    while ((inputLine = in.readLine()) != null) {
//                        response.append(inputLine);
//                    }
//                    in.close();
//                    Log.d("Response", response.toString());
//
//
//                    JSONObject jsonObject1 = new JSONObject(response.toString());
//                    JSONArray jsonArray = jsonObject1.getJSONArray("events");
//
//                    for (int i = 0; i < jsonArray.length(); i++) {
//                        JSONObject jsonObject = (JSONObject) jsonArray.get(i);
//                        //取出name
//                        String NewsID = jsonObject.getString("NewsID");
//                        String Title = jsonObject.getString("Title");
//                        String Content = jsonObject.getString("Content");
//                        String Weight = jsonObject.getString("Weight");
//                        String ACTIVITY_DATE = jsonObject.getString("ACTIVITY_DATE");
//                        String INDEX_PIC_PATH = jsonObject.getString("INDEX_PIC_PATH");
//                        String INDEX_PIC_PATH2 = jsonObject.getString("INDEX_PIC_PATH2");
//
//                        Log.e("NewsID", NewsID);
//                        Log.e("Title", Title);
//                        Log.e("Content", Content);
//                        Log.e("Weight", Weight);
//                        Log.e("ACTIVITY_DATE", ACTIVITY_DATE);
//                        Log.e("INDEX_PIC_PATH", INDEX_PIC_PATH);
//                        Log.e("INDEX_PIC_PATH2", INDEX_PIC_PATH2);
//
//                            /*storeID.add(StoreID);
//                            brandID.add(BrandID);
//                            Name.add(BrandName);
//                            zone.add(ZoneID);
//                            floor.add(Floor);
//                            content.add(Content);
//                            openTime.add(OpenTime);
//                            logo.add(BrandPicB);
//                            big.add(BrandPicBIG);*/
//
//                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    if (conn != null) conn.disconnect();               //make sure you disconnnect
//                }
//            }
//        }).start();
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

//    private  void buildViews() {
//        final View ST;
//
//        ST = (View) findViewById(R.id.story_touch);
//
//        ST.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                dm.super.SwitchPage(Story2.class);
//                finish();
//            }
//        });
//    }
}
