package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 // To check answer of Q1 and update score.
   private void questionOne() {
       RadioButton opt = (RadioButton) findViewById(R.id.Q1A1);
       boolean ans = opt.isChecked();
       if (ans)
           score = score + 1;
   }

 // To check answer of Q2 and update score.
    private void questionTwo() {
        RadioButton opt = (RadioButton) findViewById(R.id.Q2A1);
        boolean ans = opt.isChecked();
        if(ans)
            score = score + 1;
    }

 // To check answer of Q3 and update score.
    private void questionThree() {
        CheckBox ans1 = (CheckBox) findViewById(R.id.Q3A1);
        boolean val1 = ans1.isChecked();
        CheckBox ans2 = (CheckBox) findViewById(R.id.Q3A2);
        boolean val2 = ans2.isChecked();
        CheckBox ans3 = (CheckBox) findViewById(R.id.Q3A3);
        Boolean val3 = ans3.isChecked();
        CheckBox ans4 = (CheckBox) findViewById(R.id.Q3A4);
        boolean val4 = ans4.isChecked();
        if (val1 && val3 && !val2 && !val4)
            score = score + 1;
    }

 // To check answer of Q4 and update score.
    private void questionFour() {
        RadioButton opt = (RadioButton) findViewById(R.id.Q4A2);
        boolean ans = opt.isChecked();
        if (ans)
            score = score + 1;
    }

 // To check answer of Q5 and update score.
    private void questionFive() {
        RadioButton opt = (RadioButton) findViewById(R.id.Q5A3);
        boolean ans = opt.isChecked();
        if (ans)
            score = score + 1;
    }

 // To check answer of Q6 and update score.
    private void questionSix() {
        EditText ans = (EditText) findViewById(R.id.Q6A1);
        String text = ans.getText().toString();
        if (text.equalsIgnoreCase("15/08/1947")) {
            score = score + 1;
        }
    }

 // To get total score by calling all functions.
    private void checkScore() {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
    }

 // To reset score to 0.
    private void  resetScore() {
        score = 0;
    }

 // To display score.
    public void ShowScore(View view) {
        checkScore();
        if(score >= 3){
            Toast.makeText(getApplicationContext(), " You passed the Quiz with score " + score, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), " You failed with score " + score, Toast.LENGTH_SHORT).show();
        }
        resetScore();
    }
}
