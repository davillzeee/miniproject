package com.example.user.spuhome;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView menuFAB = (ImageView) findViewById(R.id.floatingActionButton); // MAIN MENU
        ImageView registerFAB = (ImageView) findViewById(R.id.floatingActionButton3); // REGSITER MENU
        ImageView locationFAB = (ImageView) findViewById(R.id.floatingActionButton2); // MAP OR LOCATION MENU

        final LinearLayout menuRegisterLayout = (LinearLayout) findViewById(R.id.registerLayout);
        final LinearLayout menuLocationLayout = (LinearLayout) findViewById(R.id.locationLayout);

        final Animation menuShow = AnimationUtils.loadAnimation(MainActivity.this,R.anim.show_menu);
        final Animation menuHide = AnimationUtils.loadAnimation(MainActivity.this,R.anim.hide_menu);

        final Animation showLayout = AnimationUtils.loadAnimation(MainActivity.this,R.anim.show_layout);
        final Animation hideLayout = AnimationUtils.loadAnimation(MainActivity.this,R.anim.hide_layout);

        menuFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (menuRegisterLayout.getVisibility() == View.GONE && menuLocationLayout.getVisibility() == View.GONE) {
                    menuRegisterLayout.setVisibility(View.VISIBLE);
                    menuLocationLayout.setVisibility(View.VISIBLE);
                    menuRegisterLayout.startAnimation(showLayout);
                    menuLocationLayout.startAnimation(showLayout);
                    menuFAB.startAnimation(menuShow);
                } else {
                    menuRegisterLayout.setVisibility(View.GONE);
                    menuLocationLayout.setVisibility(View.GONE);
                    menuRegisterLayout.startAnimation(hideLayout);
                    menuLocationLayout.startAnimation(hideLayout);
                    menuFAB.startAnimation(menuHide);
                }
            }
        });

        registerFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

        locationFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(i);
            }
        });
    }
}
