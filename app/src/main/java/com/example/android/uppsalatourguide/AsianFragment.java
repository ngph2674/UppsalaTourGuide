package com.example.android.uppsalatourguide;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AsianFragment extends Fragment {

    public AsianFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tastechild, container, false);

        ImageView img = (ImageView) rootView.findViewById(R.id.restaurant);
        img.setImageResource(R.drawable.asiagrill);

        TextView nameRes = (TextView) rootView.findViewById(R.id.restaurantName);
        nameRes.setText(getString(R.string.asianGrill));

        TextView service = (TextView) rootView.findViewById(R.id.service);
        service.setText(getString(R.string.driveIn));

        TextView address = (TextView) rootView.findViewById(R.id.address);
        address.setText(getString(R.string.addressKung));

        TextView phone = (TextView) rootView.findViewById(R.id.phone);
        phone.setText(getString(R.string.phoneAsian));

        TextView hours = (TextView) rootView.findViewById(R.id.hours);
        hours.setText(getString(R.string.hoursAsian));

        Button btn1 = (Button) rootView.findViewById(R.id.directionBtn);
        btn1.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        });

        Button btn2 = (Button) rootView.findViewById(R.id.callBtn);
        btn2.setOnClickListener(v -> {
            String phone1 = getString(R.string.phoneAsian);
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone1, null));
            startActivity(intent);

        });

        return rootView;
    }
}