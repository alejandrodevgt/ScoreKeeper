package com.dev.ale.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the football score for 2 teams.
 */

public class MainActivity extends AppCompatActivity {

    // Tracks the score, fouls, and cards for the two teams.
    public int scoreVisitor = 0;
    public int foulVisitor = 0;
    public int cardVisitor = 0;
    public int scoreHome = 0;
    public int foulHome = 0;
    public int cardHome = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Visitor team by 1.
     */
    public void addGoalVisitor(View view) {
        scoreVisitor += 1;
        displayVisitor(scoreVisitor);
    }

    public void addFoulVisitor(View view) {
        foulVisitor += 1;
        setFoulVisitor(foulVisitor);

    }

    public void addCardVisitor(View view) {
        cardVisitor += 1;
        setCardVisitor(cardVisitor);

    }

    /**
     * Increase the score for Home team by 1.
     */


    public void addGoalHome(View view) {
        scoreHome += 1;
        displayHome(scoreHome);

    }

    public void addFoulHome(View view) {
        foulHome += 1;
        setFoulHome(foulHome);

    }

    public void addCardHome(View view) {
        cardHome += 1;
        setCardHome(cardHome);

    }

    /**
     * Displays the given score for Visitors.
     */
    public void displayVisitor(int score) {
        TextView text = findViewById(R.id.tvScoreVisitor);
        text.setText(String.valueOf(score));
    }

    public void setFoulVisitor(int foul) {
        TextView text = findViewById(R.id.tv_fouls_visitors);
        text.setText(String.valueOf(foul));
    }

    public void setCardVisitor(int card) {
        TextView text = findViewById(R.id.tv_cards_visitors);
        text.setText(String.valueOf(card));
    }


    /**
     * Displays the given score for Home.
     */

    public void displayHome(int score) {
        TextView text = findViewById(R.id.tvScoreHome);
        text.setText(String.valueOf(score));
    }

    public void setFoulHome(int foul) {
        TextView text = findViewById(R.id.tv_fouls_home);
        text.setText(String.valueOf(foul));
    }

    public void setCardHome(int card) {
        TextView text = findViewById(R.id.tv_cards_home);
        text.setText(String.valueOf(card));
    }

    /**
     * Resets the score for both teams back to 0.
     */

    public void resetScore(View view) {
        scoreVisitor = 0;
        foulVisitor = 0;
        cardVisitor = 0;
        scoreHome = 0;
        foulHome = 0;
        cardHome = 0;
        displayVisitor(scoreVisitor);
        setFoulVisitor(foulVisitor);
        setCardVisitor(cardVisitor);
        displayHome(scoreHome);
        setFoulHome(foulHome);
        setCardHome(cardHome);


    }


}
