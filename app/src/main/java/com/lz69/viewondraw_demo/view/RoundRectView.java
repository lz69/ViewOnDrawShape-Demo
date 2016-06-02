package com.lz69.viewondraw_demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

public class RoundRectView extends View {

    public RoundRectView(Context context, AttributeSet attrs){
        super(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        paint.setAntiAlias(true);

        paint.setColor(getResources().getColor(android.R.color.black));

        canvas.drawRoundRect(50, 50, 250, 250, 20, 20, paint);

        paint.setStyle(Paint.Style.STROKE);

        paint.setStrokeWidth(20);

        canvas.drawRoundRect(350, 50, 600, 250, 20, 20, paint);
    }
}
