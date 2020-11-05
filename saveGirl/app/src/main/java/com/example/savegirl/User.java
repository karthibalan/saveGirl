package com.example.savegirl;

import android.location.Location;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class User {
    //public Location a;
    //FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser() ;
    String userid;
    public double lat;
    public double log;

    public User(String userid,double lat, double log) {
        this.userid =userid;
        this.lat = lat;
        this.log = log;
    }

    public User() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLog() {
        return log;
    }

    public void setLog(double log) {
        this.log = log;
    }
}
