package com.example.user.fullcalci;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

/**
 * Created by User on 07-02-2018.
 */

public class ButtonAdapter extends BaseAdapter {
    

    String[] keys = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "<", "*", "0", "%", "C"};

    public ButtonAdapter(KeyBoardFragment keyBoardFragment) {
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
