package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button add,sub,mul,div;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnSub);
        mul = (Button)findViewById(R.id.btnMul);
        div = (Button)findViewById(R.id.btnDiv);
        result = (TextView)findViewById(R.id.tvAnswer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                result.setText("Answer: " + String.valueOf(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int diff = number1 - number2;
                result.setText("Answer: " + String.valueOf(diff));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int pro = number1 * number2;
                result.setText("Answer: " + String.valueOf(pro));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int quo = number1 / number2;
                result.setText("Answer: " + String.valueOf(quo));
            }
        });

    }
}