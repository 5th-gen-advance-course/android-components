package com.example.ratha.componentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ratha.componentdemo.service.MusicService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startService(View view) {
        Intent intent =new Intent(this, MusicService.class);
        startService(intent);
    }

    public void stopService(View view) {
        Intent intent =new Intent(this, MusicService.class);
        stopService(intent);
    }
}
