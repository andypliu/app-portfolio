package com.tianyu.android.myappportfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        addClickListner((Button) rootView.findViewById(R.id.button), getString(R.string.message));
        addClickListner((Button) rootView.findViewById(R.id.button1), getString(R.string.message1));
        addClickListner((Button) rootView.findViewById(R.id.button2), getString(R.string.message2));
        addClickListner((Button) rootView.findViewById(R.id.button3), getString(R.string.message3));
        addClickListner((Button) rootView.findViewById(R.id.button4), getString(R.string.message4));
        addClickListner((Button) rootView.findViewById(R.id.button5), getString(R.string.message5));

        return rootView;
    }

    public void addClickListner(Button button, final String message) {
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
