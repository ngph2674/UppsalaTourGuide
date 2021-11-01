package com.example.android.uppsalatourguide;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ValborgFragment extends Fragment {

    public ValborgFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_eventchild, container, false);

        ImageView luciaPic = (ImageView) rootView.findViewById(R.id.childImage);
        luciaPic.setImageResource(R.drawable.valborg);

        TextView luciaText = (TextView) rootView.findViewById(R.id.textChild);
        luciaText.setText("The 30th of April, Walpurgis Eve – referred to as ‘Sista april’ or " +
                "‘Valborg’ in Swedish – is the celebration of spring arriving in Sweden. " +
                "In Uppsala it is also the largest student event of the year with the Donning " +
                "of the Caps at Carolina Rediviva, student floats running the Fyris River, " +
                "singing at the Gunilla Bell Tower and much more." +
                "An important part of the Sista April celebrations in Uppsala is the traditional " +
                "Donning of the Caps by Carolina Rediviva. At 15:00 precisely, " +
                "the Vice-Chancellor raises his student cap from the balcony of the library and " +
                "waves to the crowds. The people in the crowd respond with a great big cheer " +
                "and wave their own student caps. This marks the arrival of spring.");

        TextView luciaTitle = (TextView) rootView.findViewById(R.id.textTitle);
        luciaTitle.setText(getString(R.string.valborg));

        return rootView;
    }
}