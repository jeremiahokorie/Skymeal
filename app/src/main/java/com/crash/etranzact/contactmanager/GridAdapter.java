package com.crash.etranzact.contactmanager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.name;
import static android.R.attr.onClick;
import static android.R.attr.theme;

/**
 * Created by Etranzact on 11/21/2017.
 */

public class GridAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    // ArrayList<skyEvent>list;


    Context context;
    private final String[] values;
    private final String[] prices;
    private final int[] images;
    private final String[]description;
    View view;
    LayoutInflater layoutInflater;



    public GridAdapter(Context context, String[] values, String[] prices, int[] images,String[] description) {
        this.context = context;
        this.values = values;
        this.images = images;
        this.prices = prices;
        this.description=description;


        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       Intent i = new Intent();
    }

    static class ViewHolder {

        TextView name;
        TextView descriptionP;
        TextView price;
        ImageView image;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        ViewHolder holder = null;

        if (view == null) {

            holder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.single_item, null);

            holder.image = (ImageView) view.findViewById(R.id.images);
            holder.name = (TextView) view.findViewById(R.id.names);
            holder.price = (TextView) view.findViewById(R.id.prices);
           // holder.descriptionP=(TextView)view.findViewById(R.id.descriptionP);
            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }

       // skyEvent temp = list.get(position);

        //set data
        holder.name.setText(values[position]);
        holder.price.setText(prices[position]);
        holder.image.setImageResource(images[position]);
       // holder.descriptionP.setText(description[position]);



        return view;

    }

//}
//
//class skyEvent{
//    int images;
//    String prices;
//    String values;
//
//    skyEvent(int images,String prices,String values){
//        this.images = images;
//        this.prices = prices;
//        this.values = values;
//
//    }
//
//
//}
    }
