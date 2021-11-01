package com.example.android.uppsalatourguide;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SubjectAdapter extends ArrayAdapter<Subject> {
    public SubjectAdapter(Context context, ArrayList<Subject> subjectList) {
        super(context, 0, subjectList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Subject currentSubject = getItem(position);

        TextView nameOfSubject = (TextView) listItemView.findViewById(R.id.nameOfEvent);
        nameOfSubject.setText(currentSubject.getSubject());
        nameOfSubject.setTextColor(Color.WHITE);

        ImageView subjectImage = (ImageView) listItemView.findViewById(R.id.subjectImage);
        subjectImage.setImageResource(currentSubject.getImageId());
        return listItemView;
    }
}
