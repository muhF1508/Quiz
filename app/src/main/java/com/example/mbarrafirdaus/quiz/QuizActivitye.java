package com.example.mbarrafirdaus.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivitye extends AppCompatActivity {

    private Quize mQuestionLibrary = new Quize();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private TextView mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);
        updateQuestion();

        updateScore(mScore);
    }

    private void updateQuestion() {

        if (mQuestionNumber<mQuestionLibrary.getLenght() ){

            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber,1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber,2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber,3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionNumber,4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else {
            Toast.makeText(QuizActivitye.this,"It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(QuizActivitye.this, HighestScoreActivitye.class);
            intent.putExtra("score", mScore);
            startActivity(intent);
        }
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore+"/"+mQuestionLibrary.getLenght());
    }


    public void onClick(View view) {
        Button answer = (Button) view;
        if (answer.getText() == mAnswer){
            mScore = mScore +1;
            Toast.makeText(QuizActivitye.this, "Benar!",Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(QuizActivitye.this, "Salah!", Toast.LENGTH_SHORT).show();

        updateScore(mScore);
        updateQuestion();
    }
}
