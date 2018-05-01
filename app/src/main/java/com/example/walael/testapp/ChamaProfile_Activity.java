package com.example.walael.testapp;

import android.net.Uri;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class ChamaProfile_Activity extends AppCompatActivity{

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chama_profile_);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        appBarLayout = (AppBarLayout) findViewById(R.id.AppBarLay);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        //setupViewPager(viewPager);

        //get second intent, from HomeActivity to ChamaProfile
        TextView displayText = (TextView) findViewById(R.id.displayText);
        String display1 = getIntent().getStringExtra("Child_info");
        displayText.setText(display1);

        //AppBar and CollapsingToolBar
        final Toolbar toolbar = (Toolbar) findViewById(R.id.ToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapse = (CollapsingToolbarLayout) findViewById(R.id.CollapsingToolBarLay);
        collapse.setTitle("Chama Profie");

        //PagerAdapter, ViewPager and tabs/fragments

        //Adding fragments/tabs

        //tabLayout.addTab(tabLayout.newTab().setText("Contributions"));
        //tabLayout.addTab(tabLayout.newTab().setText("Loans"));
        //tabLayout.addTab(tabLayout.newTab().setText("Shares"));

    }

    //private PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());

    private void setupViewPager(ViewPager viewPager) {
    final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
    //adapter.AddFragment(new Contributions(), "Contributions");
    //adapter.AddFragment(new Loans(), "Loans");
    //adapter.AddFragment(new Shares(), "Shares");

    //adapter setup
    viewPager.setAdapter(adapter);
    //setupViewPager(viewPager);
    tabLayout.setupWithViewPager(viewPager);
    }
}
