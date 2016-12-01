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
public class TVFragment extends BaseFragment {

    private static TVFragment fragment;
    private TextView textView;

    public static TVFragment newInstance() {

        if (fragment == null) {
            fragment = new TVFragment();
        }
        return fragment;
    }

    @Override
    public View initView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_tv, null);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        textView.setText("TV");
    }

}
