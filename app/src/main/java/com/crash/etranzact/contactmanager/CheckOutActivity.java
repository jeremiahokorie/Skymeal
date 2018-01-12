package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CheckOutActivity extends AppCompatActivity {
    ImageView imageV;
    TextView quantityD;
    TextView totalM;
    TextView nameP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
//        imageV = (ImageView) findViewById(R.id.imageView2);
//        quantityD = (TextView) findViewById(R.id.quantity);
//        totalM = (TextView) findViewById(R.id.total);
//        nameP = (TextView) findViewById(R.id.productname);


//        String price = (String) getIntent().getExtras().get("price");
//        int image =(int) getIntent().getExtras().get("image");
//        String quantity = (String) getIntent().getExtras().get("quantity");
//        String productname =(String) getIntent().getExtras().get("productname");
//
//        // set the value were you want them to display in the next activity
//        totalM.setText(price);
//        quantityD.setText(quantity);
//        nameP.setText(productname);
//        imageV.setImageResource(image);

    }

    public void ButtonPayment(View view) {

        Intent i = new Intent(this, PaymentActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);
    }

}
