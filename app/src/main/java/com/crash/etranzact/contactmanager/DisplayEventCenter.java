package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class DisplayEventCenter extends AppCompatActivity {
    TextView name;
    ImageView imagess;
    TextView pricess;
    TextView  descriptionOfProduct;
    Button button;
    Spinner myspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_event_center);
        myspinner = (Spinner)findViewById(R.id.quantity);

//Using ArrayaAdapter to display the spinner.
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(DisplayEventCenter.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Hall));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        myspinner.setAdapter(myAdapter);


        //Importing the xml code to java calling them by their id.

        name = (TextView)findViewById(R.id.names);
        imagess = (ImageView)findViewById(R.id.images);
        pricess = (TextView)findViewById(R.id.prices);
        descriptionOfProduct = (TextView)findViewById(R.id.descriptionP);


        String value = (String) getIntent().getExtras().get("value");
        String price = (String) getIntent().getExtras().get("price");
        String desc = (String) getIntent().getExtras().get("desc");
        int image = (int) getIntent().getExtras().get("image");

        button = (Button)findViewById(R.id.button);

        //After the getting the parameters you want to pass you set them to were you want them to be viewed
        name.setText(value);
        imagess.setImageResource(image);
        pricess.setText(price);
        descriptionOfProduct.setText(desc);
    }

    public void exitButton(View view){
        finish();
    }
    public void buttonEvent(View view){
        Intent i = new Intent(this,CheckOutActivity.class);
        startActivity(i);
    }
}

