package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtFirstNumber, edtSecondNumber;
    private Button btnAdd, btnSub, btnMul, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtFirstNumber = findViewById(R.id.first_number);
        edtSecondNumber = findViewById(R.id.second_number);
        btnAdd = findViewById(R.id.add);
        btnSub = findViewById(R.id.sub);
        btnMul = findViewById(R.id.mul);
        btnDiv = findViewById(R.id.div);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String firstNumber = edtFirstNumber.getText().toString();
                    String secondNumber = edtSecondNumber.getText().toString();
                    Double result = Double.valueOf(firstNumber) + Double.valueOf(secondNumber);
                    Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNumber = edtFirstNumber.getText().toString();
                String secondNumber = edtSecondNumber.getText().toString();
                Double result = Double.valueOf(firstNumber) - Double.valueOf(secondNumber);
                Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_SHORT).show();
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNumber = edtFirstNumber.getText().toString();
                String secondNumber = edtSecondNumber.getText().toString();
                Double result = Double.valueOf(firstNumber) * Double.valueOf(secondNumber);
                Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_SHORT).show();
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNumber = edtFirstNumber.getText().toString();
                String secondNumber = edtSecondNumber.getText().toString();
                Double result = Double.valueOf(firstNumber) / Double.valueOf(secondNumber);
                Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_SHORT).show();
            }
        });
    }
}