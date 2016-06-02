package com.lz69.viewondraw_demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class OvalView extends View {

    public OvalView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        paint.setAntiAlias(true);

        paint.setColor(getResources().getColor(android.R.color.holo_red_dark));

        canvas.drawOval(50, 50, 300, 250, paint);

        paint.setStyle(Paint.Style.STROKE);

        paint.setStrokeWidth(10);

        canvas.drawOval(350, 50, 600, 250, paint);
    }
}
