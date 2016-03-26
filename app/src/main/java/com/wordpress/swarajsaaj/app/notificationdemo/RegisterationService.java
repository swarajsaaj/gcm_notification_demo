package com.wordpress.swarajsaaj.app.notificationdemo;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import java.io.IOException;

/**
 * Created by swarajpal on 06-03-2016.
 */
public class RegisterationService extends IntentService {


    public RegisterationService() {
        super("");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        InstanceID instanceID = InstanceID.getInstance(this);
        try {
            String token = instanceID.getToken(getString(R.string.gcm_defaultSenderId),
                    GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
            Log.d("Token",token);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
