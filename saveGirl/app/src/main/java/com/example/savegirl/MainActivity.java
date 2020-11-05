package com.example.savegirl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMobile1;
    //FirebaseAuth mAuth;
   // MainActivity2 a =new MainActivity2();
    FirebaseAuth a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseUser user = a.getInstance().getCurrentUser();
        if(user!=null){
            Intent intent1 = new Intent(MainActivity.this, Home.class);
            startActivity(intent1);
        }

        editTextMobile1 = findViewById(R.id.editTextMobile);

        findViewById(R.id.buttonContinue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile = editTextMobile1.getText().toString().trim();

                /*if(mobile.isEmpty() || mobile.length() < 10){
                    editTextMobile.setError("Enter a valid mobile");
                    editTextMobile.requestFocus();
                    return;
                }*/

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("mobile", mobile);
                startActivity(intent);
            }
        });
    }
}