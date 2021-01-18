package com.example.tripexplorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void Back(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void GoProfile (View view){
        Intent intent = new Intent(this,Profile.class);
        startActivity(intent);
    }
}

