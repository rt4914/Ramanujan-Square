package com.talesra.rajat.ramanujansquare;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    Context c;
    static int year,month,day;
    DatePicker datepicker;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user

        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        String temp=""+day+"-"+(month+1)+"-"+year;

        FinalSquare.a = day;
        FinalSquare.b = month+1;
        FinalSquare.c = year/100;
        FinalSquare.d = year%100;

        FinalSquare.sum= day + (month+1) + year/100 + year%100;

        YourSquare.dateText.setText(temp);
    }
}
