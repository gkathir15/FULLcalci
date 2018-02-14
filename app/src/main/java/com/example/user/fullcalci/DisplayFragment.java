package com.example.user.fullcalci;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayFragment extends Fragment {



    TextView display;
    String saveData;



    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
      if(savedInstanceState != null )
        {

           display.setText(savedInstanceState.getString("displayString"));
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View displayView = inflater.inflate(R.layout.fragment_display, container, false);



         display = displayView.findViewById(R.id.displayText);
       /* if(savedInstanceState != null)
        {
            if(savedInstanceState.containsKey("displayString") )

                display.setText(savedInstanceState.getString("displayString"));
           // Log.d("State",savedInstanceState.getString("displayString"));
        }*/



        // Inflate the layout for this fragment
        return displayView;



    }
        //if key type is 0, its from operator
    // if 1 its from numbers;
        //update display
        public void updateDisplay(String ans,int keyType)
        {
            if (keyType == 0)
            display.setText(ans);
            else
            display.append(ans);

            saveData= ans;


        }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("displayString",saveData);
       // Log.d("State",saveData);

    }










}
