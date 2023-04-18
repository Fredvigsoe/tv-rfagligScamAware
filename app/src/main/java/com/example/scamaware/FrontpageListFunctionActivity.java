package com.example.scamaware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrontpageListFunctionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage_list_function);
    }

    public void videreTilCommunityFunction (View view) {
        Intent intentToFrontpageCommunityFunction = new Intent(this, FrontpageCommunityFunction.class);
        startActivity(intentToFrontpageCommunityFunction);
    }
}