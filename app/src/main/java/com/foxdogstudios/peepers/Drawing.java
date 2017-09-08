package com.foxdogstudios.peepers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by vajira on 9/7/17.
 */

public class Drawing extends View {

    Bitmap bball;
    int x,y;

    public Drawing(Context context) {
        super(context);
        bball = BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher_peepers);
        x=0;
        y=0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect ourRect = new Rect();
        ourRect.set(0,0,canvas.getWidth(),canvas.getHeight()/2);

        Paint blue = new Paint();
        blue.setColor(Color.BLUE);
        blue.setStyle(Paint.Style.STROKE);
        canvas.drawRect(ourRect,blue);
    }
}
