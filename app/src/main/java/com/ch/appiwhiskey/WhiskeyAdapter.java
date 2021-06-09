package com.ch.appiwhiskey;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ch.appiwhiskey.models.Whiskey;

import java.util.List;

public class WhiskeyAdapter extends BaseAdapter {
    protected Activity activity;
    protected List<Whiskey> myWhiskeys;

    public WhiskeyAdapter(Activity activity, List<Whiskey> myWhiskey) {
        this.activity = activity;
        this.myWhiskeys = myWhiskey;
    }

    @Override
    public int getCount() {

        return myWhiskeys.size();
    }

    @Override
    public Object getItem(int position) {

        return myWhiskeys.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.whiskey_items, null);
        }
        Whiskey objWhiskey = myWhiskeys.get(position);
        TextView whiskeyName = view.findViewById(R.id.txtNombreWhiskey);
        whiskeyName.setText(objWhiskey.getWhiskeyName());

        return view;
    }
}
