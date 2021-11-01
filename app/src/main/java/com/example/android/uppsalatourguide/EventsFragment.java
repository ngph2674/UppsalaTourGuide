package com.example.android.uppsalatourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.subject_list, container, false);
        addFragment(rootView);
        return rootView;
    }

    private void addFragment(View view) {

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        CategoryAdapter adapter = new CategoryAdapter(getChildFragmentManager());
        adapter.addFragment(new MidsummerFragment(), getString(R.string.midsummerTitle));
        adapter.addFragment(new ValborgFragment(), getString(R.string.valborgTitle));
        adapter.addFragment(new LuciaFragment(), getString(R.string.stLucia));
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

}