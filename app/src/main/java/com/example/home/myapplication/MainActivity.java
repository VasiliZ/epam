package com.example.home.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View getToastClk = findViewById(R.id.buttonToast);
        getToastClk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, R.string.hi_epam, Toast.LENGTH_SHORT).show();
    }
}
