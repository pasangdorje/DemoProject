package com.example.acer.demoproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Acer on 4/22/2019.
 */

public class register extends AppCompatActivity{
    Button registerBtn;
    EditText nameEditText,addressEditText,unameEditText,pwEditText;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initialize();
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void initialize() {
        registerBtn = (Button) findViewById(R.id.registerButton);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        addressEditText = (EditText) findViewById(R.id.addressEditText);
        unameEditText = (EditText) findViewById(R.id.unameEditText);
        pwEditText = (EditText) findViewById(R.id.pwEditText);

    }
}
