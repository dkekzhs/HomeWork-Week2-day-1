package com.example.myapplication0309;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private  static  final  String TAG = "Dongjae's MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"onCtreate() called!\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume() called!\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onStop() called!\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onstart() called!\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause() called!\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart() called!\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy() called!\n");
    }
}