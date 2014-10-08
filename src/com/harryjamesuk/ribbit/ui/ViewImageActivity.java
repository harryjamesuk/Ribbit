package com.harryjamesuk.ribbit.ui;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.harryjamesuk.ribbit.R;
import com.harryjamesuk.ribbit.R.id;
import com.harryjamesuk.ribbit.R.layout;
import com.squareup.picasso.Picasso;

public class ViewImageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_image);
		
		ImageView imageView = (ImageView)findViewById(R.id.imageView);
		
		Uri imageUri = getIntent().getData();
		
		Picasso.with(this).load(imageUri.toString()).into(imageView);
	
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				finish();				
			}
		}, 10*1000);
	}
}
