package com.example.paul.independenceproject;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class OptionsFragment extends Fragment {

    FrameLayout fragment_options_framelayout;

    public OptionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_options, container, false);
        fragment_options_framelayout = (FrameLayout)v.findViewById(R.id.fragment_options_framelayout);

        //animation
        final Animation screenFadeIn = AnimationUtils.loadAnimation(this.getActivity(), R.anim.fade_in);
        fragment_options_framelayout.startAnimation(screenFadeIn);

        TextView tx = (TextView)v.findViewById(R.id.choose_options_top);
        Typeface windsong = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Windsong.ttf");
        tx.setTypeface(windsong);


        Button journalButton = (Button)v.findViewById(R.id.journal_button);
        Button defaultButton = (Button)v.findViewById(R.id.default_button);
        Button empathyButton = (Button)v.findViewById(R.id.empathy_button);

        //journal button stuff
//        journalButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//
//                //meditation fragment
//                CameraFragment cameraFragment = new CameraFragment();
//                final FragmentTransaction ft = getFragmentManager().beginTransaction();
//                ft.replace(R.id.fragment_container, cameraFragment);
//                ft.addToBackStack(null);
//                ft.commit();
//
//            }
//        });

        //open up default screen
//        defaultButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//
//                //meditation fragment
//                QuotesMainFragment quotesMainFragment = new QuotesMainFragment();
//                final FragmentTransaction ft = getFragmentManager().beginTransaction();
//                ft.replace(R.id.fragment_container, quotesMainFragment);
//                ft.addToBackStack(null);
//                ft.commit();
//
//            }
//        });

        //empathy game button stuff
        empathyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //meditation fragment
                EmpathyGameFragment empathyGameFragment= new EmpathyGameFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, empathyGameFragment);
                ft.addToBackStack(null);
                ft.commit();

            }
        });


        Typeface amatic = Typeface.createFromAsset(getActivity().getAssets(), "fonts/AmaticSC-Regular.ttf");


        journalButton.setTypeface(amatic);
        defaultButton.setTypeface(amatic);
        empathyButton.setTypeface(amatic);

        return v;
    }

}
