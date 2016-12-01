package com.phone.textbottomnagivationview.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.phone.textbottomnagivationview.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GameFragment extends BaseFragment {

    private static GameFragment fragment;
    private TextView textView;

    public static GameFragment newInstance() {

       if(null==fragment){
           fragment = new GameFragment();
       }
        return fragment;
    }


    @Override
    public View initView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_video, null);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        textView.setText("Book");
    }
}
