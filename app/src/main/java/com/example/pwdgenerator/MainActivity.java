package com.example.pwdgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch incUpperCase;
    Switch incLowerCase;
    Switch incNumbers;
    Switch incSpecialSymbols;
    SeekBar seekBar;
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
        seekBar = (SeekBar) findViewById(R.id.desiredlength);
        int length = seekBar.getProgress();
        generate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                password Password = new password(seekBar.getProgress(),incLowerCase.isChecked(),incUpperCase.isChecked(),
                        incNumbers.isChecked(),incSpecialSymbols.isChecked());
                textView.setText(Password.getPassword(seekBar.getProgress()));
            }
        });
    }
}