package com.example.paul.independenceproject;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.paul.independenceproject.R;

import java.util.Random;

import info.hoang8f.widget.FButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class HappyFaceFragment extends Fragment {

    FrameLayout happy_quote_page;

    public HappyFaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_happy_face, container, false);

        happy_quote_page = (FrameLayout)v.findViewById(R.id.happy_quote_page);

        FButton generate_quote_button = (FButton)v.findViewById(R.id.generate_quote);
        final TextView happy_quote_view = (TextView)v.findViewById(R.id.happy_quote_textview);

        //animation
        final Animation[] screenFadeIn = {AnimationUtils.loadAnimation(this.getActivity(), R.anim.fade_in)};
        happy_quote_page.startAnimation(screenFadeIn[0]);

        generate_quote_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //handle duplicates
                String[] arrayOfStrings = v.getResources().getStringArray(R.array.happy_quote_list);
                String randomString = arrayOfStrings[new Random().nextInt(arrayOfStrings.length)];
                happy_quote_view.setVisibility(TextView.VISIBLE);

                Typeface capture_it = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Capture_it.ttf");
                happy_quote_view.setTypeface(capture_it);
                happy_quote_view.setText(randomString);


            }
        });





        return v;
    }

}

