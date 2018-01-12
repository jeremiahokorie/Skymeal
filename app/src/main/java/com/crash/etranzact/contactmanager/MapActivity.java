package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void launchMap (View view)
    {
        Intent intent = null,chooser = null;
        if (view.getId() ==R.id.locator){
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076.72.8777"));
            chooser = Intent.createChooser(intent,"Launch Map");
            startActivity(chooser);
        }
    }

}
