package com.phone.textbottomnagivationview.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.phone.textbottomnagivationview.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private static HomeFragment fragment;

    public static HomeFragment newInstance() {

        if(fragment==null){
            fragment = new HomeFragment();
        }
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TextView text = (TextView) view.findViewById(R.id.textView);
        text.setText("首页");
        return view;
    }
}
