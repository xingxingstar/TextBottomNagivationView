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
public class MusicFragment extends BaseFragment {

    private static MusicFragment fragment;
    private TextView textView;

    public static MusicFragment newInstance() {

        if (fragment == null) {
            fragment = new MusicFragment();
        }
        return fragment;
    }


    @Override
    public View initView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_music, null);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        textView.setText("Music");
    }
}
