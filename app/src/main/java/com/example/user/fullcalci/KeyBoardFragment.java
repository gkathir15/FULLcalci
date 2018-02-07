package com.example.user.fullcalci;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class KeyBoardFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View keyboardView = inflater.inflate(R.layout.fragment_key_board, container, false);

        //return inflater.inflate(R.layout.fragment_key_board, container, false);
        GridView gridKey = (GridView) keyboardView.findViewById(R.id.keyboardGrid);





        gridKey.setAdapter(new ButtonAdapter(this));

        gridKey.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Log.d("Button pressed","");
            }


        });

       return keyboardView;
    }

    }

