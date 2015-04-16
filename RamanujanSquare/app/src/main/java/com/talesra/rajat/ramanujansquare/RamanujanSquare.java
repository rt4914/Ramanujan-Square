package com.talesra.rajat.ramanujansquare;

import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.TextView;

public class RamanujanSquare extends ActionBarActivity {

    TextView subheading;
    TextView previous;
    TextView next;

    TextView tv11;
    TextView tv12;
    TextView tv13;
    TextView tv14;
    TextView tv21;
    TextView tv22;
    TextView tv23;
    TextView tv24;
    TextView tv31;
    TextView tv32;
    TextView tv33;
    TextView tv34;
    TextView tv41;
    TextView tv42;
    TextView tv43;
    TextView tv44;



    int a;
    int b;
    int c;
    int d;
    int cnt=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramanujan_square);


        SpannableString s = new SpannableString("RamanujanSquare");
        s.setSpan(new TypefaceSpan(this, "Dax-Medium.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        s.setSpan(new RelativeSizeSpan(1.2f), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3f51b5")));
        bar.setTitle(s);

        subheading = (TextView) findViewById(R.id.subheading);

        s = new SpannableString("Sum of Selected Boxes = 139");
        s.setSpan(new TypefaceSpan(this, "Dax-Medium.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        subheading.setText(s);

        subheading.setText("D.O.B. = 22/12/1887");

        previous = (TextView) findViewById(R.id.previous);

        s = new SpannableString("\uf177");
        s.setSpan(new TypefaceSpan(this,"FontAwesome.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        previous.setText(s);

        next = (TextView) findViewById(R.id.next);
        s = new SpannableString("\uf178");
        s.setSpan(new TypefaceSpan(this,"FontAwesome.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        next.setText(s);

        tv11 = (TextView) findViewById(R.id.tv11);
        tv12 = (TextView) findViewById(R.id.tv12);
        tv13 = (TextView) findViewById(R.id.tv13);
        tv14 = (TextView) findViewById(R.id.tv14);
        tv21 = (TextView) findViewById(R.id.tv21);
        tv22 = (TextView) findViewById(R.id.tv22);
        tv23 = (TextView) findViewById(R.id.tv23);
        tv24 = (TextView) findViewById(R.id.tv24);
        tv31 = (TextView) findViewById(R.id.tv31);
        tv32 = (TextView) findViewById(R.id.tv32);
        tv33 = (TextView) findViewById(R.id.tv33);
        tv34 = (TextView) findViewById(R.id.tv34);
        tv41 = (TextView) findViewById(R.id.tv41);
        tv42 = (TextView) findViewById(R.id.tv42);
        tv43 = (TextView) findViewById(R.id.tv43);
        tv44 = (TextView) findViewById(R.id.tv44);

        a=22;
        b=12;
        c=18;
        d=87;

        tv11.setText(String.valueOf(a));
        tv12.setText(String.valueOf(b));
        tv13.setText(String.valueOf(c));
        tv14.setText(String.valueOf(d));

        tv21.setText(String.valueOf(d+1));
        tv22.setText(String.valueOf(c-1));
        tv23.setText(String.valueOf(b-3));
        tv24.setText(String.valueOf(a+3));

        tv31.setText(String.valueOf(b-2));
        tv32.setText(String.valueOf(a+2));
        tv33.setText(String.valueOf(d+2));
        tv34.setText(String.valueOf(c-2));

        tv41.setText(String.valueOf(c+1));
        tv42.setText(String.valueOf(d-1));
        tv43.setText(String.valueOf(a+1));
        tv44.setText(String.valueOf(b-1));


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                checkCounter(cnt);
            }
        });


        //Set Highlighter on click of buttons in drawable.


        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt--;
                checkCounter(cnt);
            }
        });

    }

    private void checkCounter(int x) {

        switch(x){
            case 101:
                subheading.setText("Sum of Selected Boxes = 139");
                //Row Wise Boxes
                oneCnt();
                oneTextCnt();
                break;

            case 102:
                subheading.setText("Sum of Selected Boxes = 139");
                //Column Wise Boxes
                twoCnt();
                twoTextCnt();
                break;

            case 103:
                subheading.setText("Sum of Selected Boxes = 139");
                //Diagonal Wise Boxes
                threeCnt();
                threeTextCnt();
                break;

            case 104:
                subheading.setText("Sum of Selected Boxes = 139");
                //Quadrants Wise Boxes
                fourCnt();
                fourTextCnt();
                break;

            case 105:
                subheading.setText("Sum of Selected Boxes = 139");
                //Center Boxes
                fiveCnt();
                fiveTextCnt();
                break;

            case 106:
                subheading.setText("Sum of Selected Boxes = 139");
                //Corners Boxes
                sixCnt();
                sixTextCnt();
                break;

            case 107:
                subheading.setText("Sum of Selected Boxes = 139");
                //top-down middle
                sevenCnt();
                sevenTextCnt();
                break;

            case 108:
                subheading.setText("Sum of Selected Boxes = 139");
                //left-right middle
                eightCnt();
                eightTextCnt();
                break;

            case 109:
                subheading.setText("Sum of Selected Boxes = 139");
                //crosses1
                nineCnt();
                nineTextCnt();
                break;

            case 110:
                subheading.setText("Sum of Selected Boxes = 139");
                //crosses2
                tenCnt();
                tenTextCnt();
                break;

            case 111:
                subheading.setText("Sum of Selected Boxes = 139");
                //top-down left
                elevenCnt();
                elevenTextCnt();
                break;

            case 112:
                subheading.setText("Sum of Selected Boxes = 139");
                //top-down right
                twelveCnt();
                twelveTextCnt();
                break;

            case 113:
                subheading.setText("Sum of Selected Boxes = 139");
                //3x3 corners 2st Quad
                thirteenCnt();
                thirteenTextCnt();
                break;

            case 114:
                subheading.setText("Sum of Selected Boxes = 139");
                //3x3 corners 1st Quad
                fourteenCnt();
                fourteenTextCnt();
                break;

            case 115:
                subheading.setText("Sum of Selected Boxes = 139");
                //3x3 corners 3st Quad
                fifteenCnt();
                fifteenTextCnt();
                break;

            case 116:
                subheading.setText("Sum of Selected Boxes = 139");
                //3x3 corners 4st Quad
                sixteenCnt();
                sixteenTextCnt();
                break;

            default:
                subheading.setText("RAMANUJAN Square");
                if(cnt==117)
                    cnt--;
                if(cnt==100)
                    cnt++;
                defaultCnt();
                defaultTextCnt();
                break;
        }

    }

    /*

    Setting Up The Text Sizes Below.

    */


    private void sixteenTextCnt() {

        tv11.setTextSize(18);
        tv12.setTextSize(18);
        tv13.setTextSize(18);
        tv14.setTextSize(18);

        tv21.setTextSize(18);
        tv22.setTextSize(22);
        tv23.setTextSize(18);
        tv24.setTextSize(22);

        tv31.setTextSize(18);
        tv32.setTextSize(18);
        tv33.setTextSize(18);
        tv34.setTextSize(18);

        tv41.setTextSize(18);
        tv42.setTextSize(22);
        tv43.setTextSize(18);
        tv44.setTextSize(22);

    }

    private void fifteenTextCnt() {

        tv11.setTextSize(18);
        tv12.setTextSize(18);
        tv13.setTextSize(18);
        tv14.setTextSize(18);

        tv21.setTextSize(22);
        tv22.setTextSize(18);
        tv23.setTextSize(22);
        tv24.setTextSize(18);

        tv31.setTextSize(18);
        tv32.setTextSize(18);
        tv33.setTextSize(18);
        tv34.setTextSize(18);

        tv41.setTextSize(22);
        tv42.setTextSize(18);
        tv43.setTextSize(22);
        tv44.setTextSize(18);

    }

    private void fourteenTextCnt() {

        tv11.setTextSize(18);
        tv12.setTextSize(22);
        tv13.setTextSize(18);
        tv14.setTextSize(22);

        tv21.setTextSize(18);
        tv22.setTextSize(18);
        tv23.setTextSize(18);
        tv24.setTextSize(18);

        tv31.setTextSize(18);
        tv32.setTextSize(22);
        tv33.setTextSize(18);
        tv34.setTextSize(22);

        tv41.setTextSize(18);
        tv42.setTextSize(18);
        tv43.setTextSize(18);
        tv44.setTextSize(18);

    }

    private void thirteenTextCnt() {

        tv11.setTextSize(22);
        tv12.setTextSize(18);
        tv13.setTextSize(22);
        tv14.setTextSize(18);

        tv21.setTextSize(18);
        tv22.setTextSize(18);
        tv23.setTextSize(18);
        tv24.setTextSize(18);

        tv31.setTextSize(22);
        tv32.setTextSize(18);
        tv33.setTextSize(22);
        tv34.setTextSize(18);

        tv41.setTextSize(18);
        tv42.setTextSize(18);
        tv43.setTextSize(18);
        tv44.setTextSize(18);

    }

    private void twelveTextCnt() {

        tv11.setTextSize(18);
        tv12.setTextSize(18);
        tv13.setTextSize(22);
        tv14.setTextSize(22);

        tv21.setTextSize(18);
        tv22.setTextSize(18);
        tv23.setTextSize(18);
        tv24.setTextSize(18);

        tv31.setTextSize(18);
        tv32.setTextSize(18);
        tv33.setTextSize(18);
        tv34.setTextSize(18);

        tv41.setTextSize(18);
        tv42.setTextSize(18);
        tv43.setTextSize(22);
        tv44.setTextSize(22);

    }

    private void elevenTextCnt() {

        tv11.setTextSize(22);
        tv12.setTextSize(22);
        tv13.setTextSize(18);
        tv14.setTextSize(18);

        tv21.setTextSize(18);
        tv22.setTextSize(18);
        tv23.setTextSize(18);
        tv24.setTextSize(18);

        tv31.setTextSize(18);
        tv32.setTextSize(18);
        tv33.setTextSize(18);
        tv34.setTextSize(18);

        tv41.setTextSize(22);
        tv42.setTextSize(22);
        tv43.setTextSize(18);
        tv44.setTextSize(18);

    }

    private void tenTextCnt() {

        tv11.setTextSize(18);
        tv12.setTextSize(18);
        tv13.setTextSize(22);
        tv14.setTextSize(18);

        tv21.setTextSize(18);
        tv22.setTextSize(18);
        tv23.setTextSize(18);
        tv24.setTextSize(22);

        tv31.setTextSize(22);
        tv32.setTextSize(18);
        tv33.setTextSize(18);
        tv34.setTextSize(18);

        tv41.setTextSize(18);
        tv42.setTextSize(22);
        tv43.setTextSize(18);
        tv44.setTextSize(18);

    }

    private void nineTextCnt() {

        tv11.setTextSize(18);
        tv12.setTextSize(22);
        tv13.setTextSize(18);
        tv14.setTextSize(18);

        tv21.setTextSize(22);
        tv22.setTextSize(18);
        tv23.setTextSize(18);
        tv24.setTextSize(18);

        tv31.setTextSize(18);
        tv32.setTextSize(18);
        tv33.setTextSize(18);
        tv34.setTextSize(22);

        tv41.setTextSize(18);
        tv42.setTextSize(18);
        tv43.setTextSize(22);
        tv44.setTextSize(18);

    }

    private void eightTextCnt() {

        tv11.setTextSize(18);
        tv12.setTextSize(18);
        tv13.setTextSize(18);
        tv14.setTextSize(18);

        tv21.setTextSize(22);
        tv22.setTextSize(18);
        tv23.setTextSize(18);
        tv24.setTextSize(22);

        tv31.setTextSize(22);
        tv32.setTextSize(18);
        tv33.setTextSize(18);
        tv34.setTextSize(22);

        tv41.setTextSize(18);
        tv42.setTextSize(18);
        tv43.setTextSize(18);
        tv44.setTextSize(18);

    }

    private void sevenTextCnt() {

        tv11.setTextSize(18);
        tv12.setTextSize(22);
        tv13.setTextSize(22);
        tv14.setTextSize(18);

        tv21.setTextSize(18);
        tv22.setTextSize(18);
        tv23.setTextSize(18);
        tv24.setTextSize(18);

        tv31.setTextSize(18);
        tv32.setTextSize(18);
        tv33.setTextSize(18);
        tv34.setTextSize(18);

        tv41.setTextSize(18);
        tv42.setTextSize(22);
        tv43.setTextSize(22);
        tv44.setTextSize(18);

    }

    private void sixTextCnt() {

        tv11.setTextSize(22);
        tv12.setTextSize(18);
        tv13.setTextSize(18);
        tv14.setTextSize(22);

        tv21.setTextSize(18);
        tv22.setTextSize(18);
        tv23.setTextSize(18);
        tv24.setTextSize(18);

        tv31.setTextSize(18);
        tv32.setTextSize(18);
        tv33.setTextSize(18);
        tv34.setTextSize(18);

        tv41.setTextSize(22);
        tv42.setTextSize(18);
        tv43.setTextSize(18);
        tv44.setTextSize(22);

    }

    private void fiveTextCnt() {

        tv11.setTextSize(18);
        tv12.setTextSize(18);
        tv13.setTextSize(18);
        tv14.setTextSize(18);

        tv21.setTextSize(18);
        tv22.setTextSize(22);
        tv23.setTextSize(22);
        tv24.setTextSize(18);

        tv31.setTextSize(18);
        tv32.setTextSize(22);
        tv33.setTextSize(22);
        tv34.setTextSize(18);

        tv41.setTextSize(18);
        tv42.setTextSize(18);
        tv43.setTextSize(18);
        tv44.setTextSize(18);

    }

    private void fourTextCnt() {

        tv11.setTextSize(19);
        tv12.setTextSize(19);
        tv13.setTextSize(19);
        tv14.setTextSize(19);

        tv21.setTextSize(20);
        tv22.setTextSize(20);
        tv23.setTextSize(20);
        tv24.setTextSize(20);

        tv31.setTextSize(21);
        tv32.setTextSize(21);
        tv33.setTextSize(21);
        tv34.setTextSize(21);

        tv41.setTextSize(22);
        tv42.setTextSize(22);
        tv43.setTextSize(22);
        tv44.setTextSize(22);

    }

    private void threeTextCnt() {

        tv11.setTextSize(22);
        tv12.setTextSize(18);
        tv13.setTextSize(18);
        tv14.setTextSize(22);

        tv21.setTextSize(18);
        tv22.setTextSize(22);
        tv23.setTextSize(22);
        tv24.setTextSize(18);

        tv31.setTextSize(18);
        tv32.setTextSize(22);
        tv33.setTextSize(22);
        tv34.setTextSize(18);

        tv41.setTextSize(22);
        tv42.setTextSize(18);
        tv43.setTextSize(18);
        tv44.setTextSize(22);

    }

    private void twoTextCnt() {

        tv11.setTextSize(22);
        tv12.setTextSize(21);
        tv13.setTextSize(20);
        tv14.setTextSize(19);

        tv21.setTextSize(22);
        tv22.setTextSize(21);
        tv23.setTextSize(20);
        tv24.setTextSize(19);

        tv31.setTextSize(22);
        tv32.setTextSize(21);
        tv33.setTextSize(20);
        tv34.setTextSize(19);

        tv41.setTextSize(22);
        tv42.setTextSize(21);
        tv43.setTextSize(20);
        tv44.setTextSize(19);

    }

    private void oneTextCnt() {

        tv11.setTextSize(22);
        tv12.setTextSize(22);
        tv13.setTextSize(22);
        tv14.setTextSize(22);

        tv21.setTextSize(21);
        tv22.setTextSize(21);
        tv23.setTextSize(21);
        tv24.setTextSize(21);

        tv31.setTextSize(20);
        tv32.setTextSize(20);
        tv33.setTextSize(20);
        tv34.setTextSize(20);

        tv41.setTextSize(19);
        tv42.setTextSize(19);
        tv43.setTextSize(19);
        tv44.setTextSize(19);

    }

    private void defaultTextCnt() {

        tv11.setTextSize(18);
        tv12.setTextSize(18);
        tv13.setTextSize(18);
        tv14.setTextSize(18);

        tv21.setTextSize(18);
        tv22.setTextSize(18);
        tv23.setTextSize(18);
        tv24.setTextSize(18);

        tv31.setTextSize(18);
        tv32.setTextSize(18);
        tv33.setTextSize(18);
        tv34.setTextSize(18);

        tv41.setTextSize(18);
        tv42.setTextSize(18);
        tv43.setTextSize(18);
        tv44.setTextSize(18);

    }


    /*

    Setting Up The Color Combinations Below.

    */

    private void sixteenCnt() {

        tv11.setBackgroundColor(Color.parseColor("#333333"));
        tv12.setBackgroundColor(Color.parseColor("#333333"));
        tv13.setBackgroundColor(Color.parseColor("#333333"));
        tv14.setBackgroundColor(Color.parseColor("#333333"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#3f51b5"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#333333"));
        tv42.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv43.setBackgroundColor(Color.parseColor("#333333"));
        tv44.setBackgroundColor(Color.parseColor("#3f51b5"));

    }

    private void fifteenCnt() {

        tv11.setBackgroundColor(Color.parseColor("#333333"));
        tv12.setBackgroundColor(Color.parseColor("#333333"));
        tv13.setBackgroundColor(Color.parseColor("#333333"));
        tv14.setBackgroundColor(Color.parseColor("#333333"));

        tv21.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv42.setBackgroundColor(Color.parseColor("#333333"));
        tv43.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv44.setBackgroundColor(Color.parseColor("#333333"));

    }

    private void fourteenCnt() {

        tv11.setBackgroundColor(Color.parseColor("#333333"));
        tv12.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv13.setBackgroundColor(Color.parseColor("#333333"));
        tv14.setBackgroundColor(Color.parseColor("#3f51b5"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#3f51b5"));

        tv41.setBackgroundColor(Color.parseColor("#333333"));
        tv42.setBackgroundColor(Color.parseColor("#333333"));
        tv43.setBackgroundColor(Color.parseColor("#333333"));
        tv44.setBackgroundColor(Color.parseColor("#333333"));

    }

    private void thirteenCnt() {

        tv11.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv12.setBackgroundColor(Color.parseColor("#333333"));
        tv13.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv14.setBackgroundColor(Color.parseColor("#333333"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#333333"));
        tv42.setBackgroundColor(Color.parseColor("#333333"));
        tv43.setBackgroundColor(Color.parseColor("#333333"));
        tv44.setBackgroundColor(Color.parseColor("#333333"));

    }

    private void twelveCnt() {

        tv11.setBackgroundColor(Color.parseColor("#333333"));
        tv12.setBackgroundColor(Color.parseColor("#333333"));
        tv13.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv14.setBackgroundColor(Color.parseColor("#3f51b5"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#333333"));
        tv42.setBackgroundColor(Color.parseColor("#333333"));
        tv43.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv44.setBackgroundColor(Color.parseColor("#3f51b5"));

    }

    private void elevenCnt() {

        tv11.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv12.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv13.setBackgroundColor(Color.parseColor("#333333"));
        tv14.setBackgroundColor(Color.parseColor("#333333"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv42.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv43.setBackgroundColor(Color.parseColor("#333333"));
        tv44.setBackgroundColor(Color.parseColor("#333333"));

    }

    private void tenCnt() {

        tv11.setBackgroundColor(Color.parseColor("#333333"));
        tv12.setBackgroundColor(Color.parseColor("#333333"));
        tv13.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv14.setBackgroundColor(Color.parseColor("#333333"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#3f51b5"));

        tv31.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#333333"));
        tv42.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv43.setBackgroundColor(Color.parseColor("#333333"));
        tv44.setBackgroundColor(Color.parseColor("#333333"));

    }

    private void nineCnt() {

        tv11.setBackgroundColor(Color.parseColor("#333333"));
        tv12.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv13.setBackgroundColor(Color.parseColor("#333333"));
        tv14.setBackgroundColor(Color.parseColor("#333333"));

        tv21.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#3f51b5"));

        tv41.setBackgroundColor(Color.parseColor("#333333"));
        tv42.setBackgroundColor(Color.parseColor("#333333"));
        tv43.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv44.setBackgroundColor(Color.parseColor("#333333"));

    }

    private void eightCnt() {

        tv11.setBackgroundColor(Color.parseColor("#333333"));
        tv12.setBackgroundColor(Color.parseColor("#333333"));
        tv13.setBackgroundColor(Color.parseColor("#333333"));
        tv14.setBackgroundColor(Color.parseColor("#333333"));

        tv21.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#3f51b5"));

        tv31.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#3f51b5"));

        tv41.setBackgroundColor(Color.parseColor("#333333"));
        tv42.setBackgroundColor(Color.parseColor("#333333"));
        tv43.setBackgroundColor(Color.parseColor("#333333"));
        tv44.setBackgroundColor(Color.parseColor("#333333"));

    }

    private void sevenCnt() {

        tv11.setBackgroundColor(Color.parseColor("#333333"));
        tv12.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv13.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv14.setBackgroundColor(Color.parseColor("#333333"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#333333"));
        tv42.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv43.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv44.setBackgroundColor(Color.parseColor("#333333"));

    }

    private void sixCnt() {

        tv11.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv12.setBackgroundColor(Color.parseColor("#333333"));
        tv13.setBackgroundColor(Color.parseColor("#333333"));
        tv14.setBackgroundColor(Color.parseColor("#3f51b5"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv42.setBackgroundColor(Color.parseColor("#333333"));
        tv43.setBackgroundColor(Color.parseColor("#333333"));
        tv44.setBackgroundColor(Color.parseColor("#3f51b5"));

    }

    private void fiveCnt() {

        tv11.setBackgroundColor(Color.parseColor("#333333"));
        tv12.setBackgroundColor(Color.parseColor("#333333"));
        tv13.setBackgroundColor(Color.parseColor("#333333"));
        tv14.setBackgroundColor(Color.parseColor("#333333"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv23.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv33.setBackgroundColor(Color.parseColor("#3f51b5"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#333333"));
        tv42.setBackgroundColor(Color.parseColor("#333333"));
        tv43.setBackgroundColor(Color.parseColor("#333333"));
        tv44.setBackgroundColor(Color.parseColor("#333333"));

    }

    private void fourCnt() {

        tv11.setBackgroundColor(Color.parseColor("#ffeb3b"));
        tv12.setBackgroundColor(Color.parseColor("#ffeb3b"));
        tv13.setBackgroundColor(Color.parseColor("#ffc107"));
        tv14.setBackgroundColor(Color.parseColor("#ffc107"));

        tv21.setBackgroundColor(Color.parseColor("#ffeb3b"));
        tv22.setBackgroundColor(Color.parseColor("#ffeb3b"));
        tv23.setBackgroundColor(Color.parseColor("#ffc107"));
        tv24.setBackgroundColor(Color.parseColor("#ffc107"));

        tv31.setBackgroundColor(Color.parseColor("#ff9800"));
        tv32.setBackgroundColor(Color.parseColor("#ff9800"));
        tv33.setBackgroundColor(Color.parseColor("#ff5722"));
        tv34.setBackgroundColor(Color.parseColor("#ff5722"));

        tv41.setBackgroundColor(Color.parseColor("#ff9800"));
        tv42.setBackgroundColor(Color.parseColor("#ff9800"));
        tv43.setBackgroundColor(Color.parseColor("#ff5722"));
        tv44.setBackgroundColor(Color.parseColor("#ff5722"));

    }

    private void threeCnt() {

        tv11.setBackgroundColor(Color.parseColor("#cfd8dc"));
        tv12.setBackgroundColor(Color.parseColor("#333333"));
        tv13.setBackgroundColor(Color.parseColor("#333333"));
        tv14.setBackgroundColor(Color.parseColor("#607d8b"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#cfd8dc"));
        tv23.setBackgroundColor(Color.parseColor("#607d8b"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#607d8b"));
        tv33.setBackgroundColor(Color.parseColor("#cfd8dc"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#607d8b"));
        tv42.setBackgroundColor(Color.parseColor("#333333"));
        tv43.setBackgroundColor(Color.parseColor("#333333"));
        tv44.setBackgroundColor(Color.parseColor("#cfd8dc"));

    }

    private void twoCnt() {

        tv11.setBackgroundColor(Color.parseColor("#880e4f"));
        tv12.setBackgroundColor(Color.parseColor("#c2185b"));
        tv13.setBackgroundColor(Color.parseColor("#e91e63"));
        tv14.setBackgroundColor(Color.parseColor("#f06292"));

        tv21.setBackgroundColor(Color.parseColor("#880e4f"));
        tv22.setBackgroundColor(Color.parseColor("#c2185b"));
        tv23.setBackgroundColor(Color.parseColor("#e91e63"));
        tv24.setBackgroundColor(Color.parseColor("#f06292"));

        tv31.setBackgroundColor(Color.parseColor("#880e4f"));
        tv32.setBackgroundColor(Color.parseColor("#c2185b"));
        tv33.setBackgroundColor(Color.parseColor("#e91e63"));
        tv34.setBackgroundColor(Color.parseColor("#f06292"));

        tv41.setBackgroundColor(Color.parseColor("#880e4f"));
        tv42.setBackgroundColor(Color.parseColor("#c2185b"));
        tv43.setBackgroundColor(Color.parseColor("#e91e63"));
        tv44.setBackgroundColor(Color.parseColor("#f06292"));

    }

    private void oneCnt() {

        tv11.setBackgroundColor(Color.parseColor("#4a148c"));
        tv12.setBackgroundColor(Color.parseColor("#4a148c"));
        tv13.setBackgroundColor(Color.parseColor("#4a148c"));
        tv14.setBackgroundColor(Color.parseColor("#4a148c"));

        tv21.setBackgroundColor(Color.parseColor("#7b1fa2"));
        tv22.setBackgroundColor(Color.parseColor("#7b1fa2"));
        tv23.setBackgroundColor(Color.parseColor("#7b1fa2"));
        tv24.setBackgroundColor(Color.parseColor("#7b1fa2"));

        tv31.setBackgroundColor(Color.parseColor("#9c27b0"));
        tv32.setBackgroundColor(Color.parseColor("#9c27b0"));
        tv33.setBackgroundColor(Color.parseColor("#9c27b0"));
        tv34.setBackgroundColor(Color.parseColor("#9c27b0"));

        tv41.setBackgroundColor(Color.parseColor("#ba68c8"));
        tv42.setBackgroundColor(Color.parseColor("#ba68c8"));
        tv43.setBackgroundColor(Color.parseColor("#ba68c8"));
        tv44.setBackgroundColor(Color.parseColor("#ba68c8"));

    }

    private void defaultCnt() {

        tv11.setBackgroundColor(Color.parseColor("#333333"));
        tv12.setBackgroundColor(Color.parseColor("#333333"));
        tv13.setBackgroundColor(Color.parseColor("#333333"));
        tv14.setBackgroundColor(Color.parseColor("#333333"));

        tv21.setBackgroundColor(Color.parseColor("#333333"));
        tv22.setBackgroundColor(Color.parseColor("#333333"));
        tv23.setBackgroundColor(Color.parseColor("#333333"));
        tv24.setBackgroundColor(Color.parseColor("#333333"));

        tv31.setBackgroundColor(Color.parseColor("#333333"));
        tv32.setBackgroundColor(Color.parseColor("#333333"));
        tv33.setBackgroundColor(Color.parseColor("#333333"));
        tv34.setBackgroundColor(Color.parseColor("#333333"));

        tv41.setBackgroundColor(Color.parseColor("#333333"));
        tv42.setBackgroundColor(Color.parseColor("#333333"));
        tv43.setBackgroundColor(Color.parseColor("#333333"));
        tv44.setBackgroundColor(Color.parseColor("#333333"));

    }

}
