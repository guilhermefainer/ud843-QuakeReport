package com.example.android.quakereport;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by Guilherme on 23/08/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> eq) {
        super(context, 0, eq);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake currentEq= getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeTextView.setText(String.valueOf(currentEq.getMagnitude()));

        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeTextView.getBackground();
        int magnitudeColor = getMagnitudeColor(currentEq.getMagnitude());
        magnitudeCircle.setColor(magnitudeColor);

        String location;
        location = currentEq.getLocation().contains("of") ? currentEq.getLocation().substring(0,
                currentEq.getLocation().indexOf("of")+2) : "perto de";

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(location);

        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentEq.getLocation().replace(location+" ", ""));

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        dateTextView.setText(df.format(currentEq.getDate()));

        TextView hourTextView = (TextView) listItemView.findViewById(R.id.hour_text_view);
        df = new SimpleDateFormat("HH:mm:ss");
        hourTextView.setText(df.format(currentEq.getDate()));

        return listItemView;
    }

    private int getMagnitudeColor(double mag)
    {
        int color = (int)Math.floor(mag);
        int colorId;
        switch (color)
        {
            case 1: colorId = R.color.magnitude1; break;
            case 2: colorId = R.color.magnitude2; break;
            case 3: colorId = R.color.magnitude3; break;
            case 4: colorId = R.color.magnitude4; break;
            case 5: colorId = R.color.magnitude5; break;
            case 6: colorId = R.color.magnitude6; break;
            case 7: colorId = R.color.magnitude7; break;
            case 8: colorId = R.color.magnitude8; break;
            case 9: colorId = R.color.magnitude9; break;
            default: colorId = R.color.magnitude10plus; break;
        }
        return ContextCompat.getColor(getContext(), colorId);
    }
}
