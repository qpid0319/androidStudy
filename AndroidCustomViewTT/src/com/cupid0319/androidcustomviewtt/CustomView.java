package com.cupid0319.androidcustomviewtt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class CustomView extends View {
	
	private Context mContext;

	public CustomView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		this.mContext = context;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
//		super.onDraw(canvas); 
		
		canvas.drawColor(Color.BLUE);
		
		Paint paint = new Paint();
		paint.setColor(Color.RED);
		
		canvas.drawCircle(100, 100, 50, paint);
	}
	
//	@Override
//	public boolean onTouchEvent(MotionEvent event) {
//		// TODO Auto-generated method stub
//		super.onTouchEvent(event);
//		
//		if (event.getAction() == MotionEvent.ACTION_DOWN) {
//			Toast.makeText(this.mContext, "MontionEvent.ACTION_DOWN", Toast.LENGTH_SHORT).show();
//			return true;
//		}
//		
//		return false;
//	}
}
