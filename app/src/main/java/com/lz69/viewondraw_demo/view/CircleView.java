package com.lz69.viewondraw_demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CircleView extends View{

    public CircleView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        //去锯齿
        paint.setAntiAlias(true);
        //设置颜色
        paint.setColor(getResources().getColor(android.R.color.holo_green_dark));
        //绘制普通圆
        canvas.drawCircle(150, 150, 100, paint);
        //设置空心style
        paint.setStyle(Paint.Style.STROKE);
        //设置空心边框的宽度
        paint.setStrokeWidth(20);
        //绘制空心圆
        canvas.drawCircle(450, 150, 100, paint);
    }
}
