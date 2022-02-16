package com.example.uibase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;



import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;


public class SubActivity extends AppCompatActivity {

    private static Context context;

    TextView scoreView;
    ImageView UserImg;

    int getScore;
    int score;


    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<String> list3 = new ArrayList<>();
    ArrayList<String> list4 = new ArrayList<>();
    TextView mission1;
    TextView mission2;
    TextView mission3;
    TextView mission4;
    TextView mission5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();


        score=0;
        scoreView = findViewById(R.id.score);
        UserImg = findViewById(R.id.imageView);
        mission1 = findViewById(R.id.mission1);
        mission2 = findViewById(R.id.mission2);
        mission3 = findViewById(R.id.mission3);
        mission4 = findViewById(R.id.mission4);
        mission5 = findViewById(R.id.mission5);
        Button score_btn = findViewById(R.id.score_btn);
        Button album = findViewById(R.id.album);
        Button score_btn2 = findViewById(R.id.score_btn2);
        Button score_btn3 = findViewById(R.id.score_btn3);
        Button score_btn4 = findViewById(R.id.score_btn4);
        Button score_btn5 = findViewById(R.id.score_btn5);



        Intent getInt = getIntent();
        getScore = getInt.getIntExtra("score",0);


        //미션
        list1.add("샤워하기(3점)");
        list1.add("방청소하기(5점) ");
        list1.add("책읽고 느낀점 5줄 쓰기(5점)");
        list1.add("오늘뜬 뉴스기사 제목 쓰기(3점)");
        list1.add("부모님께 안부 혹은 사랑한다 연락하기(5점)");
        list1.add("거울보고 30초 동안 미소 짓기(3점)");
        list1.add("지금 느끼는 감정 3개 메모하기(3점)");
        list1.add("명상 3분이상하기(3점)");
        list1.add("스쿼트 30개(3점");
        list1.add("행복했던 기억 3가지 적어보기(3점)");
        list1.add("개그프로 1회 시청하기(3점)");
        list1.add("11시 이전 잠들기(3점)");
        list1.add("반신욕하기(3점");
        list1.add("명작 영화보기(3점)");
        list1.add("나를 위한 요리하기(5점)");
        list1.add("족욕하기(3점)");
        list1.add("가구위치 바꾸기(3점)");
        list1.add("거울보고 할수있다 3번 말하기(3점)");
        list1.add("나 자신에게 편지 쓰기(3점)");
        list1.add("하루 계획표 짜보기(3점)");
        list1.add("과거 행복한 사진 보기(3점)");
        list1.add("다른나라 인사말 5가지 적어보기(3점)");
        list1.add("신나는 노래 3개 이상 듣기(3점)");
        list1.add("오늘 하루 일기 쓰기(3점)");

        list2.add("구름사진 찍기(3점)");
        list2.add("달사진 찍기(3점)");
        list2.add("해 사진 찍기(3점)");
        list2.add("노을 사진 찍기(3점)");
        list2.add("집근처 마트에서 장보기(5점)");
        list2.add("가장 이쁜 꽃 사진 찍기(3점)");
        list2.add("가장 멋있는 나무 찍기(3점)");
        list2.add("집 근처 학교 사진 찍기(3점)");
        list2.add("길 고양이 사진 찍기(3점)");
        list2.add("곤충 사진 찍기(3점)");
        list2.add("집근처 공원 간판이름 사진 찍기(3점)");
        list2.add("집근처 천 or 강 사진 찍기(3점)");
        list2.add("물수제비 해보기(5점)");
        list2.add("좋아하는 음식점 매장 간판 사진 찍기(3점)");
        list2.add("다이소에서 3,000원 이상 물건 사기(5점)");
        list2.add("노란색 건물 사진찍기(3점)");
        list2.add("초록색 건물 사진찍기(3점)");
        list2.add("황금마티즈 사진 찍기(5점)");

        list3.add("코인노래방 혼자 가보기(5점)");
        list3.add("헤어 스타일 바꿔보기(5점)");

        list4.add("직접 매장에 가서 계절에 맞는 옷 구매하기(5점)");
        list4.add("친구와 밥 먹기(5점)");
        list4.add("등산하기(5점)");
        list4.add("친구랑 인생네컷 찍기(5점)");
        list4.add("가족이나 친구에게 음식해주기(5점)");




        Random random = new Random();//랜덤 함수 생성


        //버튼을 눌렀을 때 랜덤화
        //24시간 주기로 반복되게
        /*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> numList = new ArrayList<>();//중복 안되게 나왔던 숫자들 저장하는 배열

                int missionCnt;

                if(score<=100) missionCnt=list1.size();
                else if(score >= 101 && score <=200)  missionCnt=list2.size();
                else if (score >= 201 && score <= 300) missionCnt=list3.size();
                else missionCnt=list4.size();

                for (int i = 0; i < 5; ++i) {   //미션 5개 뽑기 위해 5번 루프 반복
                    int randInt;
                    while (1 == 1) {
                        //중복되지 않은 숫자가 나올 때 까지 무한반복
                        randInt = random.nextInt(random.nextInt(missionCnt) + 1); //n개의 랜덤 숫자 추출(미션 개수만큼 바꿔주면됨)
                        if (!numList.contains(randInt)) { //중복되지 않은 숫자가 나오면 루프 탈출, 중복되면 루프 다시 반복해서 랜덤숫자 추출
                            break;
                        }
                    }
                    Log.d("1", String.valueOf(randInt));
                    numList.add(randInt);//배열안에 나왔던 숫자 저장
                }
                Log.d("1", "done" + numList.toString());

                if (score <= 100) {
                    mission1.setText(list1.get(numList.get(0)));//배열안에      두번째 값     ''
                    mission2.setText(list1.get(numList.get(1)));
                    mission3.setText(list1.get(numList.get(2)));
                    mission4.setText(list1.get(numList.get(3)));
                    mission5.setText(list1.get(numList.get(4)));
                }
                else if(score >= 101 && score <=200) {
                    mission1.setText(list2.get(numList.get(0)));//배열안에      두번째 값     ''
                    mission2.setText(list2.get(numList.get(1)));
                    mission3.setText(list2.get(numList.get(2)));
                    mission4.setText(list2.get(numList.get(3)));
                    mission5.setText(list2.get(numList.get(4)));

                }
                else if (score >= 201 && score <= 300){
                    mission1.setText(list3.get(numList.get(0)));//배열안에      두번째 값     ''
                    mission2.setText(list3.get(numList.get(1)));
                    mission3.setText(list3.get(numList.get(2)));
                    mission4.setText(list3.get(numList.get(3)));
                    mission5.setText(list3.get(numList.get(4)));

                }
                else if(score >= 301 && score <= 400){
                    mission1.setText(list4.get(numList.get(0)));//배열안에      두번째 값     ''
                    mission2.setText(list4.get(numList.get(1)));
                    mission3.setText(list4.get(numList.get(2)));
                    mission4.setText(list4.get(numList.get(3)));
                    mission5.setText(list4.get(numList.get(4)));
                }
            }
        });*/

        if(getScore!=score){
            scoreView.setText(String.valueOf(getScore)+"점");

            score=getScore;
            if (score >= 100) {
                UserImg.setImageResource(R.drawable.pro);
            }
            if (score >= 200) {
                UserImg.setImageResource(R.drawable.master);
            }
            if (score >= 300) {
                UserImg.setImageResource(R.drawable.champion);
            }
            if (score >= 400) {
                UserImg.setImageResource(R.drawable.grand_champion);

            }
        }
        Log.d("main", String.valueOf(getScore));

        score_btn.setOnClickListener(v -> {

            Intent intent = new Intent(SubActivity.this, ThreeScore.class);
            intent.putExtra("score", getScore);
            startActivity(intent);

        });

        score_btn2.setOnClickListener(v -> {
            Intent intent = new Intent(SubActivity.this, ThreeScore.class);
            intent.putExtra("score", getScore);
            startActivity(intent); // 액티비티 이동

        });

        score_btn3.setOnClickListener(v -> {
            Intent intent = new Intent(SubActivity.this, ThreeScore.class);
            intent.putExtra("score", getScore);
            startActivity(intent); // 액티비티 이동
        });

        score_btn4.setOnClickListener(v -> {
            Intent intent = new Intent(SubActivity.this, FiveScore.class);
            intent.putExtra("score", getScore);
            startActivity(intent); // 액티비티 이동
        });

        score_btn5.setOnClickListener(v -> {
            Intent intent = new Intent(SubActivity.this, FiveScore.class);
            intent.putExtra("score", getScore);
            startActivity(intent); // 액티비티 이동
        });
        album.setOnClickListener(v -> {
            Intent intent = new Intent(SubActivity.this, album.class);
            startActivity(intent); // 액티비티 이동

        });




    }


    public static void resetAlarm(Context context){
        SubActivity.context = context;
        AlarmManager resetAlarmManager = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent resetIntent = new Intent(context, MyReceiver.class);
        PendingIntent resetSender = PendingIntent.getBroadcast(context, 0, resetIntent, 0);
        //자정 시간
        Calendar resetCal = Calendar.getInstance();
        resetCal.setTimeInMillis(System.currentTimeMillis());
        resetCal.set(Calendar.HOUR_OF_DAY, 0);
        resetCal.set(Calendar.MINUTE,0);
        resetCal.set(Calendar.SECOND, 0);
        // 다음날 0시에 맞추기 위해 24시간을 뜻하는 상수인 AlarmManager.INTERVAL_DAY를 더해줌.
        resetAlarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP,
                resetCal.getTimeInMillis() +AlarmManager.INTERVAL_DAY, AlarmManager.INTERVAL_DAY, resetSender);
        SimpleDateFormat format = new SimpleDateFormat("MM/dd kk:mm:ss");
        String setResetTime = format.format(new Date(resetCal.getTimeInMillis()+AlarmManager.INTERVAL_DAY));
        Log.d("resetAlarm", "ResetHour : " + setResetTime);
    }



}














