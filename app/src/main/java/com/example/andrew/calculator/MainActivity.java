package com.example.andrew.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPer;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMult;
    Button buttonDiv;
    Button buttonEq;
    Button buttonC;
    EditText textField;
    float numOne;
    float numTwo;
    boolean addition;
    boolean subtraction;
    boolean multiply;
    boolean division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPer = (Button) findViewById(R.id.buttonPer);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonEq = (Button) findViewById(R.id.buttonEq);
        buttonC = (Button) findViewById(R.id.buttonC);
        textField = (EditText) findViewById(R.id.textField);

        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + "9");
            }
        });

        buttonPer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText(textField.getText() + ".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                numOne = Float.parseFloat(textField.getText() + "");
                addition = true;
                textField.setText(null);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                numOne = Float.parseFloat(textField.getText() + "");
                subtraction = true;
                textField.setText(null);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                numOne = Float.parseFloat(textField.getText() + "");
                multiply = true;
                textField.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                numOne = Float.parseFloat(textField.getText() + "");
                division = true;
                textField.setText(null);
            }
        });

        buttonEq.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                numTwo = Float.parseFloat(textField.getText() + "");
                if(addition){
                    textField.setText(Float.toString(numOne+numTwo));
                    addition = false;
                }
                else if(subtraction){
                    textField.setText(Float.toString(numOne-numTwo));
                    subtraction = false;
                }
                else if(multiply){
                    textField.setText(Float.toString(numOne*numTwo));
                    multiply = false;
                }
                else if(division){
                    textField.setText(Float.toString(numOne/numTwo));
                    division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                textField.setText("");
            }
        });
    }
}
