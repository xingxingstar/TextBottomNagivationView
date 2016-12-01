package com.phone.textbottomnagivationview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.phone.textbottomnagivationview.fragment.BookFragment;
import com.phone.textbottomnagivationview.fragment.GameFragment;
import com.phone.textbottomnagivationview.fragment.HomeFragment;
import com.phone.textbottomnagivationview.fragment.MusicFragment;
import com.phone.textbottomnagivationview.fragment.TVFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {

    private BottomNavigationBar bottom_navigation_view;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom_navigation_view = (BottomNavigationBar) findViewById(R.id.bottom_navigation_view);
        bottom_navigation_view.setMode(BottomNavigationBar.MODE_FIXED);
        bottom_navigation_view.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bottom_navigation_view.addItem(new BottomNavigationItem(R.mipmap.ic_home_white_24dp, "home"))
                .addItem(new BottomNavigationItem(R.mipmap.ic_book_white_24dp, "book"))
                .addItem(new BottomNavigationItem(R.mipmap.ic_music_note_white_24dp, "music"))
                .addItem(new BottomNavigationItem(R.mipmap.ic_tv_white_24dp, "tv"))
                .addItem(new BottomNavigationItem(R.mipmap.ic_videogame_asset_white_24dp, "game"))
                .setFirstSelectedPosition(0)
                .initialise();

        fragments = getFragment();
        setDefaultFragment();
        bottom_navigation_view.setTabSelectedListener(this);

    }

    private List<Fragment> getFragment() {
        ArrayList fragments = new ArrayList();
        fragments.add(HomeFragment.newInstance());
        fragments.add(BookFragment.newInstance());
        fragments.add(MusicFragment.newInstance());
        fragments.add(GameFragment.newInstance());
        fragments.add(TVFragment.newInstance());
        return fragments;
    }

    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.layFrame, HomeFragment.newInstance());
        transaction.commit();
    }

    @Override
    public void onTabSelected(int position) {
        if (fragments != null) {
            if (position < fragments.size()) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment fragment = fragments.get(position);
                if (fragment.isAdded()) {
                    ft.replace(R.id.layFrame, fragment);
                } else {
                    ft.add(R.id.layFrame, fragment);
                }
                ft.commitAllowingStateLoss();
            }
        }
    }

    @Override
    public void onTabUnselected(int position) {
        if (fragments != null) {
            if (position < fragments.size()) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment fragment = fragments.get(position);
                ft.remove(fragment);
                ft.commitAllowingStateLoss();
            }
        }
    }

    @Override
    public void onTabReselected(int position) {

    }
}
