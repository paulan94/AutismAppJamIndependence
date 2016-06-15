package com.clarity.paul.clarityproj;


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
import android.widget.RelativeLayout;
import android.widget.TextView;


public class OptionsFragment extends Fragment {

    RelativeLayout popup_text_view;
    RelativeLayout options_screen;
    FrameLayout fragment_options_framelayout;

    public OptionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_options, container, false);
        popup_text_view = (RelativeLayout)v.findViewById(R.id.popup_text_view);
        final Button gotitButton = (Button)v.findViewById(R.id.gotit_button);

        options_screen = (RelativeLayout)v.findViewById(R.id.options_screen);
        fragment_options_framelayout = (FrameLayout)v.findViewById(R.id.fragment_options_framelayout);


        //animation
        final Animation screenFadeIn = AnimationUtils.loadAnimation(this.getActivity(), R.anim.fade_in);
        fragment_options_framelayout.startAnimation(screenFadeIn);

        TextView tx = (TextView)v.findViewById(R.id.choose_options_top);
        Typeface windsong = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Windsong.ttf");
        tx.setTypeface(windsong);


        Button breathingButton = (Button)v.findViewById(R.id.breathing_button);
        Button quoteLibraryButton = (Button)v.findViewById(R.id.quote_library_button);
        Button empathyButton = (Button)v.findViewById(R.id.empathy_button);

        //breathing button stuff
        breathingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //meditation fragment
                BreathingFragment breathingFragment = new BreathingFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, breathingFragment);
                ft.addToBackStack(null);
                ft.commit();

            }
        });


        quoteLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuoteListFragment quoteListFragment = new QuoteListFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, quoteListFragment);
                ft.addToBackStack(null);
                ft.commit();

            }
        });

        //empathy game button stuff
        empathyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                options_screen.setVisibility(View.GONE);
                popup_text_view.setVisibility(View.VISIBLE);
                gotitButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EmpathyGameFragment empathyGameFragment= new EmpathyGameFragment();
                        final FragmentTransaction ft = getFragmentManager().beginTransaction();
                        ft.replace(R.id.fragment_container, empathyGameFragment);
                        ft.addToBackStack(null);
                        ft.commit();
                    }
                });
            }
        });


        Typeface amatic = Typeface.createFromAsset(getActivity().getAssets(), "fonts/AmaticSC-Regular.ttf");


        breathingButton.setTypeface(amatic);
        quoteLibraryButton.setTypeface(amatic);
        empathyButton.setTypeface(amatic);

        return v;
    }

}
