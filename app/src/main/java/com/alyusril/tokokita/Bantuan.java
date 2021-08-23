package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Bantuan extends AppCompatActivity {

    //    LinearLayout expView1;
    ImageView arrow1, arrow2, arrow3, arrow4;
    CardView cv1, isiCv1, cv2, isiCv2, cv3, isiCv3, cv4, isiCv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);

        load();
        expandableView();
    }

    public void load(){
        isiCv1 = findViewById(R.id.cvIsiExp1);
        isiCv2 = findViewById(R.id.cvIsiExp2);
        isiCv3 = findViewById(R.id.cvIsiExp3);
        isiCv4 = findViewById(R.id.cvIsiExp4);
        arrow1 = findViewById(R.id.arrow1);
        arrow2 = findViewById(R.id.arrow2);
        arrow3 = findViewById(R.id.arrow3);
        arrow4 = findViewById(R.id.arrow4);
        cv1 = findViewById(R.id.cvExp1);
        cv2 = findViewById(R.id.cvExp2);
        cv3 = findViewById(R.id.cvExp3);
        cv4 = findViewById(R.id.cvExp4);
    }

    public void expandableView(){
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv1.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cv1, new AutoTransition());
                    isiCv1.setVisibility(View.VISIBLE);
                    arrow1.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv1,new AutoTransition());
                    isiCv1.setVisibility(View.GONE);
                    arrow1.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv2.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cv2, new AutoTransition());
                    isiCv2.setVisibility(View.VISIBLE);
                    arrow2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv2,new AutoTransition());
                    isiCv2.setVisibility(View.GONE);
                    arrow2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv3.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cv3, new AutoTransition());
                    isiCv3.setVisibility(View.VISIBLE);
                    arrow3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv3,new AutoTransition());
                    isiCv3.setVisibility(View.GONE);
                    arrow3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv4.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cv4, new AutoTransition());
                    isiCv4.setVisibility(View.VISIBLE);
                    arrow4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv4,new AutoTransition());
                    isiCv4.setVisibility(View.GONE);
                    arrow4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });
    }

    public void btnBantuanMenuJualan(View view) {
        Intent intent = new Intent(Bantuan.this, BantuanMenuJualan.class);
        startActivity (intent);
    }
}