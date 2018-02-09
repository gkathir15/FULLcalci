package com.example.user.fullcalci;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DisplayFragment displayFragment;
    KeyBoardFragment keyFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For displaying Display strip
        displayFragment = new DisplayFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.first,displayFragment)
                .commit();

        //Displaying calculator keyboard
        keyFragment = new KeyBoardFragment();
        keyFragment.setmListener(new KeyBoardFragment.OnFragmentInteractionListener() {
            @Override
            public void onFragmentInteraction(String userContent) {
                displayFragment.updateDisplay(userContent);
            }
        });

        //android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.second,keyFragment)
                .commit();
      //  sendDisplayData("main");
    }

   /* public void sendDisplayData(String ans)
    {
         d = (DisplayFragment) getSupportFragmentManager().findFragmentById(R.id.displayText);
        d.updateDisplay(ans);
    }*/




}
