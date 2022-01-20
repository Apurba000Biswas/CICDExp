package com.bs.apurba.cicdexp;

import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;

public class AnimationUtility {
    public static ScaleAnimation getBubbleAnimation(){
        ScaleAnimation bubble = new ScaleAnimation(0, 1, 0, 1
                , ScaleAnimation.RELATIVE_TO_SELF
                , .5f, ScaleAnimation.RELATIVE_TO_SELF
                , .5f);
        bubble.setDuration(1000);
        bubble.setInterpolator(new OvershootInterpolator());
        return bubble;
    }
}
