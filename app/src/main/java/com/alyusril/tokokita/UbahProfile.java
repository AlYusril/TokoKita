package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class UbahProfile extends AppCompatActivity {

    TextView tvTimeOpen, tvTimeClose;
    Button btnBack, btnPerbarui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah_profile);

        load();
        time();
    }


    public void load(){
        tvTimeOpen = findViewById(R.id.tvTimeOpen);
        tvTimeClose = findViewById(R.id.tvTimeClose);
        btnBack = findViewById(R.id.btnClosePegawai);
        btnPerbarui = findViewById(R.id.btnUbahProfile);
    }

    public void time(){
        Calendar cal = Calendar.getInstance();
        int jam = cal.get(Calendar.HOUR_OF_DAY);
        int menit = cal.get(Calendar.MINUTE);

        tvTimeOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog tpd = new TimePickerDialog(UbahProfile.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Calendar c = Calendar.getInstance();
                        c.set(Calendar.HOUR_OF_DAY, hourOfDay);
                        c.set(Calendar.MINUTE,minute);
                        c.setTimeZone(TimeZone.getDefault());
                        SimpleDateFormat format = new SimpleDateFormat("k:mm a");
                        String time = format.format(c.getTime());
                        tvTimeOpen.setText(time);
                    }
                },jam, menit, false);
                tpd.show();
            }
        });

        tvTimeClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog tpd = new TimePickerDialog(UbahProfile.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Calendar c = Calendar.getInstance();
                        c.set(Calendar.HOUR_OF_DAY, hourOfDay);
                        c.set(Calendar.MINUTE,minute);
                        c.setTimeZone(TimeZone.getDefault());
                        SimpleDateFormat format = new SimpleDateFormat("k:mm a");
                        String time = format.format(c.getTime());
                        tvTimeClose.setText(time);
                    }
                },jam, menit, false);
                tpd.show();
            }
        });
    }

    public void backEditProfile(View view) {
        onBackPressed();
        return;
    }

    public void perbaruiProfile(View view) {
        Toast.makeText(this, "Data telah diperbarui", Toast.LENGTH_SHORT).show();
    }
}