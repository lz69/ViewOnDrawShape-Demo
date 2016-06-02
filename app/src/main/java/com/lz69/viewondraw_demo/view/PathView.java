package com.lz69.viewondraw_demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class PathView extends View {

    public PathView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(android.R.color.holo_orange_dark));

        Path path = new Path();
        path.moveTo(50, 100);
        path.lineTo(50, 250);
        path.lineTo(300, 250);
        path.lineTo(450, 50);
        path.lineTo(200, 200);
        canvas.drawPath(path, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);

        Path path2 = new Path();
        path2.moveTo(550, 100);
        path2.lineTo(550, 250);
        path2.lineTo(800, 250);
        path2.lineTo(950, 50);
        path2.lineTo(700, 200);
        canvas.drawPath(path2, paint);
    }
}
