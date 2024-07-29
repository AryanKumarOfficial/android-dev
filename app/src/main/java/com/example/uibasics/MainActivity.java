package com.example.uibasics;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onHelloButtonClick(View view) {
        TextView welcomeText = findViewById(R.id.txtWelcome);
        welcomeText.setText(R.string.new_greet);
    }

}
