package com.example.turmed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.accounts.Account;
import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TableLayout;

import com.example.turmed.R;
import com.example.turmed.navegacion.Agenda.AgendaFragment;
import com.example.turmed.navegacion.BottomNavPagerAdapter;
import com.example.turmed.navegacion.Configuracion.ConfiguracionFragment;
import com.example.turmed.navegacion.Pacientes.PacientesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener;

//import Controlador.PagerController;

public class Inicio extends AppCompatActivity {
    BottomNavigationView mbottomNavigation;
    private ViewPager mviewPager;
    private static FragmentManager sFragmentManager;
    //private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        //bottomNavigation
        mbottomNavigation=(BottomNavigationView)findViewById(R.id.bottom_navigation);
        mbottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        //aqui se especifica donde es que se quiere que inicie el bottom
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new AgendaFragment()).commit();
        //ViewPager
        mviewPager=(ViewPager)findViewById(R.id.viewpager);
        setupViewPager(mviewPager);
        //
        final BottomNavigationView navigation=(BottomNavigationView)findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        mviewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        navigation.setSelectedItemId(R.id.nav_agenda);
                        break;
                    case 1:
                        navigation.setSelectedItemId(R.id.nav_pacientes);
                        break;
                    case 2:
                        navigation.setSelectedItemId(R.id.nav_configuracion);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.nav_agenda:
                    mviewPager.setCurrentItem(0);
                    sFragmentManager=getSupportFragmentManager();
                    if (findViewById(R.id.fragment_container)!=null){
                        FragmentTransaction fragmentTransaction=
                                sFragmentManager.beginTransaction();
                        AgendaFragment agenda=new AgendaFragment();
                        fragmentTransaction.replace(R.id.fragment_container,agenda,null);
                        fragmentTransaction.commit();
                    }
                    return true;
                case R.id.nav_pacientes:
                    mviewPager.setCurrentItem(1);
                    sFragmentManager=getSupportFragmentManager();
                    if (findViewById(R.id.fragment_container)!=null) {
                        FragmentTransaction fragmentTransaction =
                                sFragmentManager.beginTransaction();
                        PacientesFragment pacientes = new PacientesFragment();
                        fragmentTransaction.replace(R.id.fragment_container, pacientes, null);
                        fragmentTransaction.commit();
                    }
                        return true;
                case R.id.nav_configuracion:
                    mviewPager.setCurrentItem(2);
                    sFragmentManager=getSupportFragmentManager();
                    if (findViewById(R.id.fragment_container)!=null){
                        FragmentTransaction fragmentTransaction=
                                sFragmentManager.beginTransaction();
                        ConfiguracionFragment configuracion=new ConfiguracionFragment();
                        fragmentTransaction.replace(R.id.fragment_container,configuracion,null);
                        fragmentTransaction.commit();
                    }
                    return true;
            }
            return false;
        }
    };

    private void setupViewPager(ViewPager mviewPager) {
        BottomNavPagerAdapter adapter=new BottomNavPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new AgendaFragment());
        adapter.addFragment(new PacientesFragment());
        adapter.addFragment(new ConfiguracionFragment());
        mviewPager.setAdapter(adapter);
    }
}

