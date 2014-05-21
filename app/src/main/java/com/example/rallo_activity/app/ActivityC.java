package com.example.rallo_activity.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

//import java.lang.Exception;
public class ActivityC extends ActivityRallosa {
    EditText resultText;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        resultText = (EditText) findViewById(R.id.resultText);
        //resultText.setText();
        //ActivityMain.class;
        //Toast.makeText(this, ActivityMain.class.toString(), Toast.LENGTH_LONG).show();
    }
    public void onBackPressed() {
        Log.i(super.LOG_I_TEG, this.getLocalClassName() + ".onBackPressed()");
        Intent main = new Intent(this, ActivityMain.class);
        EditText oEditText = (EditText) findViewById(R.id.resultText);
        //Log.i("rallo_activity", "rallosa+onBackPress C:  " + oEditText.getText().toString());
        main.putExtra("resultText", oEditText.getText().toString());
        setResult(RESULT_OK, main);
        super.onBackPressed();
    }

}
