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

        addClickListner((Button) rootView.findViewById(R.id.button_app1), getString(R.string.message_app1));
        addClickListner((Button) rootView.findViewById(R.id.button_app2), getString(R.string.message_app2));
        addClickListner((Button) rootView.findViewById(R.id.button_app3), getString(R.string.message_app3));
        addClickListner((Button) rootView.findViewById(R.id.button_app4), getString(R.string.message_app4));
        addClickListner((Button) rootView.findViewById(R.id.button_app5), getString(R.string.message_app5));
        addClickListner((Button) rootView.findViewById(R.id.button_myapp), getString(R.string.message_myapp));

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
