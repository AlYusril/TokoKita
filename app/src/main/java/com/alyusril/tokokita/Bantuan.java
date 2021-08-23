package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Bantuan extends AppCompatActivity {

//    LinearLayout expView1;
    ImageView arrow;
    CardView cv, isiCv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);

        load();
        expandableView();
    }

    public void load(){
        isiCv = findViewById(R.id.cvIsiExp1);
        arrow = findViewById(R.id.arrow1);
        cv = findViewById(R.id.cvExp1);
    }

    public void expandableView(){
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cv, new AutoTransition());
                    isiCv.setVisibility(View.VISIBLE);
                    arrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv,new AutoTransition());
                    isiCv.setVisibility(View.GONE);
                    arrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });
    }
}