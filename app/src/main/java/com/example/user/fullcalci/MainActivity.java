package com.example.user.fullcalci;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    DisplayFragment displayFragment;
    KeyBoardFragment keyFragment;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(savedInstanceState != null)
        {
            displayFragment = (DisplayFragment) getSupportFragmentManager().getFragment(savedInstanceState, "displayFragment");
        }
        else {
            //For displaying Display strip
            displayFragment = new DisplayFragment();
        }
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.first,displayFragment)
                .commit();

        if(savedInstanceState != null)
        {
            keyFragment = (KeyBoardFragment) getSupportFragmentManager().getFragment(savedInstanceState, "keyBoardFragment");
        }
        else {
            //Displaying calculator keyboard
            keyFragment = new KeyBoardFragment();
        }
        keyFragment.setmListener(new KeyBoardFragment.OnFragmentInteractionListener() {
            @Override
            public void onFragmentInteraction(String userContent,int keyType) {
                displayFragment.updateDisplay(userContent,keyType);
            }
        });

        //android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.second,keyFragment)
                .commit();
      //  sendDisplayData("main");
        if (savedInstanceState != null) {
            //Restore the fragment's instance
            displayFragment = (DisplayFragment) getSupportFragmentManager().getFragment(savedInstanceState, "displayFragment");

        }
    }



    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String userContent,int type);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //Save the fragment's instance
        getSupportFragmentManager().putFragment(outState, "displayFragment", displayFragment);
        getSupportFragmentManager().putFragment(outState, "keyBoardFragment", keyFragment);
    }





}
