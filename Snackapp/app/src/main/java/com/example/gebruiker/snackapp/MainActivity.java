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


public class MainActivity extends ActionBarActivity {

    RelativeLayout AchterHoofd;
    Button ButtonSnack, ButtonTurks, ButtonItaliaans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AchterHoofd = (RelativeLayout) findViewById(R.id.AchterHoofd);
        ButtonSnack = (Button) findViewById(R.id.ButtonSnack);
        ButtonTurks = (Button) findViewById(R.id.ButtonTurks);
        ButtonItaliaans = (Button) findViewById(R.id.ButtonItaliaans);

        ButtonSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View S) {
                // click code
                Intent intent = new Intent("com.example.snackbar_layout");
                startActivity(intent);
            }
        });{

        }

        ButtonTurks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View T) {
                // click code
                Intent intent2 = new Intent("com.example.turks_layout");
                startActivity(intent2);
            }
        });

        ButtonItaliaans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View I) {
                // click code
                Intent intent3 = new Intent("com.example.italiaans_layout");
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
