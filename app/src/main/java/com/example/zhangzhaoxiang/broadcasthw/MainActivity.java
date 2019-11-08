package com.example.zhangzhaoxiang.broadcasthw;


import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String ACTION1 = Intent.ACTION_SCREEN_ON;


    MyReceiver mReceiver = new MyReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION1);

        // 3. 动态注册：调用Context的registerReceiver（）方法
        registerReceiver(mReceiver, intentFilter);
    }
    public void onDestroy() {

        unregisterReceiver(mReceiver);
        super.onDestroy();

    }

    }
