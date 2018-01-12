package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Fragment fragment = null;
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.contact) {
            Intent contact = new Intent(this,Contact.class);
            startActivity(contact);
            //fragment = new contactFragment();
            // Handle the camera action
        } else if (id == R.id.Last_order) {
            //fragment = new lastOrderFragment();

        } else if (id == R.id.Track_Location) {
            Intent intent = new Intent(this,MapActivity.class);
            startActivity(intent);

            //fragment = new locationFragment();

        } else if (id == R.id.Setting) {
            //fragment = new settingFragment();

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.Buy) {

        }else if (id ==R.id.Sign_Up){
            Intent intent = new Intent(this,RegisterActivity.class);
            startActivity(intent);


        }else if (id ==R.id.Login){
            Intent login = new Intent(this,MainActivity.class);
            startActivity(login);

        }else if (id == R.id.Home){
//            Intent home = new Intent(this,HomeActivity.class);
//            startActivity(home);
        }

      if (fragment !=null){
          FragmentManager fragmentManager = getSupportFragmentManager();
          FragmentTransaction ft = fragmentManager.beginTransaction();
          ft.replace(R.id.screen_area,fragment);
          ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void swallowOpen(View view){
        Intent swallow = new Intent(HomeActivity.this,Swallow.class);
        startActivity(swallow);
    }
    public void moimoiOpen(View view){
        Intent moimoi = new Intent(HomeActivity.this,MoiMoi.class);
        startActivity(moimoi);
    }
    public void soupOpen(View view){
        Intent soup = new Intent(HomeActivity.this,Soup.class);
        startActivity(soup);
    }

    public void riceOpen(View view){
        Intent rice = new Intent(HomeActivity.this,Rice.class);
        startActivity(rice);
    }

    public void yamOpen(View view){
        Intent yam = new Intent(HomeActivity.this,Yam.class);
        startActivity(yam);
    }
    public void eventButton(View view){
        Intent event = new Intent(HomeActivity.this,EventActivity.class);
        startActivity(event);

    }

    public  void cakeButton(View view){
        Intent cake = new Intent(HomeActivity.this,CakeActivity.class);
        startActivity(cake);
    }

    public void drinkButton(View view){
        Intent drink = new Intent(HomeActivity.this,DrinkActivity.class);
        startActivity(drink);
    }
    public void snacksButton(View view){
        Intent snacks = new Intent(HomeActivity.this,SnacksActivity.class);
        startActivity(snacks);
    }
    public void plannerButton(View view){
        Intent planner = new Intent(HomeActivity.this,EventPlanner.class);
        startActivity(planner);
    }

    public void entertainerButton(View view){
        Intent entertain = new Intent(HomeActivity.this,Entertainment.class);
        startActivity(entertain);
    }
    public void rentCarButton (View view){
        Intent car = new Intent(HomeActivity.this,RentCar.class);
        startActivity(car);
    }

    public void weddingButton(View view){
            Intent gown = new Intent(HomeActivity.this,WeddingGown.class);
            startActivity(gown);
    }
}
