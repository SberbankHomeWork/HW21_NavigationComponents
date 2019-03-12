package com.alextroy.android.hw21_navigation.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alextroy.android.hw21_navigation.R;
import com.alextroy.android.hw21_navigation.adapter.ViewPagerAdapter;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;


public class Fragment4 extends Fragment {

    private ViewPager viewPager;

    public Fragment4() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.view_pager_fragment, container, false);

        viewPager = v.findViewById(R.id.pager);
        viewPager.setAdapter(new ViewPagerAdapter(getFragmentManager()));

        return v;
    }
}
