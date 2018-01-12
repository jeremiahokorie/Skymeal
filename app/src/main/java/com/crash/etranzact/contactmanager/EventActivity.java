package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class EventActivity extends AppCompatActivity {

    GridView gridView;

    String [] values = {

            "Ecko Convention Center",
            "Oriental Hotel",
            "Landmark Event Center",
            "Dorchester Event Center",
            "Raddison blu",
            "The lekki coliseum",
            "Victoria crown Hotel",
            "Aquatic Hotel",
            "Anchor Event place",
            "Civil Center",
            "Boat Halls",
            "Imperia Hall",

    };

    String[]prices ={"5M","5M","3.5M","2M","2.5M","1","1M","500,000","5M","","1M","1.5M"};

    int[]images = {
            R.drawable.ekoconventioncentre,
            R.drawable.orientalevent,
            R.drawable.landmark,
            R.drawable.dorchester,
            R.drawable.raddissonblu,
            R.drawable.lekkicoliseum,
            R.drawable.civic,
            R.drawable.aquartic,
            R.drawable.anchor,
            R.drawable.civic,
            R.drawable.dorchester,
            R.drawable.vcp,

    };
    String[]description={
            "Eko Hotels & Suites is the most preferred hotel in West Africa and it's all about the right mix! Located in the heart of Victoria Island and shielded from the hustle and bustle of the Lagos metropolis, we offer our corporate clients and walk in guests a perfect blend of relaxation, activities, and African tradition delicately infused to meet the highest international standards.",

            "Spend a night or more at Lagos Oriental Hotel and pay less! Explore the hotel before you visit",

            "Landmark Offers Best Event Centres, Conference Halls, Exhibition Halls, Expo, Product Launch, Board Meetings, Wedding Hall in Lagos At Affordable Price ",

            "the dorchester event centre-the dorchester event centre, victoria island, lagos nigeria, hall for rent in Victoria Island, event centres in Victoria Island Lagos ..",

            "The Radisson Blu Anchorage Hotel in Lagos provides fantastic facilities and beautiful views over the lagoon from the banks of upscale Victoria Island ",

            "The Lekki Coliseum (TLC) is an entertainment and event hub that houses three exquisite and unusual venues – The Skyview (Lounge and special Events), The Imperial ..",

            "The spectacular view from this glass walled panoramic hall that seats 130 Banquet and 200 conference, is better seen to be fully appreciated. ",

            "Aquatic Hotels and Water Parks are located in the centre of Ikeja, Lagos City,Nigeria. This is one of the few luxury hotels in Lagos-State offering guests the",

            "Anchor Events Place is an ultra-modern event and conference meetings venue that offers the state-of-the-art facilities for event planners and celebrants. ",

            "The spectacular view from this glass walled panoramic hall that seats 130 Banquet and 200 conference, is better seen to be fully appreciated.",

            "the dorchester event centre-the dorchester event centre, victoria island, lagos nigeria, hall for rent in Victoria Island, event centres in Victoria Island Lagos ..",

            "vcp hotel-vcp hotel, victoria island, lagos nigeria, hall for rent in Victoria Island, event centres in Victoria Island Lagos, venues in Victoria Island Lagos nigeria ",

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        gridView = (GridView) findViewById(R.id.event);

        GridAdapter gridAdapter = new GridAdapter(this,values,prices,images,description);

        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),DisplayEventCenter.class);
                i.putExtra("value",  values[position]);
                i.putExtra("price",  prices[position]);
                i.putExtra("image", images[position]);
                i.putExtra("desc",description[position]);
                startActivity(i);
            }
        });


    }
}
