package com.cgtrc.bym.myplane.entity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by bym on 2017/4/11.
 */

public abstract class BaseEntity extends View {
    protected Bitmap bitmap;

    public BaseEntity(Context context) {
        super(context);
        init();
    }

    public BaseEntity(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BaseEntity(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        bitmap = BitmapFactory.decodeResource(getResources(), getImageRes());
    }

    protected abstract int getImageRes();

    public void stopAnimation() {

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(bitmap.getWidth(), bitmap.getHeight());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(bitmap, 0, 0, null);
    }
}








