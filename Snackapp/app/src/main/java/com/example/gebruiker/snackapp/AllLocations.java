package com.example.gebruiker.snackapp;

import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.example.gebruiker.snackapp.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class AllLocations extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        // Enable MyLocation Layer of Google Map
        mMap.setMyLocationEnabled(true);

        // Get LocationManager object from System Service LOCATION_SERVICE
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        // Create a criteria object to retrieve provider
        Criteria criteria = new Criteria();

        // Get the name of the best provider
        String provider = locationManager.getBestProvider(criteria, true);

        // Get Current Location
        Location myLocation = locationManager.getLastKnownLocation(provider);

        // set map type
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        // Get latitude of the current location
        double latitude = myLocation.getLatitude();

        // Get longitude of the current location
        double longitude = myLocation.getLongitude();

        // Create a LatLng object for the current location
        LatLng latLng = new LatLng(latitude, longitude);

        // Show the current location in Google Map
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        // Zoom in the Google Map
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15));

        //Location markers
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.921886, 4.475662)).title("McDonalds").snippet("Korte Lijnbaan 6"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.917595, 4.47502)).title("McDonalds").snippet("Oude Binnenweg 99"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.918362, 4.480185)).title("McDonalds").snippet("Coolsingel 207"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.919818, 4.480531)).title("McDonalds").snippet("Coolsingel 80"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.921629, 4.479685)).title("McDonalds").snippet("Coolsingel 44"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.92028, 4.483624)).title("McDonalds").snippet("Hoogstraat 194"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.917834, 4.477216)).title("KFC").snippet("Binnenwegplein 68"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.920277, 4.468909)).title("KFC").snippet("West-Kruiskade 46"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.919876, 4.47767)).title("Burger King").snippet("Lijnbaan 100"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.925701, 4.467799)).title("Burger King").snippet("Stationssingel 10"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.920651, 4.469585)).title("HAS").snippet("West Kruiskade 25b"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.921676, 4.478911)).title("HAS").snippet("Coolsingel 87d"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.922903, 4.497529)).title("HAS").snippet("Oostplein 225"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.913202, 4.485013)).title("Mozaik").snippet("Boompjes 543"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.923688, 4.478725)).title("MAC El Aviv").snippet("Coolsingel 4c"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.917321, 4.472657)).title("MAC El Aviv").snippet("Hermesplantsoen 3"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.920554, 4.489619)).title("Istanbul").snippet("Rijstuin 174"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.914577, 4.48247)).title("Manzara Cafe").snippet("Leuvehaven 65"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.915969, 4.479012)).title("Bazar").snippet("Witte de Withstraat 16"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(51.922188, 4.477636)).title("Mr. Michael").snippet("Stadhuisplein 20"));
    }
}