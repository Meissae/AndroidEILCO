package com.example.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(getLocalClassName());
        EditText username = (EditText)findViewById(R.id.editText1);
        EditText password = (EditText)findViewById(R.id.editText2);


    }
}