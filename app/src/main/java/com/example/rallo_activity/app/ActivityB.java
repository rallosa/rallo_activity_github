package com.example.rallo_activity.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityB extends ActivityRallosa {
    Button buttonC;
    static final int PICK_CONTACT_REQUEST_C = 3;
//    static final int PICK_CONTACT_REQUEST_C = com.example.rallo_activity.app.ActivityC.class.hashCode();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        buttonC = (Button) findViewById(R.id.buttonC);
    }
    public void onButtonCClick(View view) {
        Intent intentB = new Intent(this, com.example.rallo_activity.app.ActivityC.class);
        startActivityForResult(intentB, PICK_CONTACT_REQUEST_C);
    }
    public void onBackPressed() {
        Log.i(super.LOG_I_TEG, this.getLocalClassName() + ".onBackPressed()");
        super.onBackPressed();
    }

}
