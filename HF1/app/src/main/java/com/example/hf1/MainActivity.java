package com.example.hf1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        EditText numb1=findViewById(R.id.nr1);
        EditText numb2=findViewById(R.id.nr2);
        TextView result=findViewById(R.id.result);
        Button sum=findViewById(R.id.sum);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(numb1.getText().toString());
                double number2 = Double.parseDouble(numb2.getText().toString());
                double sumResult = number1 + number2;

                result.setText(String.valueOf(sumResult));
            }
        });
        Button deduct=findViewById(R.id.deduct);
        deduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(numb1.getText().toString());
                double number2 = Double.parseDouble(numb2.getText().toString());
                double sumResult = number1 - number2;

                result.setText(String.format("%,.2f",sumResult));
            }
        });
        Button multiply=findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(numb1.getText().toString());
                double number2 = Double.parseDouble(numb2.getText().toString());
                double sumResult = number1 * number2;

                result.setText(String.format("%,.2f",sumResult));
            }
        });
        Button divide=findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(numb1.getText().toString());
                double number2 = Double.parseDouble(numb2.getText().toString());
                double sumResult = number1 / number2;

                result.setText(String.format("%,.2f",sumResult));
            }
        });

    }
}