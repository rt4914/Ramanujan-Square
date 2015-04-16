package com.talesra.rajat.ramanujansquare;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    Button ramanujanSquareIcon;
    Button yourSquareIcon;
    Button historyIcon;
    Button rateUsIcon;
    Button aboutUsIcon;

    Button ramanujanSquareText;
    Button yourSquareText;
    Button historyText;
    Button rateUsText;
    Button aboutUsText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SpannableString s = new SpannableString("RamanujanSquare");
        s.setSpan(new TypefaceSpan(this, "Dax-Medium.otf"), 0, s.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        s.setSpan(new RelativeSizeSpan(1.2f), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3f51b5")));
        bar.setTitle(s);

        ramanujanSquareIcon = (Button) findViewById(R.id.button11);
        yourSquareIcon      = (Button) findViewById(R.id.button21);
        historyIcon         = (Button) findViewById(R.id.button31);
        rateUsIcon          = (Button) findViewById(R.id.button41);
        aboutUsIcon         = (Button) findViewById(R.id.button51);

        ramanujanSquareText = (Button) findViewById(R.id.button12);
        yourSquareText      = (Button) findViewById(R.id.button22);
        historyText         = (Button) findViewById(R.id.button32);
        rateUsText          = (Button) findViewById(R.id.button42);
        aboutUsText         = (Button) findViewById(R.id.button52);

        s = new SpannableString("\uf007");
        s.setSpan(new TypefaceSpan(this,"FontAwesome.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ramanujanSquareIcon.setText(s);

        s = new SpannableString("Ramanujan Square");
        s.setSpan(new TypefaceSpan(this, "Dax-Medium.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        ramanujanSquareText.setText(s);

        s = new SpannableString("\uf0ce");
        s.setSpan(new TypefaceSpan(this,"FontAwesome.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        yourSquareIcon.setText(s);

        s = new SpannableString("Your Square");
        s.setSpan(new TypefaceSpan(this,"Dax-Medium.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        yourSquareText.setText(s);

        s = new SpannableString("\uf1da");
        s.setSpan(new TypefaceSpan(this,"FontAwesome.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        historyIcon.setText(s);

        s = new SpannableString("About Ramanujan");
        s.setSpan(new TypefaceSpan(this,"Dax-Medium.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        historyText.setText(s);

        s = new SpannableString("\uf005");
        s.setSpan(new TypefaceSpan(this,"FontAwesome.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        rateUsIcon.setText(s);

        s = new SpannableString("Rate Us");
        s.setSpan(new TypefaceSpan(this,"Dax-Medium.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        rateUsText.setText(s);

        s = new SpannableString("\uf129");
        s.setSpan(new TypefaceSpan(this,"FontAwesome.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        aboutUsIcon.setText(s);

        s = new SpannableString("About Us");
        s.setSpan(new TypefaceSpan(this,"Dax-Medium.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        aboutUsText.setText(s);

        //Managing the button click.
        ramanujanSquareText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),RamanujanSquare.class);
                startActivity(i);
            }
        });

        yourSquareText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),YourSquare.class);
                startActivity(i);
            }
        });

        aboutUsText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),AboutUs.class);
                startActivity(i);
            }
        });

        //Managing the icon click.
        ramanujanSquareIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ramanujanSquareText.performClick();
            }
        });

        yourSquareIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yourSquareText.performClick();
            }
        });

        historyIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                historyText.performClick();
            }
        });

        rateUsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rateUsText.performClick();
            }
        });

        aboutUsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutUsText.performClick();
            }
        });

    }

}
