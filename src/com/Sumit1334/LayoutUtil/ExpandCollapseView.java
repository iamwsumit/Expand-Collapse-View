package com.Sumit1334.LayoutUtil;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.*;

@DesignerComponent(version = 1,  description = "This extension helps you to expand or collapse the android view component by Sumit Kumar",category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "https://community.kodular.io/user_avatar/community.kodular.io/sumit1334/120/82654_2.png")
@SimpleObject(external = true)

public class ExpandCollapseView extends AndroidNonvisibleComponent implements Component {
    public ExpandCollapseView(ComponentContainer container) {
        super(container.$form());
    }

    @SimpleEvent(description = "This event raises when component expanded")
    public void AfterExpand(AndroidViewComponent component){
        EventDispatcher.dispatchEvent(this,"AfterExpand",component);
    }
    @SimpleEvent(description = "This event raises when a component collapsed")
    public void AfterCollapse(AndroidViewComponent component){
        EventDispatcher.dispatchEvent(this,"AfterCollapse",component);
    }

    @SimpleFunction(description = "Expand the height")
    public void ExpandHeight(final AndroidViewComponent component,final long duration,final int oldHeight,final int newHeight){
        ValueAnimator valueAnimator=ValueAnimator.ofInt(oldHeight,newHeight);
        valueAnimator.setDuration(duration);
        valueAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                AfterExpand(component);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    component.Height(Integer.parseInt(valueAnimator.getAnimatedValue().toString()));
            }
        });
        valueAnimator.start();


    }
    @SimpleFunction(description = "collapse the width")
    public void CollapseWidth(final AndroidViewComponent component,final long duration,final int oldWidth,final int newWidth){
        ValueAnimator valueAnimator=ValueAnimator.ofInt(oldWidth,newWidth);
        valueAnimator.setDuration(duration);
        valueAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                AfterCollapse(component);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    component.Width(Integer.parseInt(valueAnimator.getAnimatedValue().toString()));
            }
        });
        valueAnimator.start();


    }
    @SimpleFunction(description = "collapse the height")
    public void CollapseHeight(final AndroidViewComponent component,final long duration,final int oldHeight,final int newHeight){
        ValueAnimator valueAnimator=ValueAnimator.ofInt(oldHeight,newHeight);
        valueAnimator.setDuration(duration);
        valueAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                AfterCollapse(component);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    component.Height(Integer.parseInt(valueAnimator.getAnimatedValue().toString()));
            }
        });
        valueAnimator.start();
    }
    @SimpleFunction(description = "Expand the width")
    public void ExpandWidth(final AndroidViewComponent component,final long duration,final int oldWidth,final int newWidth){
        ValueAnimator valueAnimator=ValueAnimator.ofInt(oldWidth,newWidth);
        valueAnimator.setDuration(duration);
        valueAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                AfterExpand(component);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                component.Width(Integer.parseInt(valueAnimator.getAnimatedValue().toString()));
            }
        });
        valueAnimator.start();


    }
}