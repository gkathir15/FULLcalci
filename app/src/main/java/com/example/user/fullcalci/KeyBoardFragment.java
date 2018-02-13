package com.example.user.fullcalci;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;


public class KeyBoardFragment extends Fragment implements  View.OnClickListener{

    private OnFragmentInteractionListener mListener;


    int result = 0, op1 = 0, op2 = 0, operand = 0;
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

        Button one = (Button) keyboardView.findViewById(R.id.one);
        Button two = (Button)keyboardView.findViewById(R.id.two);
        Button three = (Button)keyboardView.findViewById(R.id.three);
        Button four = (Button)keyboardView.findViewById(R.id.four);
        Button five = (Button)keyboardView.findViewById(R.id.five);
        Button six = (Button)keyboardView.findViewById(R.id.six);
        Button seven = (Button)keyboardView.findViewById(R.id.seven);
        Button eight = (Button)keyboardView.findViewById(R.id.eight);
        Button nine = (Button)keyboardView.findViewById(R.id.nine);
        Button zero = (Button)keyboardView.findViewById(R.id.zero);
        Button plus = (Button)keyboardView.findViewById(R.id.plus);
        Button sub = (Button)keyboardView.findViewById(R.id.Sub);
        Button backspace = (Button)keyboardView.findViewById(R.id.back);
        Button clear = (Button)keyboardView.findViewById(R.id.clear);
        Button mul = (Button)keyboardView.findViewById(R.id.mul);
        Button equal = (Button)keyboardView.findViewById(R.id.equal);
        Button div = (Button)keyboardView.findViewById(R.id.div);
        one.setOnClickListener((View.OnClickListener) this);
        two.setOnClickListener((View.OnClickListener) this);
        three.setOnClickListener((View.OnClickListener) this);
        four.setOnClickListener((View.OnClickListener) this);
        five.setOnClickListener((View.OnClickListener) this);
        six.setOnClickListener((View.OnClickListener) this);
        seven.setOnClickListener((View.OnClickListener) this);
        eight.setOnClickListener((View.OnClickListener) this);
        nine.setOnClickListener((View.OnClickListener) this);
        zero.setOnClickListener((View.OnClickListener) this);
        plus.setOnClickListener((View.OnClickListener) this);
        sub.setOnClickListener((View.OnClickListener) this);
        mul.setOnClickListener((View.OnClickListener) this);
        backspace.setOnClickListener((View.OnClickListener) this);
        equal.setOnClickListener((View.OnClickListener) this);
        clear.setOnClickListener((View.OnClickListener) this);
        equal.setOnClickListener((View.OnClickListener) this);
        div.setOnClickListener((View.OnClickListener) this);







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
                mListener.onFragmentInteraction(String.valueOf(number), 0);
                value1 = "";
                value1 = value1 + String.valueOf(number);


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
            op1 = Integer.parseInt(value1);
            op2 = Integer.parseInt(value2);
            result = op1 + op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected = false;
        }


        if (isCalculated == true) {
            result = 0;
            value2 = "0";
            value1 = "0";
            operator = null;
            isOperandSelected = false;
        }


    }

    //subtraction
    void sub() {
        if (isOperandSelected == false) {

            mListener.onFragmentInteraction("-", 1);
            isOperandSelected = true;
            operator = "";
            isCalculated = false;

        } else {
            op1 = Integer.parseInt(value1);
            op2 = Integer.parseInt(value2);
            result = op1 - op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected = false;
        }


        if (isCalculated == true) {
            result = 0;
            value2 = "0";
            value1 = "0";
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
            op1 = Integer.parseInt(value1);
            op2 = Integer.parseInt(value2);
            result = op1 * op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected = false;
        }


        if (isCalculated == true) {
            result = 0;
            value2 = "0";
            value1 = "0";
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
            op1 = Integer.parseInt(value1);
            op2 = Integer.parseInt(value2);
            result = op1 / op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected = false;
        }


        if (isCalculated == true) {
            result = 0;
            value2 = "0";
            value1 = "0";
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
            if(result < 10) {

                mListener.onFragmentInteraction(" ", 0);
                isCalculated =false;


            }
            else
            {

                value1 = String.valueOf(result).substring(0, String.valueOf(result).length() - 1);
                mListener.onFragmentInteraction(String.valueOf(value1), 0);
            }
            if (isOperandSelected)
            {
                operator="";
                isOperandSelected =false;

            }
            else
            {
                if(Integer.parseInt(value1) < 10) {

                    mListener.onFragmentInteraction(" ", 0);
                    isCalculated =false;


                }
                else
                {


                    value1 = String.valueOf(value1).substring(0, String.valueOf(value1).length() - 1);
                    mListener.onFragmentInteraction(String.valueOf(value1), 0);
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



}

