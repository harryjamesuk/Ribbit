package com.harryjamesuk.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		  Parse.initialize(this, "2ndNNbwQ0zwOjPj615blaeXGCQi6EIXoRPGknSpH", "oofvpXzWyVqrt6wRBigvDzv1aGNl644Gdwkw6leC");
	
	}
}
