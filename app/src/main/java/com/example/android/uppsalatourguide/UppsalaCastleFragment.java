package com.example.android.uppsalatourguide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class UppsalaCastleFragment extends Fragment {

    public UppsalaCastleFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_eventchild, container, false);

        ImageView luciaPic = (ImageView) rootView.findViewById(R.id.childImage);
        luciaPic.setImageResource(R.drawable.uppsalacastle);

        TextView luciaText = (TextView) rootView.findViewById(R.id.textChild);
        luciaText.setText("Building started on Uppsala Slott (Uppsala Castle) in 1549 during the reign of Swedish King Gustav Vasa who intended it as a fortress. " +
                "Look up from almost any location in Uppsala and you’ll see it on the skyline at Kasåsen.\n" +
                "\n" +
                "The castle is the location of several major events in the history of Uppsala and Sweden; for example ‘the Sture Murders’ in 1567 when several " +
                "noblemen were butchered at the behest of deranged King Erik XIV who had accused them of treason (their clothes are displayed at Uppsala Cathedral). " +
                "Like many mid-1500s castles in Sweden, bloodbaths, conflict and political plotting were par for the course.");

        TextView luciaTitle = (TextView) rootView.findViewById(R.id.textTitle);
        luciaTitle.setText(getString(R.string.castleUppsala));

        return rootView;
    }
}
