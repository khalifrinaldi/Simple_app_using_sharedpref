package com.po.majuperut;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView cobatext = (TextView) findViewById(R.id.title_menu);
        final String username = sharedpreferences.getString(Username, "Guest");
        cobatext.setText("Hello " + ", " + username);

        ImageButton searchbtn = (ImageButton) findViewById(R.id.search_button);

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "This Feature under construction", Toast.LENGTH_LONG).show();
            }
        });
    }
}
