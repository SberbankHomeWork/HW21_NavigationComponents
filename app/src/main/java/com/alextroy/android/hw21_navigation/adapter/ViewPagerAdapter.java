package com.alextroy.android.hw21_navigation.adapter;


import com.alextroy.android.hw21_navigation.fragments.view_pager_fragments.Fragment1;
import com.alextroy.android.hw21_navigation.fragments.view_pager_fragments.Fragment2;
import com.alextroy.android.hw21_navigation.fragments.view_pager_fragments.Fragment3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static final int NUM_PAGES = 3;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
            default:
                return new Fragment1();
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
