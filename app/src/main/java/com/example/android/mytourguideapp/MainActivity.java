package com.example.android.mytourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link to find the ViewPage with id (view_pager_one).
        ViewPager myViewPager = (ViewPager) findViewById(R.id.view_pager_one);

        // Create an adapter that knows which fragment should be shown on each page
        MyFragmentAdapter adapter = new MyFragmentAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        myViewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout myTabLayout = (TabLayout) findViewById(R.id.tabs_one);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        myTabLayout.setupWithViewPager(myViewPager);
    }
}
