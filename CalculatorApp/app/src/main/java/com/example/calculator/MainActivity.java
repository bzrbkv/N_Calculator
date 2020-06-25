package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER = "com.example.calculator.EXTRA_NUMBER";
    EditText num1, num2;
    Button plus, minus, divide, multiply;
    int n1,n2;
    float result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);

        plus = (Button) findViewById(R.id.plus_id);
        minus = (Button) findViewById(R.id.minus_id);
        divide = (Button) findViewById(R.id.divide_id);
        multiply = (Button) findViewById(R.id.multiply_id);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                result=n1+n2;
                openActivity2(result);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                result=n1-n2;
                openActivity2(result);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                result=n1*n2;
                openActivity2(result);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                result=n1/n2;
                openActivity2(result);
            }
        });
        System.out.print(result);
    }

    private void openActivity2(float res) {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra(EXTRA_NUMBER, res);
        startActivity(i);
    }
}
