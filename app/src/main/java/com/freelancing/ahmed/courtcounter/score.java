package com.freelancing.ahmed.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class score extends AppCompatActivity {
    TextView welcome;
    int scoreConA=0;
    int scoreConB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        String username = getIntent().getStringExtra("name");
        welcome= (TextView) findViewById(R.id.text1);
        welcome.setText("Hello, "+username);
        welcome.setTextSize(20);

    }
    public void addOneForConA(View v){
        scoreConA++;
        displayForConA(scoreConA);
    }
    public void addTwoForConA(View v){
        scoreConA+=2;
        displayForConA(scoreConA);
    }
    public void addThreeForConA(View v){
        scoreConA+=3;
        displayForConA(scoreConA);
    }
    public void addOneForConB(View v){
        scoreConB++;
        displayForConB(scoreConB);
    }
    public void addTwoForConB(View v){
        scoreConB+=2;
        displayForConB(scoreConB);
    }
    public void addThreeForConB(View v){
        scoreConB+=3;
        displayForConB(scoreConB);
    }
    public void resetScore(View v) {
        scoreConA = 0;
        scoreConB = 0;
        displayForConA(scoreConA);
        displayForConB(scoreConB);
    }
    public void displayForConA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.contestant_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForConB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.contestant_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
