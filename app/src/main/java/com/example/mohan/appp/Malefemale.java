package com.example.mohan.appp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Malefemale extends AppCompatActivity {

    static int gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malefemale);


        final ImageView femimg = (ImageView) findViewById(R.id.femimg);
        final ImageView maleimg = (ImageView) findViewById(R.id.maleimg);
        final Button btnext = (Button) findViewById(R.id.gender);

        femimg.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    femimg.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    femimg.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())) {
                        femimg.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        maleimg.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gender = 1;

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    maleimg.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    maleimg.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    if (!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())) {
                        maleimg.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent genderintent = new Intent(Malefemale.this, Userinfo.class);
                Malefemale.this.startActivity(genderintent);
            }
        });

    }
}
