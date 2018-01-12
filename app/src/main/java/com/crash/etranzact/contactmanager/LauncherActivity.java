package com.crash.etranzact.contactmanager;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Set;

import gr.net.maroulis.library.EasySplashScreen;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        EasySplashScreen conf = new EasySplashScreen(LauncherActivity.this)
                .withFullScreen()
                .withTargetActivity(HomeActivity.class)
                .withSplashTimeOut(2000)
                .withBackgroundColor(Color.parseColor("#FF3D00"));
               // .withLogo(R.drawable.images);
        //.withHeaderText("Welcome Quest !!!")
        // .withFooterText("Copyright 2017")
        // .withAfterLogoText("Welcome to MasterPass");
        // .withBeforeLogoText("E-tranzact Dev Co Ltd");


        Set Test ;
        conf.withBackgroundColor(Color.parseColor("#FF3D00"));
        //conf.getHeaderTextView().setTextColor(Color.RED);
        // conf.getFooterTextView().setTextColor(Color.RED);
        //  conf.getBeforeLogoTextView().setTextColor(Color.RED);
        // conf.getAfterLogoTextView().setTextColor(Color.RED);

        //Set to View

        View view = conf.create();

        //set view to content View

        setContentView(view);

    }
}
