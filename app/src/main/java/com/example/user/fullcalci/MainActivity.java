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
            public void onFragmentInteraction(String userContent,int keyType) {
                displayFragment.updateDisplay(userContent,keyType);
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

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String userContent,int type);

    }



}
