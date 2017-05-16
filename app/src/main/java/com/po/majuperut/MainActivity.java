package com.po.majuperut;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MyPREFERENCES = "UserData" ;
    public static final String Username = "userkey";
    public static final String Password = "passname";
    public static final String Email = "emailkey";
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userkey = (EditText) findViewById(R.id.user_field);

        final EditText passname = (EditText) findViewById(R.id.pass_field);

        final EditText emailkey = (EditText) findViewById(R.id.email_field);

        final EditText confpass = (EditText) findViewById(R.id.confirm_pass);

        ImageButton setbutton = (ImageButton) findViewById(R.id.register_button);

        TextView signin = (TextView) findViewById(R.id.login_text);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        setbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(userkey.getText().toString().length()==0){
                    userkey.setError("Username not entered");
                    userkey.requestFocus();
                }
                if(passname.getText().toString().length()==0){
                    passname.setError("Password not entered");
                    passname.requestFocus();
                }
                if(emailkey.getText().toString().length()==0){
                    emailkey.setError("E-Mail not entered");
                    emailkey.requestFocus();
                }
                if(confpass.getText().toString().length()==0){
                    confpass.setError("Confirm your password");
                    confpass.requestFocus();
                }
                else {
                Intent i = new Intent(MainActivity.this, MenuActivity.class);

                String user  = userkey.getText().toString();
                String pass  = passname.getText().toString();
                String email = emailkey.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(Username, user);
                editor.putString(Password, pass);
                editor.putString(Email, email);
                editor.commit();
                startActivity(i);}
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}
