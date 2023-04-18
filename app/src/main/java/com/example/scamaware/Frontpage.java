package com.example.scamaware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frontpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage2);
    }

    public void goToChecklist(View view){
        Intent intentToChecklist = new Intent(this, ChecklistActivity.class);
        startActivity(intentToChecklist);
    }

    public void goToIntroduction(View view){
        Intent intentToIntroduction = new Intent(this, MainActivity.class);
        startActivity(intentToIntroduction);
    }

    public void goToPostnordChecker(View view){
        Intent intentToPostNordChecker = new Intent(this, PostNordCheckerActivity.class);
        startActivity(intentToPostNordChecker);
    }
}