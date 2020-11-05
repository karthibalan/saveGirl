package com.example.powerpress;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static int i=0;
    TextView z;
    Location a;
    double ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        z=findViewById(R.id.text);
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_VOLUME_UP) {
            i++;
            if(i==3){
                ab=a.getLatitude();
               // double bc = a.getLongitude();
                z.setText(String.valueOf(ab));
                //Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();

            i=0;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
}