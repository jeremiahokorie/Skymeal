package com.crash.etranzact.contactmanager;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class OutputActivity extends AppCompatActivity {
    Toolbar mtoolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

      //  mtoolbar = (Toolbar)findViewById(R.id.twobar);
        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
           // mtoolbar.setTitle(bundle.getString("entertainer"));
        }


    }
}