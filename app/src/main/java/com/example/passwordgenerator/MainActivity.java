package com.example.passwordgenerator;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.PersistableBundle;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.passwordgenerator.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch incLowerCase;
    Switch incUpperCase;
    Switch incNumbers;
    Switch incSpecialSymbols;
    Button generate;
    TextView textView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        incLowerCase = (Switch) findViewById(R.id.includeLowerCase);
        incUpperCase = (Switch) findViewById(R.id.includeUpperCase);
        incNumbers = (Switch) findViewById(R.id.includeNumbers);
        incSpecialSymbols = (Switch) findViewById(R.id.includeSpecialSymbols);
        textView = (TextView) findViewById(R.id.requestPassword);
        generate = (Button) findViewById(R.id.generate);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}