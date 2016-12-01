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
public class BookFragment extends BaseFragment {
    private TextView text;

    @Override
    public View initView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_book, null);
        text = (TextView) view.findViewById(R.id.textView);

        return view;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        text.setText("Book");
    }

    private static BookFragment fragment;
    private TextView textView;

    public static BookFragment newInstance() {
        if (null == fragment) {
            fragment = new BookFragment();
        }
        return fragment;
    }


}
