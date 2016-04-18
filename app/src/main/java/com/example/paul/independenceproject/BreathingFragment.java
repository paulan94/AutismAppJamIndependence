package com.example.paul.independenceproject;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class BreathingFragment extends Fragment {

    TextView breathingTextView;
    RelativeLayout breathing_activity_layout;

    public BreathingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_breathing, container, false);

        final Animation shrink_size = AnimationUtils.loadAnimation(getActivity(), R.anim.shrink_scale);
        final Animation increase_scale = AnimationUtils.loadAnimation(getActivity(), R.anim.increase_scale);

        Typeface windsong = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Windsong.ttf");
        Typeface league_gothic = Typeface.createFromAsset(getActivity().getAssets(), "fonts/league-gothic.regular.ttf");

        final ImageView imageView = (ImageView)v.findViewById(R.id.gif_iv);
        final TextView breathingTextView = (TextView)v.findViewById(R.id.inhale_breathing_tv);;
        final TextView breathingTextView2 = (TextView)v.findViewById(R.id.exhale_breathing_tv);
        Button breathingButton = (Button)v.findViewById(R.id.breathing_gotit_button);
        final RelativeLayout popupRelativelayout = (RelativeLayout)v.findViewById(R.id.breathing_activity_rl);
        final RelativeLayout breathingRelativelamyout = (RelativeLayout)v.findViewById(R.id.breathing_activity_real);

        breathingTextView.setTypeface(league_gothic);
        breathingTextView2.setTypeface(league_gothic);

        breathingTextView.setAnimation(shrink_size);
        breathingTextView2.setAnimation(increase_scale);

        Ion.with(imageView).load("android.resource://" + getActivity().getPackageName() + "/" + R.drawable.breathing_gif2);

        breathingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupRelativelayout.setVisibility(View.GONE);
                breathingRelativelamyout.setVisibility(View.VISIBLE);

            }
        });
//        popup with 3 second timer to start breathing exercise.








        return v;
    }

}
