package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class WeddingGown extends AppCompatActivity {

    GridView gridView;

    String [] values = {

            "Ball Gown",
            "A-Line",
            "Modified A-Line",
            "Trumpet",
            "Mermaid",
            "Sheath",
            "Tea Length",
            "Mini",
            "Ruby",
            "Capic",
            "Float",
            "Ultra V",
            "Colourful",
            "Step",
            "French",
    };

    int[]images = {
            R.drawable.ballgown,
            R.drawable.angel,
            R.drawable.aso1,
            R.drawable.aso2,
            R.drawable.demotrice,
            R.drawable.engalia,
            R.drawable.fitflare,
            R.drawable.haircut,
            R.drawable.stellayork,
            R.drawable.sheer,
            R.drawable.allurebridals,
            R.drawable.versaartelia,
            R.drawable.red,
            R.drawable.step,
            R.drawable.aso3,

    };
    String[]description={

            "Ball Gown Lace-up Sleeveless Chapel Train ",
            "Angel wedding gown comes with the feather and can be used for little pride ",
            "Sweetheart Appliques Sleeveless Champagne ",
            "Sweep Train Crystals Backless Sleeveless Ball ",
            "A-Line Long Sleeve Wedding Dress With Zipper",
            "Appliques Sheath Sleeveless Chapel Train ",
            "Ivory Backless Strapless Mermaid Sweep Train ",
            "Backless Chapel Train Sleeveless A-line  ",
            "Ruby wedding Armless gown well slimmed with a hair crown ",
            "Capic Wedding gown well detailed ",
            "Float Wedding gown so free to the ground enjoy free walk",
            "Versa artelia romans wedding gown first use by the romans empire on her inauguration",
            "Red wedding gown Lace Sleeveless Sweep Train White Backless ",
            "Step wedding gown love for it beak between and the flow",
            "Aso wedding Gown easy flexible and well to do",


    };

    String[]prices ={"50,000","50,000","50,000","50,000","50,000","50,000","50,000","50,000","50,000","50,000","50,000","50,000","50,000","50,000","50,000"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding_gown);


        gridView = (GridView) findViewById(R.id.wedding);

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

        //gridView.setOnItemClickListener();
    }

}