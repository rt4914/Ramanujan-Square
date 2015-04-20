package com.talesra.rajat.ramanujansquare;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FinalSquare extends ActionBarActivity {

    SpannableString s;
    ActionBar bar;

    static String name;

    int i = 0;

    static int a;
    static int b;
    static int c;
    static int d;
    static int sum;

    TextView subheading;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_square);

        subheading = (TextView) findViewById(R.id.subheading);

        s = new SpannableString(name+"Square");
        s.setSpan(new TypefaceSpan(getApplicationContext(), "Dax-Medium.otf"), 0, s.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        s.setSpan(new RelativeSizeSpan(1.2f), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3f51b5")));
        bar.setTitle(s);

        s = new SpannableString("Sum of Selected Boxes = "+sum);
        s.setSpan(new TypefaceSpan(this, "Dax-Medium.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        subheading.setText(s);

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

        subheading.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                boolean sdCard = isSDCardPresent();

                if (sdCard==true)
                {
                    Bitmap bitmap = takeScreenshot();
                    saveBitmap(bitmap);
                    Toast.makeText(FinalSquare.this, "Image Saved to storage.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public static boolean isSDCardPresent() {
        return android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED);
    }

    public Bitmap takeScreenshot() {
        View rootView = findViewById(android.R.id.content).getRootView();
        rootView.setDrawingCacheEnabled(true);
        return rootView.getDrawingCache();
    }

    public void saveBitmap(Bitmap bitmap) {
        File imagePath = new File(Environment.getExternalStorageDirectory() + "/"+name+"Square.png");
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(imagePath);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            Log.e("GREC", e.getMessage(), e);
        } catch (IOException e) {
            Log.e("GREC", e.getMessage(), e);
        }
    }

}