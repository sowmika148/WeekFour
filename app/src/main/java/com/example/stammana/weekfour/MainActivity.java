package com.example.stammana.weekfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view) {
        Intent intent = new Intent(getApplicationContext(), CallActivity.class);
        startActivity(intent);

    }

    public void openWebsite(View view) {
        Toast.makeText(getApplicationContext(), "Not yet developed", Toast.LENGTH_SHORT).show();
    }

    public void sendSMS(View view) {
        Toast.makeText(getApplicationContext(), "Not yet developed", Toast.LENGTH_SHORT).show();
    }
}
