package com.po.majuperut;

import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView cobatext = (TextView) findViewById(R.id.title_menu);
        final String username = sharedpreferences.getString(Username, "Guest");
        cobatext.setText("Hello " + ", " + username);
    }
}
