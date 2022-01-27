package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editText;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, " Submit Successfully ... ", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205 * kg;
//                textView2.setText( kg +"Kg = " + pound + " Pound");
//
//            }
//        });

    }

    public void calculate(View view) {
        Toast.makeText(MainActivity.this, "You Are Submit Successfully ...", Toast.LENGTH_SHORT).show();
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = kg * 2.205;
        textView2.setText( kg + "Kg = " + pound + " Pound");
    }
}