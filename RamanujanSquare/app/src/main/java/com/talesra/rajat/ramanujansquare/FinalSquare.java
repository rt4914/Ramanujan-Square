package com.talesra.rajat.ramanujansquare;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
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
                View view = findViewById(R.id.rlouter);
                view = view.getRootView();
                view.setDrawingCacheEnabled(true);

                view.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                        View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));

                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());

                Bitmap bitmap = view.getDrawingCache();

                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);

                if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
                    //we check if external storage is available, otherwise display an error message to the user

                    File sdCard = Environment.getExternalStorageDirectory();
                    File directory = new File (sdCard.getAbsolutePath() + "/Tutorial_ScreenShot");
                    directory.mkdirs();

                    String filename = "screenshot" + i + ".jpg";
                    File yourFile = new File(directory, filename);

                    while (yourFile.exists()) {
                        i++;
                        filename = "screenshot" + i + ".jpg";
                        yourFile = new File(directory, filename);
                    }

                    if (!yourFile.exists()) {
                        if (directory.canWrite())
                        {
                            try {
                                FileOutputStream out = new FileOutputStream(yourFile, true);
                                bitmap.compress(Bitmap.CompressFormat.PNG, 90, out);
                                out.flush();
                                out.close();
                                Toast.makeText(FinalSquare.this, "File exported to /sdcard/Tutorial_ScreenShot/screenshot" + i + ".jpg", Toast.LENGTH_SHORT).show();
                                i++;
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                    }

                }
                else
                {
                    Toast.makeText(FinalSquare.this, "SD Card not available!", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
