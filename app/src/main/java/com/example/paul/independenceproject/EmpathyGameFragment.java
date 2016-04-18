package com.example.paul.independenceproject;

import android.hardware.Camera;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;


public class EmpathyGameFragment extends Fragment {


    RelativeLayout popup_text_view;
    RelativeLayout game_view;

    public EmpathyGameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_empathy_game, container, false);
        popup_text_view = (RelativeLayout)v.findViewById(R.id.popup_text_view);
        game_view = (RelativeLayout)v.findViewById(R.id.game_relativelayout);
        Button gotitButton = (Button)v.findViewById(R.id.gotit_button);

        gotitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup_text_view.setVisibility(View.GONE);
                game_view.setVisibility(View.VISIBLE);
            }
        });
        return v;
    }

}
