package com.example.andoridintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button bt_dial = (Button) findViewById(R.id.bt_dial);
		Button bt_call = (Button) findViewById(R.id.bt_call);
		Button bt_contact = (Button) findViewById(R.id.bt_contact);
		Button bt_website = (Button) findViewById(R.id.bt_website);
		Button bt_sms = (Button) findViewById(R.id.bt_sms);
		
		bt_dial.setOnClickListener(listener);
		
		bt_contact.setOnClickListener(listener);
		bt_website.setOnClickListener(listener);
		
	}
	
	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Uri uri = null;
			Intent intent = null;
			
			switch (v.getId()) {
			case R.id.bt_dial:
				Toast.makeText(MainActivity.this, "Dial", Toast.LENGTH_SHORT).show();
				uri = Uri.parse("tel:01085060319");
				intent = new Intent(Intent.ACTION_DIAL, uri);
				break;
				
			case R.id.bt_call:
				
				break;
				
			case R.id.bt_contact:
				Toast.makeText(MainActivity.this, "Contact", Toast.LENGTH_SHORT).show();
				uri = Uri.parse("content://contacts/people/");
				intent = new Intent(Intent.ACTION_VIEW, uri);
				break;
				
			case R.id.bt_website:
				Toast.makeText(MainActivity.this,  "WebSite", Toast.LENGTH_SHORT).show();
				uri = Uri.parse("http://www.gspoll.net");
				intent = new Intent(Intent.ACTION_VIEW, uri);
				break;

			default:
				break;
			}
			
			if (intent != null) startActivity(intent);
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
