package com.po.majuperut;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageButton loginbtn = (ImageButton) findViewById(R.id.login_button);

        final EditText userkey = (EditText) findViewById(R.id.user_field);

        final EditText passkey = (EditText) findViewById(R.id.pass_field);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username = sharedpreferences.getString(Username, null);
                final String passname  = sharedpreferences.getString(Password, null);

                if(userkey.getText().toString().length()==0){
                    userkey.setError("Username not entered");
                    userkey.requestFocus();
                }
                if(passkey.getText().toString().length()==0){
                    passkey.setError("Password not entered");
                    passkey.requestFocus();
                }
                else {
                if(userkey.getText().toString().equals(username) && passkey.getText().toString().equals(passname))
                {

                 Intent i = new  Intent(LoginActivity.this, MenuActivity.class);
                    Toast.makeText(LoginActivity.this, "Success", Toast.LENGTH_LONG).show();
                        startActivity(i);
                    }
                    else {
                    Toast.makeText(LoginActivity.this, "Wrong Username / Password" , Toast.LENGTH_LONG).show();
                }
                }
            }
        });
    }
}
