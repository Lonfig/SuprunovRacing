package com.example.racing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    public ImageView Car1;
    public ImageView Car2;
    public float i = 0;
    public boolean Down;
    public TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Car2 = (ImageView) findViewById(R.id.car2_img);
        text1 = (TextView) findViewById(R.id.textView1);
        Button button = (Button) findViewById(R.id.button_drive);
        button.setOnLongClickListener(new View.OnLongClickListener() {

            public boolean onLongClick(View v) {
                Car2 = (ImageView) findViewById(R.id.car2_img);
                TranslateAnimation animation2 = new TranslateAnimation(0, 2100, 0, 0);
                animation2.setDuration(1500);
                animation2.setFillAfter(true);
                Car2.startAnimation(animation2);
                text1.setText("Game Over");
                return true;
            }
        });
    }

    public void onMyButtonClick(View view)
    {
        Car1 = (ImageView) findViewById(R.id.car1_img);
        TranslateAnimation animation = new TranslateAnimation(0, 2100, 0, 0);
        animation.setDuration(2500);
        animation.setFillAfter(true);
        Car1.startAnimation(animation);
    }
}