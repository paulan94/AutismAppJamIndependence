package com.clarity.paul.clarityproj;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuoteListFragment extends Fragment {


    public QuoteListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_quote_list, container, false);

        TextView tx = (TextView)v.findViewById(R.id.quote_library_title);
        Typeface windsong = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Windsong.ttf");
        tx.setTypeface(windsong);

        Typeface amatic = Typeface.createFromAsset(getActivity().getAssets(), "fonts/AmaticSC-Regular.ttf");

        Button happyButton = (Button)v.findViewById(R.id.happy_quote_list);
        Button scaredButton = (Button)v.findViewById(R.id.scared_quote_list);
        Button angryButton = (Button)v.findViewById(R.id.angry_quote_list);
        Button nervousButton = (Button)v.findViewById(R.id.nervous_quote_list);
        Button sadButton = (Button)v.findViewById(R.id.sad_quote_list);

        happyButton.setTypeface(amatic);
        scaredButton.setTypeface(amatic);
        angryButton.setTypeface(amatic);
        nervousButton.setTypeface(amatic);
        sadButton.setTypeface(amatic);

        happyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                new fragment here
                QuoteListScreenFragment quoteListScreenFragment = new QuoteListScreenFragment();
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, quoteListScreenFragment);
                ft.addToBackStack(null);
                ft.commit();

            }
        });

        return v;
    }

}
