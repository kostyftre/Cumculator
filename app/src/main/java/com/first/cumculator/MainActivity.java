package com.first.cumculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_minus;
    private Button button_plus;
    private Button button_div;
    private Button button_mult;
    private Button button_del;
    private Button button_total;
    private String all;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        show();


    }

    private int superCalculator(String all){
        Calculator calculator = new Calculator();

        return calculator.result(all);

    }

    private void init(){
        textView = findViewById(R.id.textView);
        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_minus = findViewById(R.id.button_minus);
        button_plus = findViewById(R.id.button_plus);
        button_div = findViewById(R.id.button_div);
        button_mult = findViewById(R.id.button_mult);
        button_del = findViewById(R.id.button_del);
        button_total = findViewById(R.id.button_total);
        all="";
    }



    private void show(){
        button_0.setOnClickListener(v -> {
           all=all+"0";

           textView.setText(all);
        });

        button_1.setOnClickListener(v -> {
            all=all+"1";
            textView.setText(all);
        });

        button_2.setOnClickListener(v -> {
            all=all+"2";
            textView.setText(all);
        });
        button_3.setOnClickListener(v -> {
            all=all+"3";
            textView.setText(all);
        });
        button_4.setOnClickListener(v -> {
            all=all+"4";
            textView.setText(all);
        });
        button_5.setOnClickListener(v -> {
            all=all+"5";
            textView.setText(all);
        });
        button_6.setOnClickListener(v -> {
            all=all+"6";
            textView.setText(all);
        });

        button_7.setOnClickListener(v -> {
            all=all+"7";
            textView.setText(all);
        });
        button_8.setOnClickListener(v -> {
            all=all+"8";
            textView.setText(all);
        });
        button_9.setOnClickListener(v -> {
            all=all+"9";
            textView.setText(all);
        });

        button_minus.setOnClickListener(v -> {
            if (all==""){

            }
            else all=all+"-";
            textView.setText(all);
        });
        button_plus.setOnClickListener(v -> {
            if (all==""){

            }
            else all=all+"+";
            textView.setText(all);
        });
        button_mult.setOnClickListener(v -> {
            if (all==""){

            }
            else all=all+"*";
            textView.setText(all);
        });
        button_div.setOnClickListener(v -> {
            if (all==""){

            }
            else all=all+"/";
            textView.setText(all);
        });
        button_del.setOnClickListener(v -> {
            all="";
            textView.setText(all);
        });

        button_total.setOnClickListener(v -> {

            int a=superCalculator(all);

            all= ""+a;
           textView.setText(all);


        });



    }
}