package com.example.rallo_activity.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ActivityRallosa extends Activity {
    protected final String LOG_I_TEG = "RALLOSA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onCreate()");
    }
    protected void onStart() {
        super.onStart();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onStart()");
    }
    protected void onRestart() {
        super.onRestart();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onRestart()");
    }
    protected void onResume() {
        super.onResume();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onResume()");
    }
    protected void onPause() {
        super.onPause();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onPause()");
    }
    protected void onStop() {
        super.onStop();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onStop()");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onDestroy()");
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onActivityResult()");
    }

}
