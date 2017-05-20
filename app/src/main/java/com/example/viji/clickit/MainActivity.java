package com.example.viji.clickit;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8;
    EditText e1, e2;
    int n = 0;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (ImageButton) findViewById(R.id.btn1);
        b2 = (ImageButton) findViewById(R.id.btn2);
        b3 = (ImageButton) findViewById(R.id.btn3);
        b4 = (ImageButton) findViewById(R.id.btn4);
        b5 = (ImageButton) findViewById(R.id.btn5);
        b6 = (ImageButton) findViewById(R.id.btn6);
        b7 = (ImageButton) findViewById(R.id.btn7);
        b8 = (ImageButton) findViewById(R.id.btn8);

    }

    public void startRand(View view) {
        randomNumber(1,8);
        n = randomNumber(1,8);

        if (n == 1) {
            b1.setImageResource(R.drawable.cute1);

        } else if (n == 2)

        {
            b2.setImageResource(R.drawable.cute1);
        }
        else if (n == 3)

        {
            b3.setImageResource(R.drawable.cute1);
        }
        else if (n == 4)

        {
            b4.setImageResource(R.drawable.cute1);
        }
        else if (n == 5)

        {
            b5.setImageResource(R.drawable.cute1);
        }
        else if (n == 6)

        {
            b6.setImageResource(R.drawable.cute1);
        }
        else if (n == 7)

        {
            b7.setImageResource(R.drawable.cute1);
        }
        else if (n == 8)

        {
            b8.setImageResource(R.drawable.cute1);
        }

    }
    public int randomNumber(int a, int b) {
        rnd = new Random();
        int n = rnd.nextInt(8) + 1;
        return n;
    }
}