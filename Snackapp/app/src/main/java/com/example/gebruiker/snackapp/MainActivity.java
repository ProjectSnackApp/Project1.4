package com.example.gebruiker.snackapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AchterHoofd = (RelativeLayout) findViewById(R.id.AchterHoofd);

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

    //All restaurant locations
    public void AllLocations (View view){
        Intent i = new Intent(getApplicationContext(),AllLocations.class);
        startActivity(i);
    }

    //Open snackbar window
    public void SnackbarB (View view) {
        Intent i = new Intent(getApplicationContext(),snackbar_layout.class);
        startActivity(i);
    }

    //Open turks window
    public void TurkB (View view) {
        Intent i = new Intent(getApplicationContext(),turks_layout.class);
        startActivity(i);
    }
}
