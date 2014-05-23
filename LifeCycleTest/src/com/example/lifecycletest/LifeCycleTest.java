package com.example.lifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class LifeCycleTest extends Activity {

	//コメント
	//コメント2
	//コメント3
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "onDestory", Toast.LENGTH_SHORT).show();
	}
	@Override
		protected void onPause() {
		super.onPause();
	Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onRestart() {
		super.onRestart();
		Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onResume() {
		super.onResume();
		setContentView(R.layout.activity_life_cycle_test);
		Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onStop() {
		super.onStop();
		Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
	}
}
