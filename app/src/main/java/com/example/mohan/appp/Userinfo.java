package com.example.mohan.appp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Userinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);

        final TextView tvgen = (TextView)findViewById(R.id.tvgen);

        if(Malefemale.gender==1){

            tvgen.setText("Hey BOyy");

        }

        else
        {
            tvgen.setText("Hey Girl");
        }
    }

}
