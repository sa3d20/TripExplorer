package com.example.tripexplorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Login_btn,SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login_btn = (Button)findViewById(R.id.login_btn);
        SignUp = (Button)findViewById(R.id.signUp);
        Login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisiableLogin(v);

            }
        });
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VisiableSign(v);
            }
        });
    }
    public void VisiableLogin(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
    public void VisiableSign(View view){
        Intent intent = new Intent(this,SignupActivity.class);
        startActivity(intent);
    }
}
