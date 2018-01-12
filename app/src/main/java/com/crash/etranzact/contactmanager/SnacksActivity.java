package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class SnacksActivity extends AppCompatActivity {

    GridView gridView;

    String[] values = {

            "StrawBerry Doughnut",
            "Small Chops",
            "Sausage Roll",
            "Meat pie",
            "Egg Roll",
            "Chin Chin",
            "Chin Chin",
            "Meat",
            "Puff Puff",
            "Chips",
            "Piza",
            "MeatPie",
    };

    String[] description = {
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

    int[] images = {

            R.drawable.doughnutcake,
            R.drawable.smallchops,
            R.drawable.sausage,
            R.drawable.meatpie,
            R.drawable.eggrow,
            R.drawable.chinchin,
            R.drawable.chinchin,
            R.drawable.meat,
            R.drawable.puffpfuff,
            R.drawable.chips,
            R.drawable.piza,
            R.drawable.meatpie,
    };

    String[] prices = {"100", "500", "150", "350", "100", "100", "500", "100", "100", "2500", "150", "350"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

        gridView = (GridView) findViewById(R.id.snacks);

        GridAdapter gridAdapter = new GridAdapter(this, values, prices, images, description);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), DisplaySnacks.class);
                i.putExtra("value", values[position]);
                i.putExtra("price", prices[position]);
                i.putExtra("image", images[position]);
                i.putExtra("desc", description[position]);

                startActivity(i);
            }
        });

    }
}
