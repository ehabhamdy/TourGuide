package com.example.tourguide.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tourguide.MyFragment;
import com.example.tourguide.R;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private String[] items;

    public ViewPagerAdapter(FragmentManager fm, String[] cities) {
        super(fm);
        items = cities;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = MyFragment.newInstance(0);
        }
        else if (position == 1)
        {
            fragment = MyFragment.newInstance(1);
        }
        else if (position == 2)
        {
            fragment = MyFragment.newInstance(2);
        }
        else if (position == 3)
        {
            fragment = MyFragment.newInstance(3);
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;

        if (position == 0)
        {
            title = items[0];
        }
        else if (position == 1)
        {
            title = items[1];
        }
        else if (position == 2)
        {
            title = items[2];
        }
        else if (position == 3)
        {
            title = items[3];
        }
        return title;
    }
}