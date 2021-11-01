package com.example.android.uppsalatourguide;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class LuciaFragment extends Fragment {

    public LuciaFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_eventchild, container, false);

        ImageView luciaPic = (ImageView) rootView.findViewById(R.id.childImage);
        luciaPic.setImageResource(R.drawable.lucia);

        TextView luciaText = (TextView) rootView.findViewById(R.id.textChild);
        luciaText.setText("The annual candlelit Lucia procession on 13 December is perhaps one " +
                "of the more exotic-looking Swedish customs, " +
                "with girls and boys clad in white full-length gowns singing songs together." +
                "The real candles are now sometimes replaced with battery-powered ones, " +
                "but there is still a special atmosphere when the lights are dimmed and the sound of" +
                " the children singing grows as they enter from an adjacent room." +
                "Tradition has it that Lucia is to wear ‘light in her hair’, which in practice means" +
                " a crown of electric candles in a wreath on her head. Each of her handmaidens carries" +
                " a candle, too. Parents gather in the dark with their mobile cameras at the ready." +
                "The star boys, who like the handmaidens are dressed in white gowns, carry stars on " +
                "sticks and have tall paper cones on their heads. The Christmas elves bring up the rear," +
                " carrying small lanterns.");

        TextView luciaTitle = (TextView) rootView.findViewById(R.id.textTitle);
        luciaTitle.setText(getString(R.string.lucia));

        return rootView;
    }
}