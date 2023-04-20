package com.example.scamaware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PostNordCheckerActivity extends AppCompatActivity {
    private TextView emailChecker;
    private EditText submittedEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_nord_checker);
    }
    public void goToChecklist(View view){
        Intent intentToChecklist = new Intent(this, ChecklistActivity.class);
        startActivity(intentToChecklist);
    }

    public void goToIntroduction(View view){
        Intent intentToIntroduction = new Intent(this, MainActivity.class);
        startActivity(intentToIntroduction);
    }
    public void goToFrontpage(View view){
        Intent intentToFrontpage = new Intent(this, Frontpage.class);
        startActivity(intentToFrontpage);
    }

    public void submitEmail(View view){
        emailChecker = findViewById(R.id.resultAfEmailCheck);
        submittedEmail = findViewById(R.id.emailIndtastetAfBruger);
        String submittedEmailToString = submittedEmail.getText().toString();
        String postNordMail1 = "noreply@postnord.dk";
        String postNordMail2 = "noreply@postdanmark.dk";
        String postNordMail3 = "noreply@postnord.com.";

        if(submittedEmailToString.equals(postNordMail1) || submittedEmailToString.equals(postNordMail2)
        || submittedEmailToString.equals(postNordMail3)){
            emailChecker.setVisibility(View.VISIBLE);
            emailChecker.setText("Det er PostNord's e-mail, så den er god nok!");
            emailChecker.setTextColor(Color.GREEN);
        }
        else {
            emailChecker.setVisibility(View.VISIBLE);
            emailChecker.setText("Det er en falsk e-mail, så slet den med det samme!" + "\n" + "\n" +
                    "Følgende er en liste over PostNords e-mail addresser de sender pakkeinformationer ud med: " + "\n" + postNordMail1
            + "\n" + postNordMail2
            + "\n" +postNordMail3);
            emailChecker.setTextColor(Color.RED);
        }



    }

}