package com.example.user.fullcalci;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;


public class KeyBoardFragment extends Fragment implements View.OnClickListener{

    private OnFragmentInteractionListener mListener;


    int result = 0, op1=0, op2=0,operand = 0;
    boolean isOperandSelected = false;
    String value1= new String();
    String value2= new String();
    String operator = new String();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        Button one, two, three, four, five, six, seven, eight, nine, zero, plus, sub, backspace, clear, mul, equal,div;



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
        div = keyboardView.findViewById(R.id.div);




        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalTo();
            }
        });


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               button1();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button7();
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button8();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9();
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button0();
            }
        });



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiply();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                division();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backspace();
            }
        });







        return keyboardView;
    }


    void  button1()
    {
        if(isOperandSelected == false) {
            mListener.onFragmentInteraction("1", 1);
            value1 = value1 + "1";


        }
        else {
            value2 = value2 + "1";
            mListener.onFragmentInteraction("1", 1);
        }

    }

    void  button2()
    {
        if(isOperandSelected == false) {
            mListener.onFragmentInteraction("2", 1);
            value1 = value1 + "2";


        }
        else {
            value2 = value2 + "2";
            mListener.onFragmentInteraction("2", 1);
        }

    }

    void  button3()
    {
        if(isOperandSelected == false) {
            mListener.onFragmentInteraction("3", 1);
            value1 = value1 + "3";


        }
        else {
            value2 = value2 + "3";
            mListener.onFragmentInteraction("3", 1);
        }

    }

    void  button4()
    {
        if(isOperandSelected == false) {
            mListener.onFragmentInteraction("4", 1);
            value1 = value1 + "4";


        }
        else {
            value2 = value2 + "4";
            mListener.onFragmentInteraction("4", 1);
        }

    }

    void  button5()
    {
        if(isOperandSelected == false) {
            mListener.onFragmentInteraction("5", 1);
            value1 = value1 + "5";


        }
        else {
            value2 = value2 + "5";
            mListener.onFragmentInteraction("5", 1);
        }

    }



    void  button6()
    {
        if(isOperandSelected == false) {
            mListener.onFragmentInteraction("6", 1);
            value1 = value1 + "6";


        }
        else {
            value2 = value2 + "6";
            mListener.onFragmentInteraction("6", 1);
        }

    }

    void  button7()
    {
        if(isOperandSelected == false) {
            mListener.onFragmentInteraction("7", 1);
            value1 = value1 + "7";


        }
        else {
            value2 = value2 + "7";
            mListener.onFragmentInteraction("7", 1);
        }

    }

    void  button8()
    {
        if(isOperandSelected == false) {
            mListener.onFragmentInteraction("9", 1);
            value1 = value1 + "8";


        }
        else {
            value2 = value2 + "8";
            mListener.onFragmentInteraction("8", 1);
        }

    }

    void  button9()
    {
        if(isOperandSelected == false) {
            mListener.onFragmentInteraction("9", 1);
            value1 = value1 + "9";


        }
        else {
            value2 = value2 + "9";
            mListener.onFragmentInteraction("1", 1);
        }

    }

    void  button0()
    {
        if(isOperandSelected == false) {
            mListener.onFragmentInteraction("0", 1);
            value1 = value1 + "1";


        }
        else {
            value2 = value2 + "0";
            mListener.onFragmentInteraction("0", 1);
        }

    }




    void equalTo()
    {
        if(isOperandSelected == false)
        mListener.onFragmentInteraction("value1", 0);
        else
        {
            switch(operator)
            {
                case "+":
                {
                    op1 = Integer.parseInt(value1);
                    op2 =Integer.parseInt(value2);
                    result = op1+op2;
                    mListener.onFragmentInteraction(String.valueOf(result), 0);
                    break;
                }
                case "-":
                {
                    op1 = Integer.parseInt(value1);
                    op2 =Integer.parseInt(value2);
                    result = op1-op2;
                    mListener.onFragmentInteraction(String.valueOf(result), 0);
                    break;
                }
                case "/":
            {
                op1 = Integer.parseInt(value1);
                op2 =Integer.parseInt(value2);
                result = op1/op2;
                mListener.onFragmentInteraction(String.valueOf(result), 0);
                break;
            }
            case "*":
            {
                op1 = Integer.parseInt(value1);
                op2 =Integer.parseInt(value2);
                result = op1*op2;
                mListener.onFragmentInteraction(String.valueOf(result), 0);
                break;
            }

            }
        }

    }



    //add
    void add() {

        if(isOperandSelected == false) {

            mListener.onFragmentInteraction("+", 1);

        }
        else {
            op1 = Integer.parseInt(value1);
            op2 =Integer.parseInt(value2);
            result = op1+op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
        }

        operator = "+";
        isOperandSelected =true;



    }
    //subtraction
    void sub() {
        if(isOperandSelected == false) {

            mListener.onFragmentInteraction("-", 1);

        }
        else {
            op1 = Integer.parseInt(value1);
            op2 =Integer.parseInt(value2);
            result = op1-op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
        }
        operator = "-";
        isOperandSelected =true;
    }

    //multiply
    void multiply() {
        if(isOperandSelected == false) {

            mListener.onFragmentInteraction("*", 1);

        }
        else {
            op1 = Integer.parseInt(value1);
            op2 =Integer.parseInt(value2);
            result = op1*op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
        }
        operator = "*";
        isOperandSelected =true;
    }

    //Division
    void division()
    {
        if(isOperandSelected == false) {

            mListener.onFragmentInteraction("/", 1);

        }
        else {
            op1 = Integer.parseInt(value1);
            op2 =Integer.parseInt(value2);
            result = op1/op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
        }
        operator = "/";
        isOperandSelected =true;
    }

    //cleac C button
    void clear()
    {
        mListener.onFragmentInteraction(String.valueOf(result), 0);
        value1="0";
        value2="0";

    }

    //backspace button
    void backspace()
    {
       if(value2 != null)
       {
           value2 = value2.substring(0,value2.length()-1);
           mListener.onFragmentInteraction(String.valueOf(value1+operator+value2), 0);

       }
       else
           if(operator != null)
           {
               mListener.onFragmentInteraction(String.valueOf(value1), 0);
           }
           else
           {
               value1 = value1.substring(0,value1.length()-1);
               mListener.onFragmentInteraction(String.valueOf(value1), 0);
           }
    }





    @Override
    public void onClick(View v) {
    }

    String setText(String txt)
    {
        return txt;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String userContent,int type);
    }

    void setmListener(OnFragmentInteractionListener listener)
    {
        mListener = listener;
    }

}

