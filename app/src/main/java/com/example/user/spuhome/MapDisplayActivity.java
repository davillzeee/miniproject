package com.example.user.spuhome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MapDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_display);

        ImageView Mlocation = (ImageView) findViewById(R.id.MapDisplay);
        Mlocation.setImageResource(getIntent().getIntExtra("MapImage",0));
    }
}
