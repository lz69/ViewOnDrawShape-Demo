package com.lz69.viewondraw_demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class PathTextView extends View {

    public PathTextView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(android.R.color.darker_gray));

        paint.setTextSize(30);
        Path path = new Path();
        RectF rectF = new RectF(50, 50, 250, 250);
        path.addOval(rectF, Path.Direction.CCW);

        canvas.drawTextOnPath("HelloWorld!", path, -10, 20, paint);
    }
}
