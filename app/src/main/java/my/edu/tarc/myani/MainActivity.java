package my.edu.tarc.myani;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageViewCircle;
    Animation animationCircle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewCircle = (ImageView)findViewById(R.id.imageViewCircle);
        // load the animation
        animationCircle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        imageViewCircle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        imageViewCircle.startAnimation(animationCircle);
    }
}
