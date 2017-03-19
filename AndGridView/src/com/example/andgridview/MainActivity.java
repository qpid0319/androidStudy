package com.example.andgridview;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class MainActivity extends Activity {
	
//	private int[] data = { R.drawable., R.drawable.application, R.drawable.application_add,
//			               R.drawable.application_cascade, R.drawable.application_delete, R.drawable.application_double,
//			               R.drawable.application_edit 
//	};
	private int[] data = { R.drawable.a, R.drawable.apple2, R.drawable.android, R.drawable.appstore, 
			           R.drawable.avast, R.drawable.blogger, R.drawable.books, R.drawable.calculator, 
			           R.drawable.calendar, R.drawable.camera, R.drawable.chat, R.drawable.chrome,
			           R.drawable.cinemagram, R.drawable.clock, R.drawable.contacts, R.drawable.cydia
	};
	
	private CustomAdapter adapter = null;
	private GridView gv = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		adapter = new CustomAdapter(this, data);
		
		gv = (GridView) findViewById(R.id.gv_01);
		gv.setAdapter(adapter);
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
