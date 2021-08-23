package com.alyusril.tokokita;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class BantuanMenuJualan extends AppCompatActivity {
    ImageView arrow1, arrow2, arrow3, arrow4, arrow5, arrow6, arrow7, arrow8, arrow9, arrow10, arrow11, arrow12;
    CardView cv1, isiCv1, cv2, isiCv2, cv3, isiCv3, cv4, isiCv4, cv5, isiCv5, cv6, isiCv6, cv7, isiCv7, cv8, isiCv8, cv9, isiCv9, cv10, isiCv10, cv11, isiCv11, cv12, isiCv12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan_menu_jualan);

        load();
        expandableView();
    }

    public void load() {
        isiCv1 = findViewById(R.id.cvIsiExp1);
        isiCv2 = findViewById(R.id.cvIsiExp2);
        isiCv3 = findViewById(R.id.cvIsiExp3);
        isiCv4 = findViewById(R.id.cvIsiExp4);
        isiCv5 = findViewById(R.id.cvIsiExp5);
        isiCv6 = findViewById(R.id.cvIsiExp6);
        isiCv7 = findViewById(R.id.cvIsiExp7);
        isiCv8 = findViewById(R.id.cvIsiExp8);
        isiCv9 = findViewById(R.id.cvIsiExp9);
        isiCv10 = findViewById(R.id.cvIsiExp10);
        isiCv11 = findViewById(R.id.cvIsiExp11);
        isiCv12 = findViewById(R.id.cvIsiExp12);
        arrow1 = findViewById(R.id.arrow1);
        arrow2 = findViewById(R.id.arrow2);
        arrow3 = findViewById(R.id.arrow3);
        arrow4 = findViewById(R.id.arrow4);
        arrow5 = findViewById(R.id.arrow5);
        arrow6 = findViewById(R.id.arrow6);
        arrow7 = findViewById(R.id.arrow7);
        arrow8 = findViewById(R.id.arrow8);
        arrow9 = findViewById(R.id.arrow9);
        arrow10 = findViewById(R.id.arrow10);
        arrow11 = findViewById(R.id.arrow11);
        arrow12 = findViewById(R.id.arrow12);
        cv1 = findViewById(R.id.cvExp1);
        cv2 = findViewById(R.id.cvExp2);
        cv3 = findViewById(R.id.cvExp3);
        cv4 = findViewById(R.id.cvExp4);
        cv5 = findViewById(R.id.cvExp5);
        cv6 = findViewById(R.id.cvExp6);
        cv7 = findViewById(R.id.cvExp7);
        cv8 = findViewById(R.id.cvExp8);
        cv9 = findViewById(R.id.cvExp9);
        cv10 = findViewById(R.id.cvExp10);
        cv11 = findViewById(R.id.cvExp11);
        cv12 = findViewById(R.id.cvExp12);
    }

    public void expandableView() {
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv1.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv1, new AutoTransition());
                    isiCv1.setVisibility(View.VISIBLE);
                    arrow1.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv1, new AutoTransition());
                    isiCv1.setVisibility(View.GONE);
                    arrow1.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv2.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv2, new AutoTransition());
                    isiCv2.setVisibility(View.VISIBLE);
                    arrow2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv2, new AutoTransition());
                    isiCv2.setVisibility(View.GONE);
                    arrow2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv3.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv3, new AutoTransition());
                    isiCv3.setVisibility(View.VISIBLE);
                    arrow3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv3, new AutoTransition());
                    isiCv3.setVisibility(View.GONE);
                    arrow3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv4.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv4, new AutoTransition());
                    isiCv4.setVisibility(View.VISIBLE);
                    arrow4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv4, new AutoTransition());
                    isiCv4.setVisibility(View.GONE);
                    arrow4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv5.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv5, new AutoTransition());
                    isiCv5.setVisibility(View.VISIBLE);
                    arrow5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv5, new AutoTransition());
                    isiCv5.setVisibility(View.GONE);
                    arrow5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv6.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv6, new AutoTransition());
                    isiCv6.setVisibility(View.VISIBLE);
                    arrow6.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv6, new AutoTransition());
                    isiCv6.setVisibility(View.GONE);
                    arrow6.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv7.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv7, new AutoTransition());
                    isiCv7.setVisibility(View.VISIBLE);
                    arrow7.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv7, new AutoTransition());
                    isiCv7.setVisibility(View.GONE);
                    arrow7.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv8.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv8, new AutoTransition());
                    isiCv8.setVisibility(View.VISIBLE);
                    arrow8.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv8, new AutoTransition());
                    isiCv8.setVisibility(View.GONE);
                    arrow8.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv9.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv9, new AutoTransition());
                    isiCv9.setVisibility(View.VISIBLE);
                    arrow9.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv2, new AutoTransition());
                    isiCv9.setVisibility(View.GONE);
                    arrow9.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv10.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv10, new AutoTransition());
                    isiCv10.setVisibility(View.VISIBLE);
                    arrow10.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv11, new AutoTransition());
                    isiCv10.setVisibility(View.GONE);
                    arrow10.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv11.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv11, new AutoTransition());
                    isiCv11.setVisibility(View.VISIBLE);
                    arrow11.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv11, new AutoTransition());
                    isiCv11.setVisibility(View.GONE);
                    arrow11.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });

        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiCv12.getVisibility() == View.GONE) {
                    TransitionManager.beginDelayedTransition(cv12, new AutoTransition());
                    isiCv12.setVisibility(View.VISIBLE);
                    arrow12.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                } else {
                    TransitionManager.beginDelayedTransition(cv12, new AutoTransition());
                    isiCv12.setVisibility(View.GONE);
                    arrow12.setImageResource(R.drawable.ic_baseline_keyboard_arrow_right_24);
                }
            }
        });
    }
}
