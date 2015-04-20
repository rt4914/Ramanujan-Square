package com.talesra.rajat.ramanujansquare;

import android.app.DialogFragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class YourSquare extends ActionBarActivity {

    SpannableString s;
    ActionBar bar;

    Button date;
    Button done;

    static EditText dateText;
    EditText name;

    String pName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_square);

        s = new SpannableString("RamanujanSquare");
        s.setSpan(new TypefaceSpan(this, "Dax-Medium.otf"), 0, s.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        s.setSpan(new RelativeSizeSpan(1.2f), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3f51b5")));
        bar.setTitle(s);

        name = (EditText) findViewById(R.id.name);
        date = (Button) findViewById(R.id.date);
        dateText = (EditText) findViewById(R.id.dateText);
        done = (Button) findViewById(R.id.done);

        s = new SpannableString("\uf073");
        s.setSpan(new TypefaceSpan(this,"FontAwesome.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        date.setText(s);

        s = new SpannableString("Done");
        s.setSpan(new TypefaceSpan(this,"Dax-Medium.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        done.setText(s);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new DatePickerFragment();
                newFragment.show(getFragmentManager(), "datePicker");
            }
        });

        dateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date.performClick();
            }
        });


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pName = name.getText().toString();

                if(pName.length()!=0)
                {
                    if(dateText.getText().toString().length()!=0)
                    {
                        FinalSquare.name = pName;
                        Intent i = new Intent(getApplicationContext(), FinalSquare.class);
                        startActivity(i);
                    }
                    else
                        Toast.makeText(getApplicationContext(), "Enter D.O.B.", Toast.LENGTH_LONG).show();

                }
                else
                    Toast.makeText(getApplicationContext(), "Enter First Name.", Toast.LENGTH_LONG).show();

            }
        });


    }

}
