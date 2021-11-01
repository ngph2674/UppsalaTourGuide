package com.example.android.uppsalatourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HospitalFragment extends Fragment {

    public HospitalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_serviceschild, container, false);

        ImageView img = (ImageView) rootView.findViewById(R.id.childImageService);
        img.setImageResource(R.drawable.hospital);

        TextView title = (TextView) rootView.findViewById(R.id.nameService);
        title.setText(getString(R.string.hospital));

        TextView address = (TextView) rootView.findViewById(R.id.addressService);
        address.setText(getString(R.string.hospitalAdress));

        TextView phone = (TextView) rootView.findViewById(R.id.phoneService);
        phone.setText(getString(R.string.hospitalPhone));

        TextView hours = (TextView) rootView.findViewById(R.id.hoursService);
        hours.setText(getString(R.string.hourHospital));

        return rootView;
    }
}