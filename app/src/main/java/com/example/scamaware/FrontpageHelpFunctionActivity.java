package com.example.scamaware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrontpageHelpFunctionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage_help_function);
    }

    public void finishIntroduction(View view){
        Intent intentToFrontPage = new Intent(this,Frontpage.class);
        startActivity(intentToFrontPage);
    }
}