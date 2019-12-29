package com.example.explorersappv5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bLogin;
    EditText etUsername, etPassword;
    TextView tForgot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tForgot = (TextView) findViewById(R.id.tForgot);

        bLogin.setOnClickListener(this);
        tForgot.setOnClickListener(this);

    }





    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogin:

                break;

            case R.id.tForgot:

                break;
        }

    }
}
