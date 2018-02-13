package com.blogspot.xreator.asmaulhusna;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by binfachri on 2/12/18.
 */

class CustomAdapter extends BaseAdapter{

    private String[] arab;
    private String[] arti;
    Context tempattampil;

    public CustomAdapter(AsmaulHusnaActivity asmaulHusnaActivity, String[] teksarab, String[] teksarti) {

        this.arab = teksarab;
        this.arti = teksarti;
        tempattampil = asmaulHusnaActivity;

    }

    @Override
    public int getCount() {
        return arab.length;
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

        View tampilan = LayoutInflater.from(tempattampil).inflate(R.layout.list_item,null);
        TextView itemarab = (TextView) tampilan.findViewById(R.id.txtarab);
        TextView itemarti = (TextView) tampilan.findViewById(R.id.txtarti);

        itemarab.setText(arab[position]);
        itemarti.setText(arti[position]);
        return tampilan;
    }
}
