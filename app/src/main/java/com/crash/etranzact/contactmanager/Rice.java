package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Rice extends AppCompatActivity {

    GridView gridView;

    //Names of the product
    String [] values = {
            "White Rice",
            "Jollof Rice",
            "Fried Rice",
            "Coconut Rice",
            "Rice and Vegetable",
            "Basmat Rice",
            "Chinese Rice",
            "Green Jollof Rice",
            "Ofada Rice",
            "Rice and Beans",
            "Sora sushi Rice",
            "Salad",

    };
    // Price for each product
    String[]prices ={"1000","1500","1500","1000","1500","1500","1500","1500","1500","1500","2000","1000"};

    int[]images = {
            R.drawable.ricendbeans,
            R.drawable.jollofrice,
            R.drawable.friedrice,
            R.drawable.coconutrice,
            R.drawable.ricendbeans,
            R.drawable.basmatjollofrice,
            R.drawable.chineserice,
            R.drawable.greenrice,
            R.drawable.ofada,
            R.drawable.beansandrice,
            R.drawable.sora,
            R.drawable.salad,

    };
    //description of the product

    String[]description={
            "White Rice and stew up on chicken and source ",
            "Jollof rice and chicken delicious best serve while hot",
            "Coconut rice love for it aroma and tasty",
            "Rice and beans ",
            "Basmati (pronounced IPA: [baːsmət̪iː] in South Asia) is a variety of long, slender-grained aromatic rice which is traditionally from the Indian subcontinent. As ...  ",
            "Chicken stir-fried with a colorful array of vegetables and a bounty of rice with a scramble of eggs running throughout. ",
            "Green rice made a fresh vegetable and stock fish ",
            "Ofada rice is a name for a heritage variety of rice grown in south-west Nigeria. It is grown almost exclusively in Ogun State, a state in Southwestern Nigeria. ",
            "On cold or rainy days, this comforting dish really fills the tummy. Sometimes I switch up pinto beans for kidney beans or use white rice instead of brown. Add rolls .",
            "On cold or rainy days, this comforting dish really fills the tummy. Sometimes I switch up pinto beans for kidney beans or use white rice instead of brown. Add rolls .",
            " The sushi was at best mediocre. The fried rice tasted like a version of a Mexican \" Fusion \" rice and was absolutely no where close to",
            "A salad is a dish consisting of a mixture of small pieces of food, usually predominantly vegetables. They are typically served at room temperature or chilled, with ",

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);

        gridView = (GridView) findViewById(R.id.rice);

        GridAdapter gridAdapter = new GridAdapter(this,values,prices,images,description);

        gridView.setAdapter(gridAdapter);

        //Set onitemclicklistener and pass the intent with it use putextra to pass parameter to the next activity.


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),DisplayRice.class);
                i.putExtra("value",  values[position]);
                i.putExtra("price",  prices[position]);
                i.putExtra("image", images[position]);
                i.putExtra("desc", description[position]);
                startActivity(i);
            }
        });


    }
}
