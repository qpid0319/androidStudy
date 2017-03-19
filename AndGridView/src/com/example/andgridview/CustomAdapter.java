package com.example.andgridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
	
	private Context mContext;
	private int[] data;

	public CustomAdapter(Context mContext, int[] data) {
		this.mContext = mContext;
		this.data = data;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub		
		return data[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		ImageView imageView;
		
		if ( convertView == null ) {
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(50, 50));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(5, 5, 5, 5);
		} else {
			imageView = ( ImageView ) convertView;
		}
		imageView.setImageResource(data[position]);
		return imageView;
	}

}
