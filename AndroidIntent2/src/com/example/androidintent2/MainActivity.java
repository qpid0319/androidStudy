package com.example.androidintent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView tv_id = null;
	TextView tv_pw = null;
	Button btGoSecond = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv_id = (TextView) findViewById(R.id.tv_01);
		tv_pw = (TextView) findViewById(R.id.tv_02);
		btGoSecond = (Button) findViewById(R.id.bt_second);
		btGoSecond.setOnClickListener(listener);
	}
	
	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = null;
			
			switch (v.getId()) {
			case R.id.bt_second:
				intent = new Intent(MainActivity.this, SecondActivity.class);
				intent.putExtra("u_id", tv_id.getText());
				intent.putExtra("u_pw", tv_pw.getText());
				startActivity(intent);
				
				break;

			default:
				break;
			}
			
		}
	};

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
