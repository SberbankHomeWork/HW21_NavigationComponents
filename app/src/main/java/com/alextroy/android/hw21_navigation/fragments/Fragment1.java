package com.alextroy.android.hw21_navigation.fragments;

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
        View v = inflater.inflate(R.layout.fragment, container, false);

        String text = getString(R.string.one);
        TextView textView = v.findViewById(R.id.text_view_fragment);
        textView.setText(text);

        Button button = v.findViewById(R.id.button_to_one_fragment);
        Button button2 = v.findViewById(R.id.button_to_another_fragment);
        Button button3 = v.findViewById(R.id.global_action_button);

        NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);

        button.setOnClickListener(v12 -> navController.navigate(R.id.fragment2));
        button2.setOnClickListener(v1 -> navController.navigate(R.id.fragment3));
        button3.setOnClickListener(v13 -> navController.navigate(R.id.fragment4));

        return v;
    }
}
