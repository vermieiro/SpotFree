package com.spotfree.spotfree_app.App.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.spotfree.spotfree_app.R;


public class LoginActivity extends AppCompatActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.login);

        /*getSupportActionBar().hide();*/
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(LoginActivity.this,MinhasMusicasActivity.class);
                startActivity(i);
            }
        });

    }
}
