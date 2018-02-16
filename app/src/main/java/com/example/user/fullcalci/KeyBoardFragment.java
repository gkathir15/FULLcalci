package com.example.user.fullcalci;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;


public class KeyBoardFragment extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener mListener;


    long result = 0, op1 = 0, op2 = 0;
    boolean isOperandSelected = false;
    String value1 = new String();
    String value2 = new String();
    String operator = new String();
    boolean isCalculated = false;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View keyboardView = inflater.inflate(R.layout.fragment_key_board, container, false);

        //return inflater.inflate(R.layout.fragment_key_board, container, false);
        //TableLayout gridKey =  keyboardView.findViewById(R.id.keyboardGrid);

        Button one = keyboardView.findViewById(R.id.one);
        Button two = keyboardView.findViewById(R.id.two);
        Button three = keyboardView.findViewById(R.id.three);
        Button four = keyboardView.findViewById(R.id.four);
        Button five = keyboardView.findViewById(R.id.five);
        Button six = keyboardView.findViewById(R.id.six);
        Button seven = keyboardView.findViewById(R.id.seven);
        Button eight = keyboardView.findViewById(R.id.eight);
        Button nine = keyboardView.findViewById(R.id.nine);
        Button zero = keyboardView.findViewById(R.id.zero);
        Button plus = keyboardView.findViewById(R.id.plus);
        Button sub = keyboardView.findViewById(R.id.Sub);
        Button backspace = keyboardView.findViewById(R.id.back);
        Button clear = keyboardView.findViewById(R.id.clear);
        Button mul = keyboardView.findViewById(R.id.mul);
        Button equal = keyboardView.findViewById(R.id.equal);
        Button div = keyboardView.findViewById(R.id.div);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        plus.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        backspace.setOnClickListener(this);
        equal.setOnClickListener(this);
        clear.setOnClickListener(this);
        equal.setOnClickListener(this);
        div.setOnClickListener(this);


        return keyboardView;
    }


    void buttonN(int number) {
        if (isCalculated == false) {

            if (isOperandSelected == false) {
                mListener.onFragmentInteraction(String.valueOf(number), 1);
                value1 = value1 + String.valueOf(number);


            } else {
                value2 = value2 + String.valueOf(number);
                mListener.onFragmentInteraction(String.valueOf(number), 1);
            }
        } else {

            if (isOperandSelected == false) {
                if (result != 0) {

                    mListener.onFragmentInteraction(String.valueOf(number), 1);
                    value1 = value1 + String.valueOf(number);


                } else {
                    mListener.onFragmentInteraction(String.valueOf(number), 0);
                    value1 = "";
                    value1 = value1 + String.valueOf(number);
                }


            } else {
                value2 = value2 + String.valueOf(number);
                mListener.onFragmentInteraction(String.valueOf(number), 0);
            }


        }
    }


    void equalTo() {
        if (isOperandSelected == false)
            mListener.onFragmentInteraction(value1, 0);
        else {
            if (value1 != "0")
                mListener.onFragmentInteraction(String.valueOf(op1), 0);
            switch (operator) {
                case "+": {
                    add();
                    break;
                }
                case "-": {
                    sub();
                    break;
                }
                case "/": {
                    division();
                    break;
                }
                case "*": {
                    multiply();
                    break;
                }

            }
        }

    }


    //add
    void add() {

        if (isOperandSelected == false) {

            mListener.onFragmentInteraction("+", 1);
            isOperandSelected = true;
            operator = "+";
            isCalculated = false;


        } else {
            op1 = Long.parseLong(value1);
            op2 = Long.parseLong(value2);
            result = op1 + op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected = false;
            Log.d("add", String.valueOf(result));
        }


        if (isCalculated == true) {
            //result = 0;
            value2 = "0";
            value1 = String.valueOf(result);

            operator = null;
            isOperandSelected = false;
            Log.d("add", String.valueOf(result));
        }


    }

    //subtraction
    void sub() {
        if (isOperandSelected == false) {

            mListener.onFragmentInteraction("-", 1);
            isOperandSelected = true;
            operator = "-";
            isCalculated = false;

        } else {
            op1 = Long.parseLong(value1);
            op2 = Long.parseLong(value2);
            result = op1 - op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected = false;
        }


        if (isCalculated == true) {
            //result = 0;
            value2 = "0";
            value1 = String.valueOf(result);

            operator = null;
            isOperandSelected = false;
        }


    }

    //multiply
    void multiply() {
        if (isOperandSelected == false) {

            mListener.onFragmentInteraction("*", 1);
            isOperandSelected = true;
            operator = "*";
            isCalculated = false;

        } else {
            op1 = Long.parseLong(value1);
            op2 = Long.parseLong(value2);
            result = op1 * op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected = false;
        }


        if (isCalculated == true) {
            //result = 0;
            value2 = "0";
            value1 = String.valueOf(result);

            operator = null;
            isOperandSelected = false;
        }


    }

    //Division
    void division() {

        if (isOperandSelected == false) {

            mListener.onFragmentInteraction("/", 1);
            isOperandSelected = true;
            operator = "/";
            isCalculated = false;

        } else {
            if(op2 !=0){
            op1 = Long.parseLong(value1);
            op2 = Long.parseLong(value2);
            result = op1 / op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected = false;}
            else
            {
                Toast t =  Toast.makeText(getContext(),"Division by 0 is not possible",Toast.LENGTH_SHORT);
                t.show();
            }
        }


        if (isCalculated == true) {
            //result = 0;
            value2 = "0";
            value1 = String.valueOf(result);

            operator = null;
            isOperandSelected = false;
        }


    }

    //cleac C button
    void clear() {
        mListener.onFragmentInteraction(String.valueOf(""), 0);
        value1 = "0";
        value2 = "0";
        operator = null;
        isOperandSelected = false;
        isCalculated = false;

    }

    //backspace button
    void backspace() {
       if(isCalculated = true)
       {
           mListener.onFragmentInteraction("", 0);
           clear();
           isCalculated=false;
       }
       else
       {
           if(value2 != null)
           {
               mListener.onFragmentInteraction(value1+operator, 1);
               value2 =null;

           }
           else{
               if (isOperandSelected == true)
               {
                   mListener.onFragmentInteraction("", 1);
                   operator=null;
               }
               else
               {
                   mListener.onFragmentInteraction("", 1);
                   clear();
               }
           }

       }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one:
                buttonN(1);
                break;

            case R.id.two:
                buttonN(2);
                break;

            case R.id.three:
                buttonN(3);
                break;

            case R.id.four:
                buttonN(4);
                break;
            case R.id.five:
                buttonN(5);
                break;
            case R.id.six:
                buttonN(6);
                break;
            case R.id.seven:
                buttonN(7);
                break;
            case R.id.eight:
                buttonN(8);
                break;
            case R.id.nine:
                buttonN(9);
                break;

            case R.id.zero:
                buttonN(0);
                break;

            //Operator interactions
            case R.id.plus:
                add();
                break;

            case R.id.Sub:
                sub();
                break;
            case R.id.mul:
                multiply();
                break;
            case R.id.div:
                division();
                break;
            case R.id.equal:
                equalTo();
                break;
            case R.id.clear:
                clear();
                break;
            case R.id.back:
                backspace();
                break;


        }


    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String userContent, int type);
    }

    void setmListener(OnFragmentInteractionListener listener) {
        mListener = listener;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("value1", value1);
        outState.putString("value2", value2);

        outState.putString("operator", operator);
        outState.putLong("op1", op1);
        outState.putLong("op2", op2);
        outState.putLong("result", result);
        outState.putBoolean("isCalculated", isCalculated);
        outState.putBoolean("isOperandSelected", isOperandSelected);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            value1 = savedInstanceState.getString("value1");
            value2 = savedInstanceState.getString("value2");
            // Log.d("val",value1);
            //Log.d("val",value2);
            operator = savedInstanceState.getString("operator");
            Log.d("val", String.valueOf(result));
            op1 = savedInstanceState.getLong("op1");
            op2 = savedInstanceState.getLong("op2");
            result = savedInstanceState.getLong("result");
            isCalculated = savedInstanceState.getBoolean("isCalculated");
            isOperandSelected = savedInstanceState.getBoolean("isOperandSelected");


        }
    }


}

