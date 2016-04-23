package com.example.paul.independenceproject;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class EmpathyGameFragment extends Fragment {


    RelativeLayout game_view;

    public EmpathyGameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_empathy_game, container, false);

        game_view = (RelativeLayout)v.findViewById(R.id.game_relativelayout);

        final ImageView happyfaceImageView = (ImageView)v.findViewById(R.id.happy_face_iv);
        final ImageView sadfaceImageView = (ImageView)v.findViewById(R.id.sad_face_iv);
        final ImageView nervousfaceImageView = (ImageView)v.findViewById(R.id.nervous_face_iv);
        final ImageView angryfaceImageView = (ImageView)v.findViewById(R.id.angry_face_iv);
        final ImageView scaredfaceImageView = (ImageView)v.findViewById(R.id.scared_face_iv);

        TextView questionTextView = (TextView)v.findViewById(R.id.question_textview);

        Typeface league_gothic = Typeface.createFromAsset(getActivity().getAssets(), "fonts/league-gothic.regular.ttf");

        questionTextView.setTypeface(league_gothic);


        final Animation zoom_in = AnimationUtils.loadAnimation(getActivity(), R.anim.zoom_in);
        final Animation zoom_out = AnimationUtils.loadAnimation(getActivity(), R.anim.zoom_out);

        happyfaceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                happyfaceImageView.startAnimation(zoom_in);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        HappyFaceFragment happyFaceFragment = new HappyFaceFragment();
                        final FragmentTransaction ft = getFragmentManager().beginTransaction();
                        ft.replace(R.id.fragment_container, happyFaceFragment);
                        ft.addToBackStack(null);
                        ft.commit();
                    }
                }, 1000);

            }
        });

        sadfaceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sadfaceImageView.startAnimation(zoom_out);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        SadFaceFragment sadFaceFragment = new SadFaceFragment();
                        final FragmentTransaction ft = getFragmentManager().beginTransaction();
                        ft.replace(R.id.fragment_container, sadFaceFragment);
                        ft.addToBackStack(null);
                        ft.commit();
                    }
                }, 1000);
            }
        });

        scaredfaceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scaredfaceImageView.startAnimation(zoom_out);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScaredFaceFragment scaredFaceFragment = new ScaredFaceFragment();
                        final FragmentTransaction ft = getFragmentManager().beginTransaction();
                        ft.replace(R.id.fragment_container, scaredFaceFragment);
                        ft.addToBackStack(null);
                        ft.commit();
                    }
                }, 1000);
            }
        });

        angryfaceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angryfaceImageView.startAnimation(zoom_out);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AngryFaceFragment angryFaceFragment = new AngryFaceFragment();
                        final FragmentTransaction ft = getFragmentManager().beginTransaction();
                        ft.replace(R.id.fragment_container, angryFaceFragment);
                        ft.addToBackStack(null);
                        ft.commit();
                    }
                }, 1000);
            }
        });

        nervousfaceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nervousfaceImageView.startAnimation(zoom_out);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        NervousFaceFragment nervousFaceFragment = new NervousFaceFragment();
                        final FragmentTransaction ft = getFragmentManager().beginTransaction();
                        ft.replace(R.id.fragment_container, nervousFaceFragment);
                        ft.addToBackStack(null);
                        ft.commit();
                    }
                }, 1000);
            }
        });
        return v;
    }

}
