package my.edu.tarc.myani;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by kweetecksee on 24/08/16.
 */
public class GrowAnimation {
    View view;
    Context context;
    Animation animationCircle;
    boolean state;

    public GrowAnimation(Context context, View view) {
        this.view = view;
        this.context = context;
        startAnimation();
    }

    public void startAnimation(){
        // load the animation
        animationCircle = AnimationUtils.loadAnimation(context, R.anim.zoom_out);

        animationCircle.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation animationCirlce = AnimationUtils.loadAnimation(context, R.anim.zoom_out);
                animationCirlce.setAnimationListener(this);
                view.startAnimation(animationCirlce);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        view.startAnimation(animationCircle);
    }

    public void stopAnimation(){
        view.setBackgroundResource(R.drawable.circle);
    }


}
