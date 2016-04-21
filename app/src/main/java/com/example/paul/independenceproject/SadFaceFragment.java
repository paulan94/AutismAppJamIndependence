package com.example.paul.independenceproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.paul.independenceproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SadFaceFragment extends Fragment {


    public SadFaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_sad_face, container, false);
        return v;
    }

}
