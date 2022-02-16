package com.example.uibase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class FiveScore extends AppCompatActivity {


    public FiveScore() {

    }
    private Button certification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_score);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();


        Intent getInt = getIntent();
        int getScore = getInt.getIntExtra("score", 0);

        certification = findViewById(R.id.Certification);
        certification.setOnClickListener(v -> {
            Intent intent = new Intent(FiveScore.this, SubActivity.class);
            intent.putExtra("score", getScore+5);
            Log.d("Sub", String.valueOf(getScore));
            startActivity(intent); // 액티비티 이동
        });
    }
    }
