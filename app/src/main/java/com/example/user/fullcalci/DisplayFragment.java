package com.example.user.fullcalci;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayFragment extends Fragment {



    TextView display;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View displayView = inflater.inflate(R.layout.fragment_display, container, false);

         display = displayView.findViewById(R.id.displayText);





        // Inflate the layout for this fragment
        return displayView;

    }

        //update display
        public void updateDisplay(String ans)
        {
            Log.d("Update display","display frag");
            display.setText(ans);
        }


}
