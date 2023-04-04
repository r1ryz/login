package com.example.a121212121;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TripActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip);

    }

    public void onCalcClick(View view) {
        EditText triA = (EditText) findViewById(R.id.etA);
        EditText triB = (EditText) findViewById(R.id.etB);
        EditText triC = (EditText) findViewById(R.id.etC);

        int P = Integer.parseInt(triA.getText().toString()) + Integer.parseInt(triB.getText().toString()) + Integer.parseInt(triC.getText().toString());

        String StrP = Integer.toString(P);
        TextView result = (TextView) findViewById(R.id.twResult);
        result.setText(StrP);
    }
    public void onBackClick(View view) {
        Intent onCreate = new Intent(this, Activity_menu.class);
        startActivity(onCreate);
    }

}