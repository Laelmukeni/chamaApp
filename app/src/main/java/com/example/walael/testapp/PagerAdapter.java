package com.example.walael.testapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.walael.testapp.Contributions;
import com.example.walael.testapp.Loans;
import com.example.walael.testapp.Shares;


public class PagerAdapter extends FragmentStatePagerAdapter {

    //private  final List<Fragment> fragmentList = new ArrayList<>();
    //private  final List<String> FragmentListTitles = new ArrayList<>();

    //int mNoOfTabs;

    public PagerAdapter(FragmentManager fm) {

        super(fm);
        //this.mNoOfTabs = NumberOfTabs;
        //int NumberOfTabs)

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Contributions();
            case 1:
                return new Loans();
            case 2:
                return new Shares();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Home";
            case 1:
                return "Loans";
            case 2:
                return "Shares";
            default:
                return null;
        }
    }

    //public void AddFragment(Fragment fragment, String Title) {
        //fragmentList.add(fragment);
        //FragmentListTitles.add(Title);
    }
