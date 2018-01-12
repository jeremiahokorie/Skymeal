package com.crash.etranzact.contactmanager;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.crash.etranzact.contactmanager.R.id.image;
import static com.crash.etranzact.contactmanager.R.id.price;
import static com.crash.etranzact.contactmanager.R.id.prices;
import static com.crash.etranzact.contactmanager.R.id.pricesP;
import static com.crash.etranzact.contactmanager.R.id.quantity;

public class DisplaySnacks extends AppCompatActivity {
    TextView nameOfProduct;
    ImageView imagesOfProduct;
    TextView priceOfProduct;
    TextView descriptionOfProduct;

    Button TotalOrder;
    TextView price;
    // Button    button;
    Spinner myspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_snacks);
        myspinner = (Spinner) findViewById(R.id.quantity);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(DisplaySnacks.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Select_quantity));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        myspinner.setAdapter(myAdapter);

        TotalOrder= (Button) findViewById(R.id.order);
        price = (TextView) findViewById(R.id.price);

        nameOfProduct = (TextView) findViewById(R.id.namesP);
        imagesOfProduct = (ImageView) findViewById(R.id.imagesP);
        priceOfProduct = (TextView) findViewById(R.id.pricesP);
        descriptionOfProduct = (TextView) findViewById(R.id.descriptionP);

        String value = (String) getIntent().getExtras().get("value");
        String price = (String) getIntent().getExtras().get("price");
        String desc = (String) getIntent().getExtras().get("desc");
        int image = (int) getIntent().getExtras().get("image");

        //button = (Button)findViewById(R.id.button);

        nameOfProduct.setText(value);
        imagesOfProduct.setImageResource(image);
        priceOfProduct.setText(price);
        descriptionOfProduct.setText(desc);

    }

    //    public void exitButton(View view){
//        finish();
//    }
    // Button make payment click to proceed to payment activity
    public void ButtonMakePayment(View view) {
        Intent payMent = new Intent(DisplaySnacks.this, CheckOutActivity.class);
        payMent.putExtra("price", prices);
        payMent.putExtra("image", image);
        payMent.putExtra("quantity", quantity);
        startActivity(payMent);
    }

    public void ButtonAddToCart(View view) {
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
        alertdialog.setMessage("You have successfully added your item to cart");
        alertdialog.setCancelable(false);
        alertdialog.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertdialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent close = new Intent(DisplaySnacks.this, HomeActivity.class);
                startActivity(close);
            }
        });
        alertdialog.show();

    }
    public void TotalOrder(View view){
        display(2);

    }
    private void display(int number){
        TextView price = (TextView)findViewById(R.id.price);
        price.setText(""+number);
    }
    public void exitButton(View view){
        finish();
    }
}
