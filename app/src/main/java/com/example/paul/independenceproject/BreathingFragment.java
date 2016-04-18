package com.example.paul.independenceproject;


import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
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

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class BreathingFragment extends Fragment {

    TextView breathingTextView;
    RelativeLayout breathing_activity_layout;
    protected static final long TIME_DELAY = 1000;
    //the default update interval for your text, this is in your hand , just run this sample
    TextView mTextView;
    Handler handler=new Handler();
    int count =0;

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
        final TextView breathingTextView = (TextView)v.findViewById(R.id.inhale_breathing_tv);

        Button breathingButton = (Button)v.findViewById(R.id.breathing_gotit_button);

        final RelativeLayout popupRelativelayout = (RelativeLayout)v.findViewById(R.id.breathing_activity_rl);
        final RelativeLayout breathingRelativelayout = (RelativeLayout)v.findViewById(R.id.breathing_activity_real);

        breathingTextView.setTypeface(league_gothic);

        breathingTextView.setAnimation(shrink_size);

        Ion.with(imageView).load("android.resource://" + getActivity().getPackageName() + "/" + R.drawable.breathing_gif2);

        final TextView mTextView = (TextView)v.findViewById(R.id.timer_count);

        final Runnable updateTextRunnable=new Runnable(){
            public void run() {
                count++;
                mTextView.setText("Exercise Starting in " + count + " seconds.");
                handler.postDelayed(this, TIME_DELAY);
                if (count == 3){
                    popupRelativelayout.setVisibility(View.GONE);
                    breathingRelativelayout.setVisibility(View.VISIBLE);
                    mTextView.setVisibility(View.GONE);
                }
            }
        };


        breathingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setVisibility(View.VISIBLE);

                handler.post(updateTextRunnable);
            }
        });
//        popup with 3 second timer to start breathing exercise.
//        popupRelativelayout.setVisibility(View.GONE);
//        breathingRelativelayout.setVisibility(View.VISIBLE);

        return v;
    }



}
