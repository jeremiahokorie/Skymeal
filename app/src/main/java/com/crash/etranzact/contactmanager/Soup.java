package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Soup extends AppCompatActivity {

    GridView gridView;

    String [] values = {
            "Egusi",
            "Bitter leaf",
            "Oha",
            "Ewedu",
            "Ogbonor",
            "Vegetable",
            "Ofe nsala",
            "kpegiri",
            "Ofe Owerri",
            "Okro",
            "Ofe Akwu",
            "Efor",

    };

    String[]prices ={"5000","350","150","500","500","1500","1650","500","5000","4500","150","400"};

    int[]images = {
            R.drawable.okro,
            R.drawable.bitterleaf,
            R.drawable.oha,
            R.drawable.ewedu,
            R.drawable.ogbono,
            R.drawable.vegetable,
            R.drawable.nsala,
            R.drawable.kpegiri,
            R.drawable.owerri,
            R.drawable.okro,
            R.drawable.ofeagwu,
            R.drawable.efor,



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
        setContentView(R.layout.activity_soup);

        gridView = (GridView) findViewById(R.id.grid);

        GridAdapter gridAdapter = new GridAdapter(this,values,prices,images,description);

        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),DisplaySoup.class);
                i.putExtra("value",  values[position]);
                i.putExtra("price",  prices[position]);
                i.putExtra("image", images[position]);
                i.putExtra("desc",description[position]);
                startActivity(i);
            }
        });



    }
}
