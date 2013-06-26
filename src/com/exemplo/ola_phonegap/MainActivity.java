package com.exemplo.ola_phonegap;

import org.apache.cordova.DroidGap;
import android.os.Bundle;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setIntegerProperty ("loadUrlTimeoutValue", 70000);
		super.loadUrl("file:///android_asset/www/GeoLocation.html");
		super.setIntegerProperty ("loadUrlTimeoutValue", 60000);
	}
}
