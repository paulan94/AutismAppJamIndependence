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
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        Button button1 = (Button)  v.findViewById(R.id.start_button);
        TextView tx = (TextView) v.findViewById(R.id.app_title_textview);
        ImageView iv = (ImageView)v.findViewById(R.id.logo_imageview);



        Typeface amatic = Typeface.createFromAsset(getActivity().getAssets(), "fonts/AmaticSC-Regular.ttf");
        Typeface league_gothic = Typeface.createFromAsset(getActivity().getAssets(), "fonts/league-gothic.regular.ttf");

        tx.setTypeface(league_gothic);
        button1.setTypeface(amatic);

        //animations
        final Animation translateAnim = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_translate);
        final Animation screenFadeIn = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in_start);

        //screenAnimation fade in
        iv.startAnimation(screenFadeIn);

        button1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                v.startAnimation(translateAnim);


                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        OptionsFragment optionsFragment = new OptionsFragment();
                        final FragmentTransaction ft = getFragmentManager().beginTransaction();
                        ft.replace(R.id.fragment_container, optionsFragment);
                        ft.addToBackStack(null);
                        ft.commit();
                    }
                }, 500);
            }


        });

        return v;
    }

}
