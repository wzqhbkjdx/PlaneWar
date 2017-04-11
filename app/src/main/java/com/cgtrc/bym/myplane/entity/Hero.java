package com.cgtrc.bym.myplane.entity;

import android.content.Context;

import com.cgtrc.bym.myplane.R;

/**
 * Created by bym on 2017/4/11.
 */

public class Hero extends BaseEntity {
    public Hero(Context context) {
        super(context);
    }

    @Override
    protected int getImageRes() {
        return R.drawable.hero1;
    }
}
