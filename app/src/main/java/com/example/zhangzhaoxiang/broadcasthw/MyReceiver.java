package com.example.zhangzhaoxiang.broadcasthw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, MainActivity.class);

        if (intent.getAction().equals(MainActivity.ACTION1)) {
            context.startActivity(i);
        }



    }



}
