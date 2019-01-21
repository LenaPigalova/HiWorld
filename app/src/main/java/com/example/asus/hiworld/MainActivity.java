package com.example.asus.hiworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CREATE", "method onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("START", "method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("RESUME", "method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("PAUSE", "method onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("STOP", "method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("DESTROY", "method onDestroy");
    }
}
