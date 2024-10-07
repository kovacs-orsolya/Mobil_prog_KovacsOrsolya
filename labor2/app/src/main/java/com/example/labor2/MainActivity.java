package com.example.labor2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnActTwo;
    TextView textView;
    EditText edtText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnActTwo = findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(intent);
            }
        });
        textView =findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("\n" + textView.getText());
            }
        });
        edtText=findViewById(R.id.edtText);
        Log.d("Statusz", "MainActivity: onCreate()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("txt", textView.getText().toString());
        outState.putString("editTxt", edtText.getText().toString());
        Log.d("Statusz", "MainActivity - onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getString("txt"));
        edtText.setText(savedInstanceState.getString("editTxt"));
        Log.d("Statusz", "MainActivity - onRestoreInstanceState");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz", "MainActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz", "MainActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz", "MainActivity: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz", "MainActivity: onStop()");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Statusz", "MainActivity: onDestroy()");
    }

}