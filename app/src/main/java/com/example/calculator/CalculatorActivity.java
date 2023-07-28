package com.example.calculator;

import static java.lang.Integer.parseInt;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {
    Button addBtn,subBtn,mulBtn,divBtn;
    EditText editText1,editText2,editText3;
    int result,value1,value2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        editText1=findViewById(R.id.edit1);
        editText2=findViewById(R.id.edit2);
        addBtn=findViewById(R.id.add);
        subBtn=findViewById(R.id.subtract);
        mulBtn=findViewById(R.id.multiply);
        divBtn=findViewById(R.id.division);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                editText3=findViewById(R.id.edit3);
                editText3=findViewById(R.id.edit3);
                value1= Integer.parseInt(editText1.getText().toString());
                value2= Integer.parseInt(editText2.getText().toString());
                result=value1+value2;
                String s=String.valueOf(result);
                editText3.setText(s);

            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                editText3=findViewById(R.id.edit3);
                editText3=findViewById(R.id.edit3);
                value1= Integer.parseInt(editText1.getText().toString());
                value2= Integer.parseInt(editText2.getText().toString());
                result=value1-value2;
                String s=String.valueOf(result);
                editText3.setText("value1-value2"+"="+s);

            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                editText3=findViewById(R.id.edit3);
                editText3=findViewById(R.id.edit3);
                value1= Integer.parseInt(editText1.getText().toString());
                value2= Integer.parseInt(editText2.getText().toString());
                result=value1*value2;
                String s=String.valueOf(result);
                editText3.setText(s);

            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                editText3=findViewById(R.id.edit3);
                editText3=findViewById(R.id.edit3);
                value1= Integer.parseInt(editText1.getText().toString());
                value2= Integer.parseInt(editText2.getText().toString());
                result=value1/value2;
                String s=String.valueOf(result);
                editText3.setText("value1/value2 "+"="+s);

            }
        });

    }

}