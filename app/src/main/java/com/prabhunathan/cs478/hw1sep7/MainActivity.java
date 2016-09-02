package com.prabhunathan.cs478.hw1sep7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Prabhunathan Gnanasekaran was here !!");
        setContentView(R.layout.activity_main);
    }
}
