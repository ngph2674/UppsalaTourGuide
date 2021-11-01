package com.example.android.uppsalatourguide;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MidsummerFragment extends Fragment {

    public MidsummerFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_eventchild, container, false);

        ImageView luciaPic = (ImageView) rootView.findViewById(R.id.childImage);
        luciaPic.setImageResource(R.drawable.midsommar);

        TextView luciaText = (TextView) rootView.findViewById(R.id.textChild);
        luciaText.setText("Given Scandinavia’s long, dark winters, it’s not surprising that the " +
                "arrival of summer is a big deal throughout the Nordic countries. In Sweden, " +
                "Midsummer’s Eve is one of the most important days of the year, " +
                "rivaling Christmas with its festive spirit and traditions."+
                "Traditionally, Midsummer was celebrated on June 24, the feast day of St. " +
                "John the Baptist, but the holiday has its roots in a pre-Christian solstice " +
                "festival. Rather than trying to stamp out such pagan festivals, the early " +
                "Catholic Church found it useful to coop them by associating them with " +
                "Christian celebrations. By establishing December 25 conveniently close to the " +
                "winter solstice as the date when Jesus was born, the Church was able to absorb " +
                "the pagan midwinter festival of Yule into the Christian celebration of Christmas. " +
                "Biblical sources suggest that St. John the Baptist was born six months before Jesus," +
                " meaning that his birthday could be equally conveniently associated with pagan " +
                "summer festivals. ");

        TextView luciaTitle = (TextView) rootView.findViewById(R.id.textTitle);
        luciaTitle.setText(getString(R.string.midsummer));

        return rootView;
    }
}