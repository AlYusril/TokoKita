package com.alyusril.tokokita;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BantuanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BantuanFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BantuanFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BantuanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BantuanFragment newInstance(String param1, String param2) {
        BantuanFragment fragment = new BantuanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bantuan, container, false);

        //Expandable View
        CardView cv1 = (CardView) rootView.findViewById(R.id.cvExpAkun1);
        CardView cv2 = (CardView) rootView.findViewById(R.id.cvExp2);
        CardView cv3 = (CardView) rootView.findViewById(R.id.cvExp3);
        CardView cv4 = (CardView) rootView.findViewById(R.id.cvExp4);

        ImageView iv1 = (ImageView) rootView.findViewById(R.id.arrowAkun);
        ImageView iv2 = (ImageView) rootView.findViewById(R.id.arrow2);
        ImageView iv3 = (ImageView) rootView.findViewById(R.id.arrow3);
        ImageView iv4 = (ImageView) rootView.findViewById(R.id.arrow4);

        CardView cvIsi1 = (CardView) rootView.findViewById(R.id.cvIsiAkun1);
        CardView cvIsi2 = (CardView) rootView.findViewById(R.id.cvIsiExp2);
        CardView cvIsi3 = (CardView) rootView.findViewById(R.id.cvIsiExp3);
        CardView cvIsi4 = (CardView) rootView.findViewById(R.id.cvIsiExp4);

        //On Click CV
        CardView cvAkun = (CardView) rootView.findViewById(R.id.cvBantuanAkun);

        LinearLayout liL1 = (LinearLayout) rootView.findViewById(R.id.btnBantuanMenuJualan);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cvIsi1.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cv1, new AutoTransition());
                    cvIsi1.setVisibility(View.VISIBLE);
                    iv1.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv1,new AutoTransition());
                    cvIsi1.setVisibility(View.GONE);
                    iv1.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cvIsi2.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cv2, new AutoTransition());
                    cvIsi2.setVisibility(View.VISIBLE);
                    iv2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv2,new AutoTransition());
                    cvIsi2.setVisibility(View.GONE);
                    iv2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cvIsi3.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cv3, new AutoTransition());
                    cvIsi3.setVisibility(View.VISIBLE);
                    iv3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv3,new AutoTransition());
                    cvIsi3.setVisibility(View.GONE);
                    iv3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cvIsi4.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cv4, new AutoTransition());
                    cvIsi4.setVisibility(View.VISIBLE);
                    iv4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv4,new AutoTransition());
                    cvIsi4.setVisibility(View.GONE);
                    iv4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });


        liL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BantuanMenuJualan.class);
                startActivity(intent);
            }
        });

        cvAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BantuanAkunToko.class);
                startActivity(intent);
            }
        });

        return rootView;

    }

    }

