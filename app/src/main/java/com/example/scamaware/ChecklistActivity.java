package com.example.scamaware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ChecklistActivity extends AppCompatActivity {

    private ArrayList<String> tips = new ArrayList<String>();
    private int currentTipIndex = 0;
    private TextView tipstoRender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);
        tips.add("Giv ikke personlige oplysninger over telefonen, medmindre du er helt sikker på hvem du har i den anden ende som fx. Din bankrådgiver, eller dit lægehus.");
        tips.add("Hvis nogen ringer og beder dig om at overføre penge, så læg røret på med det samme.");
        tips.add("Hvis nogen ringer og siger du har virus på din computer, er dette også svindel. De kan ikke vide om du har virus på din computer, de forsøger bare at snyde dig til at overføre dem penge for at hjælpe med et problem der ikke eksisterer.");
        tips.add("Hvis du modtager en e-mail, eller en sms fra nogle som siger du har vundet en konkurrence og du skal betale for fragtomkostninger skal du se det som svindel, og ikke indbetale nogle penge.");
        tips.add("Ved webshops anbefales det er holde øje med e-mærket, hvis du ser mærkevarer billigere end alle andre steder skal man være ekstra opmærksom, hvis et tilbud er for godt til at være sandt er det godt at undgå, for at sikre du ikke bliver snydt.");
        tips.add("Hvis du forsøger at sælge noget på internettet, og bliver mødt med at de vil sende en fragtmand med en konvolut med penge, er dette også snyd. Fragtmænd kommer ikke med penge, det er købers ansvar at få overført penge inden du sender din vare.");
        tips.add("Hvis du deltager i konkurrencer på facebook, skal du være opmærksom på om det er den rigtige side som afholder en konkurrence. Der er mange som laver falske facebooksider, der ligner den originale på en prik for at svindle folk til at få personfølsomme oplysninger.");
        tipstoRender = findViewById(R.id.textView4);
        tipstoRender.setText(tips.get(currentTipIndex));
    }

    public void nextTip(View view) {
        currentTipIndex++;
        if (currentTipIndex >= tips.size()) {
            currentTipIndex = 0;
        }
        tipstoRender.setText(tips.get(currentTipIndex));
    }
    public void goToFrontpage(View view){
        Intent intentToFrontpage = new Intent(this, Frontpage.class);
        startActivity(intentToFrontpage);
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