package com.crash.etranzact.contactmanager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toolbar;

import java.util.List;

public class Entertainment extends AppCompatActivity {
    Toolbar toolbar;
    ListView list;
    SearchView search;

    String[]entertainers = {"DJ EM JOE","DJ Exclusive","DJ Flem","DJ Zeally","DJ Sam Whyte","DJ Zeezco","Osho shot","MC Reality",
    "MC Jacedoor","Kids Entertainer","MC Klown","DJ jIMMY JATT","MC Brown","Panda"};

    ArrayAdapter<String>adapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
        list =(ListView)findViewById(R.id.list);

        toolbar =(Toolbar)findViewById(R.id.toolbar);
//        toolbar.setTitle(getResources().getString(R.string.app_name));
        search = (SearchView)findViewById(R.id.search);
        list.setBackgroundColor(Color.CYAN);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,entertainers);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Entertainment.this,OutputActivity.class);
                intent.putExtra("entertainers",list.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });
        list.setAdapter(adapter);

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {
                adapter.getFilter().filter(text);
                return false;
            }
        });
    }
}
