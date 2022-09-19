package com.example.pwdgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch incUpperCase;
    Switch incLowerCase;
    Switch incNumbers;
    Switch incSpecialSymbols;
    Button generate;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incLowerCase = (Switch) findViewById(R.id.incLowerCase);
        incUpperCase = (Switch) findViewById(R.id.incUpperCase);
        incNumbers = (Switch) findViewById(R.id.incNumbers);
        incSpecialSymbols = (Switch) findViewById(R.id.incSpecialSymbol);
        generate = (Button) findViewById(R.id.generate);
        textView = (TextView) findViewById(R.id.textView);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Do Whatever");
            }
        });
    }
}