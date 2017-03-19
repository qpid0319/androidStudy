package com.cupid0319.androidcustomviewtt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class CustomView extends View {

	public CustomView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
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
}
