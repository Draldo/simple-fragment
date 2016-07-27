package com.example.admin.simplefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.container) != null){
            if (savedInstanceState != null) {
                return;
            }

            BlankFragment fragment = new BlankFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.container,fragment).commit();
        }
    }
}
