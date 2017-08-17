package com.example.user.spuhome;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 2/7/2560.
 */

public class Listadpter extends BaseAdapter {
    private Context mcontext;
    private LayoutInflater mInflater;
    private String[] LocationMenu;

    public Listadpter(Context mcontext,String[] LocationMenu){
        this.mcontext = mcontext;
        this.LocationMenu = LocationMenu;
    }
    @Override
    public int getCount() {
        if (LocationMenu != null)
            return LocationMenu.length;
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        mInflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_list,null);
            holder = new ViewHolder();
            holder.Mapdisplay = (TextView) convertView.findViewById(R.id.TextList);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        if ((position %2)==0){
            convertView.setBackgroundColor(Color.rgb(255,255,255));
            holder.Mapdisplay.setTextColor(Color.rgb(255,182,193));
        }
        else{
            convertView.setBackgroundColor(Color.rgb(255,182,193));
            holder.Mapdisplay.setTextColor(Color.rgb(255,255,255));
        }
        holder.Mapdisplay.setText(LocationMenu[position]);
        return convertView;
    }
    private class ViewHolder{
        TextView Mapdisplay;
    }
}
