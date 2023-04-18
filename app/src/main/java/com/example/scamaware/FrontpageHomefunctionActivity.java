package com.example.scamaware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrontpageHomefunctionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage_home_function);
    }

    public void videreTilListFunktionen (View view){
        Intent intentToFrontpageListFunction = new Intent(this, FrontpageListFunctionActivity.class);
        startActivity(intentToFrontpageListFunction);
    }
}