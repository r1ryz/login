package com.example.a121212121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onLoginClick(View viev){
        Login();
    }
    void Login(){
        Intent menu = new Intent(this, Activity_menu.class);
        EditText etName = (EditText) findViewById(R.id.etName);
        EditText etSurname = (EditText) findViewById(R.id.etSurname);
        String name = etName.getText().toString();
        String surname = etSurname.getText().toString();
        menu.putExtra("Name", name);
        menu.putExtra("Surname", surname);
        startActivity(menu);
    }
}