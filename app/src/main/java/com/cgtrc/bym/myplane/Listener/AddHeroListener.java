package com.cgtrc.bym.myplane.Listener;

import android.view.View;
import android.view.ViewGroup;

import com.cgtrc.bym.myplane.entity.Hero;

/**
 * Created by bym on 2017/4/11.
 */

public class AddHeroListener extends AddEntityListener<Hero> {


    public AddHeroListener(Hero hero) {
        super(hero);
    }

    @Override
    protected void onLayoutFinish() {
        Hero hero = t;
        int parentWidth = ((ViewGroup)hero.getParent()).getWidth();
        int parentHeight = ((ViewGroup)hero.getParent()).getHeight();
        float translationX = parentWidth / 2 - hero.getWidth() / 2;
        hero.setTranslationX(translationX);
        hero.setTranslationY(parentHeight-hero.getHeight());
        hero.setVisibility(View.VISIBLE);
    }
}
