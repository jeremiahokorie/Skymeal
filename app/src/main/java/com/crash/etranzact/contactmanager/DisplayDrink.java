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

public class DisplayDrink extends AppCompatActivity {
    TextView name;
    ImageView imagess;
    TextView pricess;
    TextView  descriptionOfProduct;
    Button button;
    Spinner myspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_drink);


        myspinner = (Spinner)findViewById(R.id.quantity);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(DisplayDrink.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.drink_quantity));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        myspinner.setAdapter(myAdapter);

        name = (TextView)findViewById(R.id.names);
        imagess = (ImageView)findViewById(R.id.images);
        pricess = (TextView)findViewById(R.id.prices);
        descriptionOfProduct = (TextView)findViewById(R.id.descriptionP);

        String value = (String) getIntent().getExtras().get("value");
        String price = (String) getIntent().getExtras().get("price");
        String desc = (String) getIntent().getExtras().get("desc");
        int image = (int) getIntent().getExtras().get("image");

        button = (Button)findViewById(R.id.button);

        name.setText(value);
        imagess.setImageResource(image);
        pricess.setText(price);
        descriptionOfProduct.setText(desc);

    }


    public void exitButton(View view){
        finish();
    }
    public void buttonDrink(View view){
        Intent i = new Intent(this,CheckOutActivity.class);
        startActivity(i);
    }
}


