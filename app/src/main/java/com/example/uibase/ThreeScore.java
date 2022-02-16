package com.example.uibase;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class ThreeScore extends AppCompatActivity {

    public ThreeScore() {

    }
    private Button certification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_score);


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();

        Intent getInt = getIntent();
        int getScore = getInt.getIntExtra("score", 0);

        certification = findViewById(R.id.Certification);
        certification.setOnClickListener(v -> {
            Intent intent = new Intent(ThreeScore.this, SubActivity.class);
            intent.putExtra("score", getScore+3);
            Log.d("Sub", String.valueOf(getScore));
            startActivity(intent); // 액티비티 이동
        });
    }
}