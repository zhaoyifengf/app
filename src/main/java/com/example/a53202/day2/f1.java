package com.example.a53202.day2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class f1 extends Fragment {

    private String data;
    public f1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.activity_main,container,false);
        Bundle bundle = getArguments();
        data = bundle.getString("content");


        TextView tv = (TextView)view.findViewById(R.id.textView15);
        tv.setText(data);

        return view;
    }

}
