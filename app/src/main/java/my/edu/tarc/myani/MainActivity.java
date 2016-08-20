package my.edu.tarc.myani;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewCircle, imageViewCircle2;
    Animation animationCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewCircle = (ImageView)findViewById(R.id.imageViewCircle);
        imageViewCircle2 = (ImageView)findViewById(R.id.imageViewCircle2);
        startAnimation();
    }


    public void startAnimation(){
        // load the animation
        animationCircle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        //animationCircle.setRepeatCount(Animation.INFINITE);
        animationCircle.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation animationCirlce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
                animationCirlce.setAnimationListener(this);
                imageViewCircle.startAnimation(animationCirlce);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        imageViewCircle.startAnimation(animationCircle);
    }

}
