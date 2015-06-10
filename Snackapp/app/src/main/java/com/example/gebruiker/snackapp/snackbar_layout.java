package com.example.gebruiker.snackapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class snackbar_layout extends ActionBarActivity {

    RelativeLayout AchterSnack;
    Button route1, route2, route3, route4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar_layout);

        AchterSnack = (RelativeLayout) findViewById(R.id.AchterSnack);
        route1 = (Button) findViewById(R.id.route1);
        route2 = (Button) findViewById(R.id.route2);
        route3 = (Button) findViewById(R.id.route3);
        route4 = (Button) findViewById(R.id.route4);

        route1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View S) {
                // click code
                Intent intent = new Intent("com.example.MapPane");
                startActivity(intent);
            }
        });{

        }

        route2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View T) {
                // click code
                Intent intent2 = new Intent("com.example.MapPane");
                startActivity(intent2);
            }
        });

        route3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View I) {
                // click code
                Intent intent3 = new Intent("com.example.MapPane");
                startActivity(intent3);
            }
        });

        route4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View I) {
                // click code
                Intent intent3 = new Intent("com.example.MapPane");
                startActivity(intent3);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
