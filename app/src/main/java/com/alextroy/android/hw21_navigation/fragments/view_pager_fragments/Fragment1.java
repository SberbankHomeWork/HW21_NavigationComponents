package com.alextroy.android.hw21_navigation.fragments.view_pager_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.alextroy.android.hw21_navigation.R;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, container, false);

        String text = getString(R.string.view_pager_one);
        TextView textView = v.findViewById(R.id.text_view_fragment);
        textView.setText(text);

        return v;
    }
}
