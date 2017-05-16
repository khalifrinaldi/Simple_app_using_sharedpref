package com.po.majuperut;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

                Toast.makeText(LoginActivity.this,"Sorry this feature not ready yet",Toast.LENGTH_LONG).show();

//                 Intent i = new  Intent(LoginActivity.this, MenuActivity.class);
//                        startActivity(i);
                    }
        });
    }
}
