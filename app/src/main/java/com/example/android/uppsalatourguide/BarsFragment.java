package com.example.android.uppsalatourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class BarsFragment extends Fragment {

    public BarsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_serviceschild, container, false);

        ImageView img = (ImageView) rootView.findViewById(R.id.childImageService);
        img.setImageResource(R.drawable.interpool);

        TextView title = (TextView) rootView.findViewById(R.id.nameService);
        title.setText(getString(R.string.interpool));

        TextView address = (TextView) rootView.findViewById(R.id.addressService);
        address.setText(getString(R.string.addressBar));

        TextView phone = (TextView) rootView.findViewById(R.id.phoneService);
        phone.setText(getString(R.string.phoneBar));

        TextView hours = (TextView) rootView.findViewById(R.id.hoursService);
        hours.setText(getString(R.string.hourBar));

        return rootView;
    }
}