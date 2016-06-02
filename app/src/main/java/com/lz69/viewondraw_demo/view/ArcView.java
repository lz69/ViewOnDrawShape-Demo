package com.lz69.viewondraw_demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class ArcView extends View {

    public ArcView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        paint.setAntiAlias(true);

        paint.setColor(getResources().getColor(android.R.color.holo_blue_dark));

        RectF rectF = new RectF(50, 50, 250, 250);

        //实心圆弧
        canvas.drawArc(rectF, 0, 270, false, paint);

        RectF rectFTwo = new RectF(300, 50, 500, 250);
        //实心圆弧，包含圆心在内
        canvas.drawArc(rectFTwo, 0, 270, true, paint);

        RectF rectFThree = new RectF(550, 50, 750, 250);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawArc(rectFThree, 0, 270, false, paint);

        RectF rectFFour = new RectF(800, 70, 950, 230);

        canvas.drawArc(rectFFour, 0, 270, true, paint);
    }
}
