package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toolbar;

import static com.crash.etranzact.contactmanager.R.id.toolbar;

public class RentCar extends AppCompatActivity {


    GridView gridView;

    String[] values = {
            "Range Rover",
            "High Lander",
            "Camry",
            "Acura",
            "Lexus",
            "Mercedes",
            "Ford",
            "Hunda",
            "Kia",
            "Element",
            "Infinity",
            "Hyundai",

    };
    String[]description={
            "Range Rover Sport 2016 model,Black travels 120km/h For Wedding and private use",
            "High Lander 2016 model,Black travels 120km/h For Wedding and private use",
            "Toyota Camry 2016 model,Black travels 120km/h For Wedding and private use",
            "Acura 2016 model,Black travels 120km/h For Wedding and private use",
            "Lexus  2016 model,Black travels 120km/h For Wedding and private use",
            "Mercedes 2016 model,Black travels 120km/h For Wedding and private use",
            "Ford 2016 model,Black travels 120km/h For Wedding and private use",
            "Hunda 2016 model,Black travels 120km/h For Wedding and private use",
            "Kia 2016 model,Black travels 120km/h For Wedding and private use",
            "Element 2016 model,Black travels 120km/h For Wedding and private use",
            "Infinity 2016 model,Black travels 120km/h For Wedding and private use",
            "Hyundai 2016 model,Black travels 120km/h For Wedding and private use",

    };

    String[]prices ={"150,000","200,000","100,000","150000","200,000","100,000","100,000","150,000","100,000","90,000","200,000","200,000"};

    int[] images = {
            R.drawable.rangerover,
            R.drawable.highlander,
            R.drawable.camry,
            R.drawable.acura,
            R.drawable.mercedes,
            R.drawable.ford,
            R.drawable.hunda,
            R.drawable.kia,
            R.drawable.element,
            R.drawable.lexus,
            R.drawable.infinity,
            R.drawable.hyundai,
    };


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_car);

        gridView = (GridView) findViewById(R.id.car);

        GridAdapter gridAdapter = new GridAdapter(this, values, prices,images,description);

        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),DisplayRentCar.class);
                i.putExtra("value",  values[position]);
                i.putExtra("price",  prices[position]);
                i.putExtra("image", images[position]);
                i.putExtra("desc",description[position]);
                startActivity(i);
            }
        });


    }
}
