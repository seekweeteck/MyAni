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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageViewCircle, imageViewCircle2;
    GrowAnimation growAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewCircle = (ImageView)findViewById(R.id.imageViewCircle);
        imageViewCircle.setOnClickListener(this);
        imageViewCircle2 = (ImageView)findViewById(R.id.imageViewCircle2);
        imageViewCircle2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();

        if(id == R.id.imageViewCircle){
            growAnimation = new GrowAnimation(this, imageViewCircle);
        }else if(id == R.id.imageViewCircle2){
            growAnimation = new GrowAnimation(this, imageViewCircle2);
        }
    }
}
