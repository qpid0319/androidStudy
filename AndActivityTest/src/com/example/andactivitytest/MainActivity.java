package com.example.andactivitytest;

import java.nio.charset.MalformedInputException;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i("MainActivity", "OnCreate");		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn = (Button) findViewById(R.id.bt_01);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, SecondActivity.class );
				startActivity(intent);				
			}
		});
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Log.i("MainActivity", "OnStart");
		super.onStart();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Log.i("MainActivity", "OnPause");
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		Log.i("MainActivity", "OnStop");
		super.onStop();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Log.i("MainActivity", "OnResume");
		super.onResume();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("MainActivity", "onDestroy");
		super.onDestroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
