package com.example.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.provider.Settings;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        if(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED")){
            Toast.makeText(context,"Charger Disconnected",Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED")){
            Toast.makeText(context,"Charging",Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals("android.intent.action.BATTERY_LOW")){
            Toast.makeText(context,"Low Battery, Charge Your Device",Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals("android.intent.action.AIRPLANE_MODE")){
            Toast.makeText(context,"Airplane mode changed",Toast.LENGTH_SHORT).show();
        }
        if(intent.getAction().equals("my.android.BROADCAST")){
            Toast.makeText(context,"My custom Broadcast",Toast.LENGTH_SHORT).show();
        }
    }


}