package com.example.android.uppsalatourguide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BotanicGardenFragment extends Fragment {

    public BotanicGardenFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_eventchild, container, false);

        ImageView luciaPic = (ImageView) rootView.findViewById(R.id.childImage);
        luciaPic.setImageResource(R.drawable.botanicgrden);

        TextView luciaText = (TextView) rootView.findViewById(R.id.textChild);
        luciaText.setText("The Botanical Garden is one of Uppsala's most popular destinations. Here, you can enjoy the grandiose Baroque Garden, " +
                "visit the 200 year old Orangery with its beautiful grand halls or find inspiration for home growing among rockery plants, vegetables, " +
                "summer plants and in the systemic quarters of woody plants. The Tropical Greenhouse is home to Uppsala's only rainforest!\n" +
                "\n" +
                "The Botanical Garden hosts shows, art exhibitions and other events. Visit the gardens to learn, find inspiration and enjoy the richness of the plant kingdom.");

        TextView luciaTitle = (TextView) rootView.findViewById(R.id.textTitle);
        luciaTitle.setText(getString(R.string.botanicGarden));
        return rootView;
    }
}
