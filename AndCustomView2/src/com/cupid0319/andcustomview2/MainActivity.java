package com.cupid0319.andcustomview2;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ArrayList<Weather> data = null;
	private WeatherAdapter adapter = null;
	private ListView lv = null;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		data = new ArrayList<Weather>();
		data.add(new Weather("��", R.drawable.ic_launcher, "����"));
		data.add(new Weather("ȭ", R.drawable.ic_launcher, "�帲"));
		data.add(new Weather("��", R.drawable.ic_launcher, "��"));	
		data.add(new Weather("��", R.drawable.ic_launcher, "�帲"));	
		data.add(new Weather("��", R.drawable.ic_launcher, "��"));	
		data.add(new Weather("��", R.drawable.ic_launcher, "����"));		
		data.add(new Weather("��", R.drawable.ic_launcher, "����"));			
		
		adapter = new WeatherAdapter(MainActivity.this, R.layout.custom_layout, data);
		lv = (ListView) findViewById(R.id.lv_weather);
		lv.setAdapter(adapter);
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
