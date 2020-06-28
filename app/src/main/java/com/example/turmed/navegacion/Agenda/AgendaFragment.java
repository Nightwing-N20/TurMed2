package com.example.turmed.navegacion.Agenda;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.turmed.R;
import com.example.turmed.TabLayout.HoyFragment;
import com.example.turmed.TabLayout.MananaFragment;
import com.example.turmed.TabLayout.OtraFechaFragment;
import com.example.turmed.TabLayout.TabViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class AgendaFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager firstViewPager;

    public AgendaFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_agenda, container, false);
        firstViewPager=(ViewPager)rootView.findViewById(R.id.viewpager_content);
        tabLayout=(TabLayout)rootView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(firstViewPager);
        setupViewPager(firstViewPager);
        return rootView;
    }

    private void setupViewPager(ViewPager viewPager) {
        TabViewPagerAdapter adapter=new TabViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new HoyFragment(),"Hoy");
        adapter.addFragment(new MananaFragment(),"Mañana");
        adapter.addFragment(new OtraFechaFragment(),"Otra Fecha");
        viewPager.setAdapter(adapter);
    }
}
