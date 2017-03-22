package com.example.androideventdraw;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class CustomView extends View {
	
	public final static int CURRENT_CANVAS = 0;
	public final static int NEW_CANVAS = 1;
	
	private Context mContext = null;
	private Paint paint = null;
	private ArrayList<Dot> dots = new ArrayList<Dot>();
	
	public void setmContext(Context mContext) {
		this.mContext = mContext;
	}

	public CustomView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		initPaint(CustomView.CURRENT_CANVAS);
	}

	public CustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		initPaint(CustomView.CURRENT_CANVAS);		
	}

	public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		initPaint(CustomView.CURRENT_CANVAS);		
	}

	public void initPaint(int i) {
		// TODO Auto-generated method stub
		dots.clear();
		paint = null;
		paint = new Paint();
		paint.setColor(Color.RED);
		paint.setStrokeWidth(2);
		paint.setAntiAlias(true);
		
		if ( i == CustomView.NEW_CANVAS) invalidate();	

	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
//		super.onDraw(canvas);
		canvas.drawColor(Color.WHITE);
		
		for (int i=0; i < dots.size(); i++) {
			if ( dots.get(i).isB()) {
				canvas.drawLine(dots.get(i - 1).getX(), dots.get(i - 1).getY(), 
						dots.get(i).getX(), dots.get(i).getY(), paint);
			}
			
		}
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if ( event.getAction() == MotionEvent.ACTION_DOWN) {
			dots.add(new Dot(event.getX(), event.getY(), false));
			return true;
		}
		
		if ( event.getAction() == MotionEvent.ACTION_MOVE) {
			dots.add(new Dot(event.getX(), event.getY(), true));
			invalidate();
			return true;
		}

		return false;
	}

}
