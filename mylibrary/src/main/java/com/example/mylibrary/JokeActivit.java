package com.example.mylibrary;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.widget.TextView;

public class JokeActivit extends AppCompatActivity {

    String joke ;
    TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        jokeTextView = (TextView)findViewById(R.id.joke_text_view);
        if(getIntent()!=null){
            joke=getIntent().getStringExtra(Intent.EXTRA_TEXT);
            jokeTextView.setText(joke);
        }



    }
}
