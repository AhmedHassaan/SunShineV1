package com.example.lenovo.sunshinev1.Details;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.sunshinev1.R;

/**
 * Created by Lenovo on 10/9/2016.
 */


public class PlaceholderFragment extends Fragment {

    TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        text = (TextView)rootView.findViewById(R.id.test);
        Intent intent = getActivity().getIntent();
        if(intent != null && intent.hasExtra(Intent.EXTRA_TEXT)){
            String str = intent.getStringExtra(Intent.EXTRA_TEXT);
            text.setText(str);
        }
        return rootView;
    }
}