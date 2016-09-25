package com.ihdn.bici;
/**
 * Created by root on 24/09/16.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MyMapFragment extends Fragment implements OnMapReadyCallback {

    double latitud = 0;
    double longitud = 0;

    public MyMapFragment() {
    }

    public MyMapFragment(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gmaps, container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MapFragment fragment = (MapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng marker = new LatLng(latitud, longitud);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker, 13));
        googleMap.addMarker(new MarkerOptions().title("Hello Google Maps!").position(marker));
    }
}