package com.example.cwww;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final EditText x = findViewById(R.id.editTextTextPersonName);
        final EditText y = findViewById(R.id.editTextTextPersonName2);
        
    }
}