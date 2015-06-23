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


public class snackbar_layout extends ActionBarActivity {

    RelativeLayout AchterSnack;
    double X;
    double Y;
    String Naam;
    String Adres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar_layout);

        AchterSnack = (RelativeLayout) findViewById(R.id.AchterSnack);
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

    public void Sroute1 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.921886;
        Y = 4.475662;
        Naam = "McDonalds";
        Adres = "Korte Lijnbaan 6";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }
    public void Sroute2 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.917595;
        Y = 4.47502;
        Naam = "McDonalds";
        Adres = "Oude Binnenweg 99";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }
    public void Sroute3 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.918362;
        Y = 4.480185;
        Naam = "McDonalds";
        Adres = "Coolsingel 207";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }
    public void Sroute4 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.919818;
        Y = 4.480531;
        Naam = "McDonalds";
        Adres = "Coolsingel 80";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }
    public void Sroute5 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.921629;
        Y = 4.479685;
        Naam = "McDonalds";
        Adres = "Coolsingel 44";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }
    public void Sroute6 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.92028;
        Y = 4.483624;
        Naam = "McDonalds";
        Adres = "Hoogstraat 194";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }
    public void Sroute7 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.917834;
        Y = 4.477216;
        Naam = "KFC";
        Adres = "Binnenwegplein 68";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }
    public void Sroute8 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.920277;
        Y = 4.468909;
        Naam = "KFC";
        Adres = "West-Kruiskade 46";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }
    public void Sroute9 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.919876;
        Y = 4.47767;
        Naam = "Burger King";
        Adres = "Lijnbaan 100";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }
    public void Sroute10 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.925701;
        Y = 4.467799;
        Naam = "Burger King";
        Adres = "Stationssingel 10";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    public void sPopUp1(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Korte Lijnbaan 6\n" +
                        "Openingstijden:\n" +
                        ("Zo-Do: 16:00 - 6:00\n" +
                                "Vr-Za: 9:00 - 2:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void sPopUp2(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Oude Binnenweg 99\n" +
                        "Openingstijden:\n" +
                        ("Ma-Do: 9:00 - 0:00\n" +
                                "Vr-Za: 9:00 - 2:00\n" +
                                "Zo: 10:00 - 22:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void sPopUp3(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Coolsingel 207\n" +
                        "Openingstijden:\n" +
                        ("Ma-Di: 7:00 - 0:00\n" +
                                "Wo-Do: 7:00 - 1:00\n" +
                                "Vr-Za: 7:00 - 2:00\n" +
                                "Zo: 9:00 - 0:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

    }

    public void sPopUp4(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Coolsingel 80\n" +
                        "Openingstijden:\n" +
                        ("Ma: 11:00 - 19:00\n" +
                                "Di-Za: 9:30 - 19:00\n" +
                                "Zo: 12:00 - 18:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

    }

    public void sPopUp5(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Coolsingel 44\n" +
                        "Openingstijden:\n" +
                        ("Elke dag: 0:00 - 0:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

    }

    public void sPopUp6(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Hoogstraat 194\n" +
                        "Openingstijden:\n" +
                        ("Ma-Za: 8:00 - 23:00\n" +
                                "Zo: 9:00 - 21:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

    }

    public void sPopUp7(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Binnenwegplein 68\n" +
                        "Openingstijden:\n" +
                        ("Elke dag: 10:00 - 22:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

    }

    public void sPopUp8(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("West-Kruiskade 46\n" +
                        "Openingstijden:\n" +
                        ("Elke dag: 10:00 - 23:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

    }

    public void sPopUp9(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Lijnbaan 100\n" +
                        "Openingstijden:\n" +
                        ("Zo-Wo: 9:00 - 23:00\n" +
                                "Do-Za: 9:00 - 2:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

    }

    public void sPopUp10(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Stationssingel 10\n" +
                        "Openingstijden:\n" +
                        ("Zo-Do: 9:30 - 2:00\n" +
                                "9:30 - 5:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

    }
}
