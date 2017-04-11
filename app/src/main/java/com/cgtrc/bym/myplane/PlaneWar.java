package com.cgtrc.bym.myplane;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.cgtrc.bym.myplane.Listener.AddHeroListener;
import com.cgtrc.bym.myplane.entity.Hero;

/**
 * Created by bym on 2017/4/11.
 */

public class PlaneWar extends FrameLayout {
    private String TAG = "PlaneWar";
    private Paint paint = null;
    private String str = "当前得分: %s";
    private int scroe = 0;
    private int textHeight = 0;

    private final int CREATE_ENEMY_DURATION = 1000;
    private final int CREATE_BULLET_DURATION = 100;
    private final int MSG_ENEMY = 1;
    private final int MSG_BULLET = 2;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_ENEMY:
                    generateEnemy();
                    break;
                case MSG_BULLET:
                    generateBullet();
                    break;
            }
        }
    };


    public PlaneWar(Context context) {
        super(context);
    }

    public PlaneWar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PlaneWar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        paint = new Paint();
        paint.setTextSize(16);
        paint.setColor(Color.WHITE);
        paint.setTextSkewX(-0.15f);
        textHeight = getTextHeight(str);
    }

    public int getTextHeight(String text) {
        Rect bounds = new Rect();
        paint.getTextBounds(text, 0, text.length(), bounds);
        return bounds.height();
    }

    public void start() {
        generateEnemy();
        generateBullet();
        generateHello();
    }

    private Hero mHero;
    public Hero getHero() {
        return mHero;
    }

    private void generateHello() {
        mHero = new Hero(getContext());
        mHero.setVisibility(View.INVISIBLE);
        mHero.getViewTreeObserver().addOnGlobalLayoutListener(new AddHeroListener(mHero));
        addView(mHero);
    }


    private void generateEnemy() {

    }

    private void generateBullet() {

    }


}











