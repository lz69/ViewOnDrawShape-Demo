package com.lz69.viewondraw_demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TextView extends View {

    public TextView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        paint.setAntiAlias(true);

        paint.setColor(getResources().getColor(android.R.color.darker_gray));

        paint.setTextSize(100);

        canvas.drawText("Hello,World!", 50, 150, paint);
    }
}
