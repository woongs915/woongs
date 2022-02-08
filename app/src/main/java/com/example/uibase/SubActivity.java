package com.example.uibase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class SubActivity extends AppCompatActivity {

    private Button score_btn;
    private Button score_btn2;
    private Button score_btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();

        score_btn = findViewById(R.id.score_btn);
        score_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, ThreeScore.class);
                startActivity(intent); // 액티비티 이동

                score_btn2 = findViewById(R.id.score_btn2);
                score_btn2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SubActivity.this, ThreeScore.class);
                        startActivity(intent); // 액티비티 이동

                        score_btn3 = findViewById(R.id.score_btn3);
                        score_btn3.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(SubActivity.this, ThreeScore.class);
                                startActivity(intent); // 액티비티 이동

                            }
                        });
                    }
                });
            }
        });
    }
}
