package com.cgtrc.bym.myplane.Listener;

import android.view.View;
import android.view.ViewTreeObserver;

/**
 * Created by bym on 2017/4/11.
 */

public abstract class AddEntityListener <T extends View> implements ViewTreeObserver.OnGlobalLayoutListener {
    protected T t;

    public AddEntityListener(T t) {
        super();
        this.t = t;
    }

    @Override
    public void onGlobalLayout() {
        t.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        onLayoutFinish();
    }

    protected abstract void onLayoutFinish();
}
