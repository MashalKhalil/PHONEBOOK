package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);

        @SuppressLint("ResourceType") Animation anim=
                AnimationUtils.loadAnimation(getApplicationContext(),R.animator.fade);
        t1.startAnimation(anim);
        @SuppressLint("ResourceType") Animation an=
                AnimationUtils.loadAnimation(getApplicationContext(),R.animator.moveup);
        t2.startAnimation(an);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(in);
            }
        },4000);
    }
}