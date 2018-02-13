package com.example.user.fullcalci;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;


public class KeyBoardFragment extends Fragment {

    private OnFragmentInteractionListener mListener;


    int result = 0, op1=0, op2=0,operand = 0;
    boolean isOperandSelected = false;
    String value1= new String();
    String value2= new String();
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



    void  button6() {
        if (isCalculated == false) {

            if (isOperandSelected == false) {
                mListener.onFragmentInteraction("6", 1);
                value1 = value1 + "6";


            } else {
                value2 = value2 + "6";
                mListener.onFragmentInteraction("6", 1);
            }
        } else {

            if (isOperandSelected == false) {
                mListener.onFragmentInteraction("6", 0);
                value1 ="";
                value1 = value1 + "6";


            } else {
                value2 = value2 + "6";
                mListener.onFragmentInteraction("6", 0);
            }


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
            mListener.onFragmentInteraction("8", 1);
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
        mListener.onFragmentInteraction(value1, 0);
        else
        {
            if(value1 != "0")
                mListener.onFragmentInteraction(String.valueOf(op1),0);
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
            isOperandSelected =true;
            operator = "+";
            isCalculated= false;

        }
        else {
            op1 = Integer.parseInt(value1);
            op2 =Integer.parseInt(value2);
            result = op1+op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected= false;
        }




        if (isCalculated == true){
        result =0;
        value2="0";
        value1="0";
        operator=null;
        isOperandSelected= false;}



    }
    //subtraction
    void sub() {
        if(isOperandSelected == false) {

            mListener.onFragmentInteraction("-", 1);
            isOperandSelected =true;
            operator = "-";
            isCalculated= false;

        }
        else {
            op1 = Integer.parseInt(value1);
            op2 =Integer.parseInt(value2);
            result = op1-op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected= false;
        }




        if (isCalculated == true){
            result =0;
            value2="0";
            value1="0";
            operator=null;
            isOperandSelected= false;}


    }

    //multiply
    void multiply() {
        if(isOperandSelected == false) {

            mListener.onFragmentInteraction("*", 1);
            isOperandSelected =true;
            operator = "*";
            isCalculated= false;

        }
        else {
            op1 = Integer.parseInt(value1);
            op2 =Integer.parseInt(value2);
            result = op1*op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected= false;
        }




        if (isCalculated == true){
            result =0;
            value2="0";
            value1="0";
            operator=null;
            isOperandSelected= false;}


    }

    //Division
    void division()
    {
        if(isOperandSelected == false) {

            mListener.onFragmentInteraction("+", 1);
            isOperandSelected =true;
            operator = "/";
            isCalculated= false;

        }
        else {
            op1 = Integer.parseInt(value1);
            op2 =Integer.parseInt(value2);
            result = op1/op2;
            mListener.onFragmentInteraction(String.valueOf(result), 0);
            isCalculated = true;
            isOperandSelected= false;
        }




        if (isCalculated == true){
            result =0;
            value2="0";
            value1="0";
            operator=null;
            isOperandSelected= false;}


    }

    //cleac C button
    void clear()
    {
        mListener.onFragmentInteraction(String.valueOf(""), 0);
        value1="0";
        value2="0";
        operator = null;
        isOperandSelected= false;
        isCalculated =false;

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







    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String userContent,int type);
    }

    void setmListener(OnFragmentInteractionListener listener)
    {
        mListener = listener;
    }

}

