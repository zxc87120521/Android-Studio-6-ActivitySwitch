package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity",  "onStart:");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart:");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume:");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause:");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop:");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy:");
    }

    public void B(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}