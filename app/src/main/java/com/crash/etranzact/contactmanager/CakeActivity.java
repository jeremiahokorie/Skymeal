package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.Toolbar;

public class CakeActivity extends AppCompatActivity  {

    GridView gridView;

    String [] values = {

            "Chocolate Cake",
            "Cheese Cake",
            "Sponge Cake",
            "Pound Cake",
            "Butter Cake",
            "Cup Cake",
            "Fruit Cake",
            "Boston Cream Cake",
            "Step Cake",
            "Step",
            "Cup Cake",
            "Wedding Cake",


    };

    String[]prices ={"25,000","15,000","10,000","30,000","10,000","15,000","30,000","20,000","50,000","45,000","15,000","50,000"};

    String[]description={
            "Chocolate Cake Enjoy the sweetness of tasty chocolate",
            "Cheese cake Special for special occasion",
            "Sponge Cake with honny enjoy for every moment",
            "Pound cake delivers you with the best cake",
            "Cup cake tasty and affordable comes in verious colors ",
            "Fruit cake made of fruit",
            "Boston Cake  ",
            "Step Cake made for wedding Anniversary,Birthday",
            "Step",
            "Step cake",
            "Cup Cake",
            "Wedding Cake specially designed for wedding ",

    };


    int[]images = {

            R.drawable.chocolatecake,
            R.drawable.cake,
            R.drawable.spongecake,
            R.drawable.birhdaycake,
            R.drawable.carrotcake,
            R.drawable.oned,
            R.drawable.cupcake,
            R.drawable.strawberry,
            R.drawable.threed,
            R.drawable.homecake,
            R.drawable.coloecup,
            R.drawable.threed,

    };


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);


        gridView = (GridView) findViewById(R.id.cake);
        GridAdapter gridAdapter = new GridAdapter(this,values,prices,images,description);
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),DisplayActivity.class);
                 i.putExtra("value",  values[position]);
                 i.putExtra("price",  prices[position]);
                 i.putExtra("image", images[position]);
                 i.putExtra("desc",description[position]);

                startActivity(i);

            }
        });

    }

}
