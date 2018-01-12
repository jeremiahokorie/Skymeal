package com.crash.etranzact.contactmanager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class EventPlanner extends AppCompatActivity {
    ListView lv;
    SearchView sv;

    String[] planners = {"Skymeal Event", "Presh Kitchen\n precious Ntukokwu", "Adyva food", "Chop chop", "Cherish", "Queen Bee", "Adyva food",
            "Delicious Cook ", "Mexican Cream", "Bolly jay exclusite event", "Bahk event solution", "Pekuliar production manager", "Adyva food", "Adyva food"};

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_planner);
        lv = (ListView) findViewById(R.id.list);
        sv = (SearchView) findViewById(R.id.searchview);
        lv.setBackgroundColor(Color.CYAN);
        

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, planners);
        lv.setAdapter(adapter);

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
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
