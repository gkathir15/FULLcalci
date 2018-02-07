package com.example.user.fullcalci;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayFragment displayFragment = new DisplayFragment();
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.rootLayout,displayFragment)
                .commit();

    }
}
