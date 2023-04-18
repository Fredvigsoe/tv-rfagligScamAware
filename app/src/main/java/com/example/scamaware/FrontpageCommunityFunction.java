package com.example.scamaware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrontpageCommunityFunction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage_community_function);
    }

    public void videreTilHelpFunction (View view) {
        Intent intentToFrontpageListFunction = new Intent(this, FrontpageHelpFunctionActivity.class);
        startActivity(intentToFrontpageListFunction);
    }
}