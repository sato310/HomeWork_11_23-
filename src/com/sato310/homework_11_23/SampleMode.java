package com.sato310.homework_11_23;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class SampleMode extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		String text = intent.getAction();
		Log.i("recive", text);
	}

}
