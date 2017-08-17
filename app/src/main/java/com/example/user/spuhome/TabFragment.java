package com.example.user.spuhome;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ogaclejapan.smarttablayout.SmartTabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment extends Fragment {
    private SmartTabLayout tabLayout;
    private ViewPager viewPager;


    public TabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup TabView = (ViewGroup) inflater.inflate(R.layout.fragment_tab, container, false);
        tabLayout = (SmartTabLayout) TabView.findViewById(R.id.tab);
        viewPager = (ViewPager) TabView.findViewById(R.id.pager);

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getFragmentManager()) {



            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new FacultyFragment();
                    case 1:
                        return new OfficeFragment();
                    default:
                        return null;
                }
            }
            @Override
            public int getCount() {
                return 2;
            }
            @Override
            public CharSequence getPageTitle (int position){
                String title = null;
                if (position == 0) {
                    title = "คณะ";
                } else if (position == 1) {
                    title = "สำนักงาน";
                }
                return title;
            }
        };
        viewPager.setAdapter(adapter);
        tabLayout.setViewPager(viewPager);

        // Inflate the layout for this fragment
        return TabView;
    }

}
