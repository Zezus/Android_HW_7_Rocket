package com.example.module7hw;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rocketImage = findViewById(R.id.rocket_image);
        rocketImage.setBackgroundResource(R.drawable.rocket);
        final AnimationDrawable rocketAnimation = (AnimationDrawable) rocketImage.getBackground();

        rocketImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rocketAnimation.start();
            }
        });
    }
}
