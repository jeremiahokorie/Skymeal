package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class DrinkActivity extends AppCompatActivity {

    GridView gridView;

    String [] values = {

            "Wines",
            "Bear",
            "Malt",
            "Fruit Juice",
            "Chivita",
            "Chamdor",
            "Veleta",
            "Five Alive",
            "Ruby",
            "Capic",
            "Plastic Drink",
            "Alcohol Wines",

    };
    String[]prices ={"5000","350","150","500","500","1500","1650","500","5000","4500","150","400"};

    int[]images = {
            R.drawable.wines,
            R.drawable.bear,
            R.drawable.malt,
            R.drawable.fruita,
            R.drawable.chivita,
            R.drawable.chamdor,
            R.drawable.veleta,
            R.drawable.fivealive,
            R.drawable.rubi,
            R.drawable.capic,
            R.drawable.cansoftdrink,
            R.drawable.alcoholwine,


    };

    String[]description={
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",
            "Strawberry doughnut made from pure straw berry recipe best enjoyed with a drink",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);


        gridView = (GridView) findViewById(R.id.drink);

        GridAdapter gridAdapter = new GridAdapter(this,values,prices,images,description);

        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),DisplayDrink.class);
                i.putExtra("value",  values[position]);
                i.putExtra("price",  prices[position]);
                i.putExtra("image", images[position]);
                i.putExtra("desc",description[position]);
                startActivity(i);
            }
        });

    }
    public void buttonDrink(View view){
        Intent i = new Intent(this,PaymentActivity.class);
        startActivity(i);
    }

}
