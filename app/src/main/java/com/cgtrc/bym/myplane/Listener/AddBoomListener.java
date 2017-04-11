package com.cgtrc.bym.myplane.Listener;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * Created by bym on 2017/4/11.
 */

public class AddBoomListener extends AddEntityListener<View> {

    public AddBoomListener(View view) {
        super(view);
    }

    @Override
    protected void onLayoutFinish() {
        Drawable background = t.getBackground();
        if(background instanceof AnimationDrawable) {
            AnimationDrawable bg = (AnimationDrawable) background;
        }
    }
}
