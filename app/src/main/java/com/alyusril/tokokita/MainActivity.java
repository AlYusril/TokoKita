package com.alyusril.tokokita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnOwner, btnPartner;
    private Button btnLoginOwner;
    private Button btn_pin;
    private CardView cvLaporan;
    private Object intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new LoginOwner());
        ft.commit();

        load();
    }

    public void load(){
        btnOwner = findViewById(R.id.btnOwner);
        btnPartner = findViewById(R.id.btnPartner);
        btn_pin = findViewById(R.id.btn_Pin);


    }

    public void owner(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new LoginOwner());
        ft.commit();
    }

    public void partner(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new LoginPartner());
        ft.commit();
    }

    public void loginOwner(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void btn_pin(View view) {
        Intent intent = new Intent(MainActivity.this, LupaPin.class);
        startActivity (intent);
    }


    public void tvRegister(View view) {
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity (intent);
    }


}