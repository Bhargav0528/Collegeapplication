package com.example.mohan.appp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);


        final TextView tvuser = (TextView)findViewById(R.id.tvuser);
        final ImageView dp =  (ImageView)findViewById(R.id.dp);
        final Button file = (Button)findViewById(R.id.btfile);
        final Button forum = (Button)findViewById(R.id.btforum);

        file.setOnClickListener(this);
        forum.setOnClickListener(this);


        Intent textintent = getIntent();
        String user = textintent.getStringExtra("username");
        tvuser.setText(user);




    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btfile:
                Intent fileintent = new Intent(UserAreaActivity.this,user_files.class);
                UserAreaActivity.this.startActivity(fileintent);
                break;
            case R.id.btforum:
                break;

        }
    }
}
