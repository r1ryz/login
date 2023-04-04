package com.example.a121212121;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Bundle args = getIntent().getExtras();
        String Name = args.get("Name").toString();
        String Surname = args.get("Surname").toString();
        String FullName = Surname + "\n " + Name;



        TextView twName = (TextView) findViewById(R.id.twName);

        twName.setText(FullName);
    }

    public void onBackClick(View view) {
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }

    public void onTriSClick(View view) {
        Intent TriS = new Intent(this, TriS.class);
        startActivity(TriS);
    }

    public void onTriPClick(View view) {
        Intent TriP = new Intent(this, TripActivity.class);
        startActivity(TriP);
    }
}