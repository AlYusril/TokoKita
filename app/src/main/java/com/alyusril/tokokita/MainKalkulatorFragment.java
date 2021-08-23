package com.alyusril.tokokita;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class MainKalkulatorFragment extends Fragment {



    public MainKalkulatorFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main_kalkulator, container, false);

        Button btnSimpanTransaksi = (Button) rootView.findViewById(R.id.btnSimpanTransaksi);
        btnSimpanTransaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SimpanTransaksiActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

}