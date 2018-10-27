package com.example.dktzoo.demba;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private TextView mActivityGameQuestionText;
    private Button mActivityGameAnswer1;
    private Button mActivityGameAnswer2;
    private Button mActivityGameAnswer3;
    private Button mActivityGameAnswer4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mActivityGameQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        mActivityGameAnswer1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mActivityGameAnswer2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mActivityGameAnswer3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mActivityGameAnswer4 = (Button) findViewById(R.id.activity_game_answer4_btn);





    }
}
