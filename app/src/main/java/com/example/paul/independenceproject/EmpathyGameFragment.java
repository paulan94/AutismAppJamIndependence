package com.example.paul.independenceproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;


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
//        Button gotitButton = (Button)v.findViewById(R.id.gotit_button);

        ImageView happyfaceImageView = (ImageView)v.findViewById(R.id.happy_face_iv);
        ImageView sadfaceImageView = (ImageView)v.findViewById(R.id.sad_face_iv);
        ImageView nervousfaceImageView = (ImageView)v.findViewById(R.id.nervous_face_iv);
        ImageView angryfaceImageView = (ImageView)v.findViewById(R.id.angry_face_iv);
        ImageView scaredfaceImageView = (ImageView)v.findViewById(R.id.scared_face_iv);

//        gotitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                popup_text_view.setVisibility(View.GONE);
//                game_view.setVisibility(View.VISIBLE);
//            }
//        });

        happyfaceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HappyFaceFragment happyFaceFragment = new HappyFaceFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, happyFaceFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        sadfaceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SadFaceFragment sadFaceFragment = new SadFaceFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, sadFaceFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        scaredfaceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScaredFaceFragment scaredFaceFragment = new ScaredFaceFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, scaredFaceFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        angryfaceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AngryFaceFragment angryFaceFragment = new AngryFaceFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, angryFaceFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        nervousfaceImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NervousFaceFragment nervousFaceFragment = new NervousFaceFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, nervousFaceFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return v;
    }

}
