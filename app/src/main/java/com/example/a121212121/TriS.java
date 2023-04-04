package com.example.a121212121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class TriS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tri);
    }
    public void onCalcClick(View view) {
        EditText triA = (EditText) findViewById(R.id.enterA);
        EditText triB = (EditText) findViewById(R.id.enterB);

        int S = Integer.parseInt(triA.getText().toString())/2 * Integer.parseInt(triB.getText().toString());


        String StrP = Integer.toString(S);
        TextView result = (TextView) findViewById(R.id.enterResult);
        result.setText(StrP);
    }
    public void onBackClick(View view) {
        Intent onCreate = new Intent(this, Activity_menu.class);
        startActivity(onCreate);
    }

}