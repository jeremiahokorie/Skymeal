package com.crash.etranzact.contactmanager;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.craftman.cardform.Card;
import com.craftman.cardform.CardForm;
import com.craftman.cardform.OnPayBtnClickListner;

import static com.crash.etranzact.contactmanager.R.id.alertTitle;
import static com.crash.etranzact.contactmanager.R.id.prices;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        CardForm cardForm = (CardForm) findViewById(R.id.cardform);
        TextView txtDes = (TextView) findViewById(R.id.payment_amount);
        Button btnpay = (Button) findViewById(R.id.btn_pay);
        //String price = (String) getIntent().getExtras().get("prices");

        txtDes.setText("100");
        btnpay.setText(String.format("payer %s", txtDes.getText()));

        cardForm.setPayBtnClickListner(new OnPayBtnClickListner() {
            @Override
            public void onClick(Card card) {

              Intent i = new Intent(PaymentActivity.this,ConfirmationActivity.class);
               startActivity(i);

                AlertDialog.Builder alertDig = new AlertDialog.Builder(PaymentActivity.this);
                alertDig.setMessage("You have successfully made your payment");
                alertDig.setCancelable(false);
                alertDig.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                alertDig.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // what to do
                    }
                });

                Toast.makeText(PaymentActivity.this, "Name:" + card.getName() + "| Last 4 digits :" + card.getLast4(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
