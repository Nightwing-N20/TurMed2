package com.example.turmed.navegacion.Configuracion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.turmed.R;
import com.example.turmed.TabLayout.TabViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConfiguracionFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager secondViewPager;

    public ConfiguracionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_configuracion, container, false);
        secondViewPager=(ViewPager)rootView.findViewById(R.id.viewpagerContent);
        tabLayout=(TabLayout)rootView.findViewById(R.id.tabsTL);
        tabLayout.setupWithViewPager(secondViewPager);
        setupViewPager(secondViewPager);
        return rootView;
    }

    private void setupViewPager(ViewPager viewPager) {
        TabViewPagerAdapter adapter=new TabViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new Perfil(),"Perfil");
        adapter.addFragment(new Consultorio(),"Consultorio");
        adapter.addFragment(new Horarios(),"Horarios");
        viewPager.setAdapter(adapter);
    }
}
