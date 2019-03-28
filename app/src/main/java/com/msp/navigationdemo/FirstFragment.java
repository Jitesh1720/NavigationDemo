package com.msp.navigationdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Button btnNext = view.findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavOptions navOptions = new NavOptions.Builder()
                        .setPopUpTo(R.id.flow_first_frag, true)
                        .build();

                //Navigation.findNavController(getActivity(), R.id.my_nav_host_fragment).navigate(R.id.action_flow_first_frag_to_flow_second_frag, null, navOptions);
                Navigation.findNavController(view).navigate(R.id.action_flow_first_frag_to_flow_second_frag);

            }
        });

//        btnNext.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_flow_first_frag_to_flow_second_frag, null));

        return view;
    }

}
