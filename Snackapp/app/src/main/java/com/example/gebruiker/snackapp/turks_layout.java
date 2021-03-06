package com.example.gebruiker.snackapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Gebruiker on 27-5-2015.
 */
public class turks_layout extends ActionBarActivity {

    double X;
    double Y;
    String Naam;
    String Adres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turks_layout);
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

    //Open map and ad specific location marker
    public void Troute1 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.920651;
        Y = 4.469585;
        Naam = "HAS";
        Adres = "West Kruiskade 25b";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    public void Troute2 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.921676;
        Y = 4.478911;
        Naam = "HAS";
        Adres = "Coolsingel 87d";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    public void Troute3 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.922903;
        Y = 4.497529;
        Naam = "HAS";
        Adres = "Oostplein 225";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    public void Troute4 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.913202;
        Y = 4.485013;
        Naam = "Mozaik";
        Adres = "Boompjes 543";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    public void Troute5 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.923688;
        Y = 4.478725;
        Naam = "MAC El Aviv";
        Adres = "Coolsingel 4c";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    public void Troute6 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.917321;
        Y = 4.472657;
        Naam = "MAC El Aviv";
        Adres = "Hermesplantsoen 3";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    public void Troute7 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.920554;
        Y = 4.489619;
        Naam = "Istanbul";
        Adres = "Rijstuin 174";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    public void Troute8 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.914577;
        Y = 4.48247;
        Naam = "Manzara Cafe";
        Adres = "Leuvehaven 65";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    public void Troute9 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.915969;
        Y = 4.479012;
        Naam = "Bazar";
        Adres = "Witte de Withstraat 16";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    public void Troute10 (View view) {
        Intent i = new Intent(getApplicationContext(),MapPane.class);
        X = 51.922188;
        Y = 4.477636;
        Naam = "Mr. Michael";
        Adres = "Stadhuisplein 20";
        i.putExtra("lat",X);
        i.putExtra("long",Y);
        i.putExtra("Naam",Naam);
        i.putExtra("Adres",Adres);
        startActivity(i);
    }

    //Pop Ups

    public void PopUp1 (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("West Kruiskade 25b\n" +
                        "Openingstijden:\n" +
                        ("Zo-Do: 12:00 - 1:00\n" +
                                "Vr-Za: 12:00 - 2:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void PopUp2 (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Coolsingel 87d\n" +
                        "Openingstijden:\n" +
                        ("Elke dag: 12:00 - 6:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void PopUp3 (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Oostplein 225\n" +
                        "Openingstijden:\n" +
                        ("Elke dag: 12:00 - 6:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void PopUp4 (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Boompjes 543\n" +
                        "Openingstijden:\n" +
                        ("Ma: Gesloten\n" +
                                "Di-Do: 14:00 - 0:00\n" +
                                "Vr-Za: 14:00 - 2:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void PopUp5 (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Coolsingel 4c\n" +
                        "Openingstijden:\n" +
                        ("Zo-Do: 15:00 - 4:30\n" +
                                "Vr-Za: 15:00 - 6:30"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void PopUp6 (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Hermesplantsoen 3\n" +
                        "Openingstijden:\n" +
                        ("Elke dag: 16:00 - 4:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void PopUp7 (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Rijstuin 174\n" +
                        "Openingstijden:\n" +
                        ("Zo-Ma: 16:00 - 22:00\n" +
                                "Di-Do: 16:00 - 0:00" +
                                "Vr-Za: 16:00 - 2:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void PopUp8 (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Leuvehaven 65\n" +
                        "Openingstijden:\n" +
                        ("Zo-Do: 14:00 - 23:00\n" +
                                "Vr-Za: 14:00 - 1:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void PopUp9 (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Witte de Withstraat 16\n" +
                        "Openingstijden:\n" +
                        ("Zo-Do: 17:00 - 23:00\n" +
                                "Vr-Za: 17:00 - 0:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void PopUp10 (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Informatie")
                .setMessage("Stadhuisplein 20\n" +
                        "Openingstijden:\n" +
                        ("Elke dag: 16:00 - 6:00"))
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

}
