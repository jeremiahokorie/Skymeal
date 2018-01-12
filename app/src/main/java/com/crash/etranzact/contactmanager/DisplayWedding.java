package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayWedding extends AppCompatActivity {
    TextView name;
    ImageView imagess;
    TextView pricess;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_wedding);
        name = (TextView)findViewById(R.id.names);
        imagess = (ImageView)findViewById(R.id.images);
        pricess = (TextView)findViewById(R.id.prices);

        String value = (String) getIntent().getExtras().get("value");
        String price = (String) getIntent().getExtras().get("price");
        int image = (int) getIntent().getExtras().get("image");

        button = (Button)findViewById(R.id.button);

        name.setText(value);
        imagess.setImageResource(image);
        pricess.setText(price);

    }
    public void ButtonPayment(View view){
        Intent i = new Intent(this,CheckOutActivity.class);
        startActivity(i);
    }
    public void BackButton(View view){
        finish();
    }
}
