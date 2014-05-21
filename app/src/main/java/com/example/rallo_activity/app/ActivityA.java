package com.example.rallo_activity.app;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class ActivityA extends ActivityRallosa {
    Button buttonB;
    Button buttonC;
    static final int PICK_CONTACT_REQUEST_B = 2;
    static final int PICK_CONTACT_REQUEST_C = 3;
//    static final int PICK_CONTACT_REQUEST_B = com.example.rallo_activity.app.ActivityB.class.hashCode();
//    static final int PICK_CONTACT_REQUEST_C = com.example.rallo_activity.app.ActivityC.class.hashCode();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);

    }

    public void onButtonBClick(View view) {
        Intent  intentB = new Intent(this, com.example.rallo_activity.app.ActivityB.class);
        // intentB.putExtra(ActivityB.SOME, 11);
        startActivity(intentB);
    }
    public void onButtonCClick(View view) {
        Intent intentC = new Intent(this, com.example.rallo_activity.app.ActivityC.class);
        startActivity(intentC);
    }

    public void onBackPressed() {
        Log.i(super.LOG_I_TEG, this.getLocalClassName() + ".onBackPressed()");
        super.onBackPressed();
    }
    public void onMyButtonClick(View view)
    {
        // выводим сообщение
        //Toast.makeText();

        Toast.makeText(this, "Зачем вы нажали?", Toast.LENGTH_SHORT).show();
    }
}
