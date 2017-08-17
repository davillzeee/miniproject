package com.example.user.spuhome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ImageView logo1 = (ImageView) findViewById(R.id.logo1);
        logo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(RegisterActivity.this,MapDisplayActivity.class);
                s.putExtra("MapImage",R.drawable.itspu);
                startActivity(s);
            }
        });

        ImageView logo2 = (ImageView) findViewById(R.id.logo2);
        logo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(RegisterActivity.this,MapDisplayActivity.class);
                s.putExtra("MapImage",R.drawable.aritecture);
                startActivity(s);
            }
        });
    }
}
