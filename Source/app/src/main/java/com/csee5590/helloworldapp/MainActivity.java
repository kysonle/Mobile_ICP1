package com.csee5590.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Login(View view) {
        EditText usernameCtrl = (EditText)findViewById(R.id.etName);
        EditText passwordCtrl = (EditText) findViewById(R.id.etPassword);
        TextView errorCtrl = (TextView)findViewById(R.id.lblError);
        String userName = usernameCtrl.getText().toString();
        String password = passwordCtrl.getText().toString();


        boolean validationFlag = false;


        // verify if username and password are not empty
        if(!userName.isEmpty() && !password.isEmpty()) {
            if(userName.equals("Le") && password.equals("Admin")) {
                validationFlag = true;
            }
        }
        if(!validationFlag) {
            // display error notice message if the username or password are wrong
            errorCtrl.setVisibility(View.VISIBLE);
        }
        else {
            // direct from login screen to home screen
            Intent direct = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(direct);
        }
    }
}
