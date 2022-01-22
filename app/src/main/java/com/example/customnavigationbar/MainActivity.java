package com.example.customnavigationbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawer;
    LinearLayout navigation_container;
    private int draerOpenVal =0;
    RelativeLayout nav_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer = findViewById(R.id.drawer);
        navigation_container=findViewById(R.id.navigation_container);
        nav_bar=findViewById(R.id.nav_bar);

        nav_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(navigation_container);
                draerOpenVal++;
            }
        });

    }
}