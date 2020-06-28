package com.example.turmed.TabLayout;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.turmed.R;

import java.util.Calendar;


public class OtraFechaFragment extends Fragment implements View.OnClickListener {
    ImageButton IFecha;
    TextView VerFecha;


/*0
   public OtraFechaFragment() {
        // Required empty public constructor
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View calendario=inflater.inflate(R.layout.fragment_otra_fecha, container, false);
        IFecha=(ImageButton)calendario.findViewById(R.id.bticalendario);
        VerFecha=(TextView)calendario.findViewById(R.id.txtcalendario);
        IFecha.setOnClickListener(this);
        return calendario;
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.bticalendario){
            obtenerfecha();
        }
    }

    private void obtenerfecha() {
        final Calendar calendario=Calendar.getInstance();
        int yy=calendario.get(Calendar.YEAR);
        int mm=calendario.get(Calendar.MONTH);
        int dd=calendario.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePicker=new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                String fecha=String.valueOf(year)+"-"+String.valueOf(monthOfYear)+"-"+String.valueOf(dayOfMonth);
                VerFecha.setText(fecha);
            }
        },yy,mm,dd);
        datePicker.show();
    }


}
