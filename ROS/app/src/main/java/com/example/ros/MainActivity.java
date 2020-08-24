package com.example.ros;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

//import org.eclipse.paho.client.mqttv3.MqttClient;
//import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
//import org.eclipse.paho.client.mqttv3.MqttException;
//import org.eclipse.paho.client.mqttv3.MqttMessage;
//import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        buildViews();

//        final int time = 1000  ; // set period time (ms)
//        final Handler handler = new Handler();
//        Runnable runnable = new Runnable(){
//            @Override
//            public void run() {
//                // 在此處新增執行的程式碼
//                pubUtils();
//
//                handler.postDelayed(this, time);// time ms後執行this,即runable
//            }
//        };
//        handler.postDelayed(runnable, time);// 開啟定時器,time ms後執行runnable操作

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

    private void buildViews() {
        final Button btGuide;
        final Button btActivity;
        final Button btDiscount;

        btGuide = (Button) findViewById(R.id.btGuide);
        btActivity = (Button) findViewById(R.id.btActivity);
        btDiscount = (Button) findViewById(R.id.btDiscount);

        btGuide.setOnClickListener(new OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Location.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            }
        });

        btActivity.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Event.class);
                startActivity(intent);
            }
        });

        btDiscount.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Discount.class);
                startActivity(intent);
            }
        });
    }

//    public static void pubUtils(){
//        //batteryInfo batteryInfo = getbatteryInfo();

//            String serialNumber = getSerialNumber();
//            String currentTime = Calendar.getInstance().getTime().toString();
//            String mac = getMacAddr();
//            String ip = getLocalIpAddress();
//            String ssid = WifiUtils.getSSID(MainActivity.context);
//            String rssi = WifiUtils.getRssi(MainActivity.context);
//            String memoryUsage = getUsedMemorySize();
//            int batteryPercentage = getbatteryInfo().batteryLevel;
//            boolean isCharging = getbatteryInfo().isCharging;
//        //String msg = String.format("{\"%s\":\"{%s, %s, %s, %s, %d%%, %s}\"}", serialNumber, serialNumber, mac, currentTime, ip, batteryPercentage, isCharging);
//        String msg = String.format("{\"%s\":{\"SN\":\"%s\", \"Time\":\"%s\", \"MAC\":\"%s\", \"SSID\":\"%s\", \"IP\":\"%s\", \"RSSI\":\"%s\", \"BatteryLevel\":\"%d%%\", \"isCharging\":\"%s\", \"Mem\":\"%s\"}}", "00119331049", "serialNumber", "0123", "mac", "0123", "ip", "rssi", 100, "isCharging", "memoryUsage");
//        //Log.d(TAG, msg);
//        publishUtilTOMqtt(msg);
//    }

//    public static void publishUtilTOMqtt(String content){ // Void function without return value (ex. string, int ...
//
//        String broker = "tcp://120.126.16.92:1883";
//        String clientId = "Temi";
//        MemoryPersistence persistence = new MemoryPersistence();
//        String topic = "test/sub_topic";
////            String content = currentTime.toString();
//        // Setting mqtt connection quaility
//        // https://swf.com.tw/?p=1015
//        int qos = 0;
//
////            Log.d(TAG, "message: " + content);
//
//        try {
//            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
//            MqttConnectOptions connOpts = new MqttConnectOptions();
//            connOpts.setCleanSession(true);
//            //Log.d(TAG, "Connecting to broker: " + broker);
//            sampleClient.connect(connOpts);
////                Log.d(TAG, "Connected");
//            //Log.d(TAG, "Publishing message: " + content);
//            MqttMessage message = new MqttMessage(content.getBytes());
//            message.setQos(qos);
//            sampleClient.publish(topic, message);
////                Log.d(TAG, "Message published");
//            sampleClient.disconnect();
//            //Log.d(TAG, "Disconnected");
//            //System.exit(0);
//        } catch (MqttException me) {
////                Log.e(TAG, String.valueOf(me));
////                Log.d(TAG, "reason: " + me.getReasonCode());
////                Log.d(TAG, "msg: " + me.getMessage());
////                Log.d(TAG, "loc: " + me.getLocalizedMessage());
////                Log.d(TAG, "cause: " + me.getCause());
////                Log.d(TAG, "excep " + me);
//            me.printStackTrace();
//        }
//    }
}
