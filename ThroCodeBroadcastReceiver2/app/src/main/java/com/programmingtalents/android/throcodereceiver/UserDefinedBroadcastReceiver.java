package com.programmingtalents.android.throcodereceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserDefinedBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("com.amit.own")) {
            //You can do the processing here update the widget/remote views.
            StringBuilder msgStr = new StringBuilder("Current time : ");
            Format formatter = new SimpleDateFormat("hh:mm:ss a");
            msgStr.append(formatter.format(new Date()));
            Toast.makeText(context, msgStr, Toast.LENGTH_SHORT).show();
        }
	}
}
