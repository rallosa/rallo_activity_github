package com.example.rallo_activity.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;

public class ActivityMain extends ActivityRallosa implements View.OnClickListener {
    Button buttonA;
    Button buttonB;
    Button buttonC;
    EditText resultText;

    static final int PICK_CONTACT_REQUEST_A = 1;
    static final int PICK_CONTACT_REQUEST_B = 2;
    static final int PICK_CONTACT_REQUEST_C = 3;
//    static final int PICK_CONTACT_REQUEST_A = com.example.rallo_activity.app.ActivityA.class.hashCode();
//    static final int PICK_CONTACT_REQUEST_B = com.example.rallo_activity.app.ActivityB.class.hashCode();
//    static final int PICK_CONTACT_REQUEST_C = com.example.rallo_activity.app.ActivityC.class.hashCode();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);
        resultText = (EditText) findViewById(R.id.resultText);

    }

    public void onButtonAClick(View view) {
        Intent intentA = new Intent(this, com.example.rallo_activity.app.ActivityA.class);
        startActivity(intentA);
    }
    public void onButtonBClick(View view) {
        Intent intentB = new Intent(this, com.example.rallo_activity.app.ActivityB.class);
        startActivity(intentB);
    }
    public void onButtonCClick(View view) {
        Intent intent = new Intent(this, ActivityC.class);
        String defaultText = resultText.getText().toString();
        intent.putExtra("defaultText", defaultText);
        //startActivity(intent);
        startActivityForResult(intent, ActivityMain.PICK_CONTACT_REQUEST_C);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        } else if ( resultCode == RESULT_OK ) {
            EditText oEditText = (EditText) findViewById(R.id.resultText);
            String resultText = data.getStringExtra("resultText");
            Log.i(super.LOG_I_TEG, " onActivityResult:  " + resultText);
            oEditText.setText(resultText);
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }
}
