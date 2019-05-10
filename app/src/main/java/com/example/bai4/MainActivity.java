package com.example.bai4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int backgroundColor;
    private int textColor;

    private CheckBox chkBackground;
    private CheckBox chkTextCorlor;
    private CheckBox chkCenter;

    private RadioButton radOdd;
    private RadioButton radEven;
    private RadioButton radBoth;
    private TextView txtKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkBackground = findViewById(R.id.chkBackground);
        chkTextCorlor = findViewById(R.id.chkTextColor);
        chkCenter = findViewById(R.id.chkCenter);
        radOdd = findViewById(R.id.radOdd);
        radBoth = findViewById(R.id.radBoth);
        radEven = findViewById(R.id.radEven);
        txtKetqua = findViewById(R.id.txtKetqua);
        backgroundColor = Color.WHITE;
        textColor = Color.BLACK;

    }

    public void xulyShowResult(View view) {
        int number = 0;

        if(chkBackground.isChecked()){
            txtKetqua.setBackgroundColor(Color.BLUE);
        }
        else
            txtKetqua.setBackgroundColor(backgroundColor);


        if(chkCenter.isChecked()){
            txtKetqua.setGravity(Gravity.CENTER);
        }
        else
            txtKetqua.setGravity(Gravity.LEFT);


        if(chkTextCorlor.isChecked()){
            txtKetqua.setTextColor(Color.RED);
        }
        else
            txtKetqua.setTextColor(textColor);

        if(radOdd.isChecked()){
            number = (int) (Math.random()*100);
            number = number * 2 +1;
        }

        if(radEven.isChecked()){
            number = (int) (Math.random()*100);
            number *=2;
        }

        if(radBoth.isChecked()){
            number = (int) (Math.random()*100);
        }

        txtKetqua.setText(Integer.toString(number));
    }
}
