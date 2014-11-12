package com.harryjamesuk.ribbit.utils;

import android.content.Context;
import android.content.Intent;

import com.harryjamesuk.ribbit.ui.MainActivity;
import com.parse.ParsePushBroadcastReceiver;

public class Receiver extends ParsePushBroadcastReceiver {

	@Override
	public void onPushOpen(Context context, Intent intent) {
		Intent i = new Intent(context, MainActivity.class);
		i.putExtras(intent.getExtras());
		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(i);
	}
}
