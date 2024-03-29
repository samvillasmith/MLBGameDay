package com.example.android.mlbgameday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    int OutsTeamA = 0;

    int OutsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA1(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamAOut(View v) {
        OutsTeamA = OutsTeamA + 1;
        displayForTeamY(OutsTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForSocks1(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 1 point1.
     */
    public void addOneForSocks(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the outs for Team B by 1 point.
     */
    public void addOneOutForSocks(View v) {
        OutsTeamB = OutsTeamB + 1;
        displayForTeamS(OutsTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the outs for both teams back to 0.
     */

    public void resetOuts(View v) {
        OutsTeamA = 0;
        OutsTeamB = 0;
        displayForTeamY(OutsTeamA);
        displayForTeamS(OutsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamS(int OutsTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.SoxOuts);
        scoreView.setText(String.valueOf(OutsTeamB));
    }

    public void displayForTeamY(int OutsTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.YankeesOuts);
        scoreView.setText(String.valueOf(OutsTeamA));
    }
}