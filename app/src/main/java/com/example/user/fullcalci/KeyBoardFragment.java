package com.example.user.fullcalci;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class KeyBoardFragment extends Fragment implements View.OnClickListener{

    private OnFragmentInteractionListener mListener;

    float result, op1, op2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        Button one, two, three, four, five, six, seven, eight, nine, zero, plus, sub, backspace, clear, mul, equal;



        // Inflate the layout for this fragment
        View keyboardView = inflater.inflate(R.layout.fragment_key_board, container, false);

        //return inflater.inflate(R.layout.fragment_key_board, container, false);
        //TableLayout gridKey =  keyboardView.findViewById(R.id.keyboardGrid);

        one = keyboardView.findViewById(R.id.one);
        two = keyboardView.findViewById(R.id.two);
        three = keyboardView.findViewById(R.id.three);
        four = keyboardView.findViewById(R.id.four);
        five = keyboardView.findViewById(R.id.five);
        six = keyboardView.findViewById(R.id.six);
        seven = keyboardView.findViewById(R.id.seven);
        eight = keyboardView.findViewById(R.id.eight);
        nine = keyboardView.findViewById(R.id.nine);
        zero = keyboardView.findViewById(R.id.zero);
        plus = keyboardView.findViewById(R.id.plus);
        sub = keyboardView.findViewById(R.id.Sub);
        backspace = keyboardView.findViewById(R.id.back);
        clear = keyboardView.findViewById(R.id.clear);
        mul = keyboardView.findViewById(R.id.mul);
        equal = keyboardView.findViewById(R.id.equal);




        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("equal method called","keyboard frag");
                if(mListener != null)
                mListener.onFragmentInteraction("Dummy");
            }
        });




        return keyboardView;
    }

    void  button1(int num1,int num2)
    {

    }

    //add
    float add(int num1, int num2) {
        float result = num1 + num2;

        return result;
    }
    //subtraction
    float sub(int num1, int num2) {
        float result = num1 - num2;
        return result;
    }

    //multiply
    float multiply(int num1, int num2) {
        float result = num1 * num2;
        return result;
    }

    //Division
    float division(int num1,int num2)
    {
        float result = num1/num2;
        return result;
    }

    //cleac C button
    float clear(int result)
    {
        result = 0;
        return result;
    }

    //backspace button
    String backspace(String screenData)
    {
        //Yet to define logic
        return screenData;
    }


    @Override
    public void onClick(View v) {
    }

    String setText(String txt)
    {
        return txt;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String userContent);
    }

    void setmListener(OnFragmentInteractionListener listener)
    {
        mListener = listener;
    }

}

