package com.wordpress.swarajsaaj.app.notificationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by swarajpal on 06-03-2016.
 */
public class MainActivity extends AppCompatActivity {


    private final String TAG = this.getLocalClassName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"Creating token");
        Intent intent = new Intent(this, RegisterationService.class);
        startService(intent);
    }
}
