package com.ch.appiwhiskey;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ch.appiwhiskey.models.Destileria;

import java.util.List;
import java.util.zip.Inflater;

public class DestileriaAdapter extends BaseAdapter {
    protected Activity activity;
    protected List<Destileria> myDestileria;

    public DestileriaAdapter(Activity activity, List<Destileria> myDestileria) {
        this.activity = activity;
        this.myDestileria = myDestileria;
    }

    @Override
    public int getCount() {
        return myDestileria.size();
    }

    @Override
    public Object getItem(int position) {
        return myDestileria.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vista = inflater.inflate(R.layout.destileria_items, null);
        }
        Destileria objDestileria = myDestileria.get(position);
        TextView nombreDestileria = vista.findViewById(R.id.txtNombreDestileria);
        nombreDestileria.setText(objDestileria.getDestileriaName());
        return vista;
    }
}
