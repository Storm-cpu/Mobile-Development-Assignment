package com.example.nhom01_bai01;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText txtInput;
    TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInput = findViewById(R.id.txtInput);
        txtOutput = findViewById(R.id.txtOutput);
    }

    public void convertCurrency(View view) {
        double vnd = Double.parseDouble(txtInput.getText().toString());
        double usd = vnd / 24000;
        txtOutput.setText(String.valueOf(vnd) + " VND = " + String.valueOf(usd) + " USD");
    }

}