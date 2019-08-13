package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class C_up extends AppCompatActivity {
    TextView c_dt, dt, firstdice, dicetext, attack, next, next_2, ok;
    int c_data, m_data;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_up);

        rnd = new Random();
        c_dt = (TextView) findViewById(R.id.c_number);
        dt = (TextView) findViewById(R.id.m_number);
        firstdice = (TextView) findViewById(R.id.firstdice);
        dicetext = (TextView) findViewById(R.id.dicetext);
        attack = (TextView) findViewById(R.id.attack);
        next = (TextView) findViewById(R.id.text3);
        next_2 = (TextView) findViewById(R.id.text4);
        ok = (TextView) findViewById(R.id.textButton1);

        Intent intent = getIntent();
        c_data = intent.getIntExtra("c_num", 1);
        m_data = intent.getIntExtra("num", 1);

        c_dt.setText("[ " + c_data + " ]");
        dt.setText("[ " + m_data + " ]");

        ok.setVisibility(View.INVISIBLE);
        attack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c_num = rnd.nextInt(8) + 1;
                int num = rnd.nextInt(7) + 1;
                firstdice.setText("[ 까마귀: " + c_num + ", 순찰대: " + num + " ]");
                if(c_num < num) {
                    attack.setVisibility(View.INVISIBLE);
                    c_data -= c_num;
                    c_dt.setText("[ " + c_data + " ]");
                    dt.setText("[ " + m_data + " ]");
                    dicetext.setText("   눈을 찔린 까마귀는 고통스런 비명을 내지르며 뒤로 몇 걸음 물러섭니다. 그 전에 빠르게 창을 뽑은 바론은 또 다시 공격할 자세를 취합니다.");
                    next.setText("   까마귀가 가방을 놓친 사이에 순찰대는 각자의 무기를 꺼내듭니다.");
                    ok.setVisibility(View.VISIBLE);
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view){
                            Intent intent = new Intent(C_up.this, C_up_2.class);
                            intent.putExtra("c_num", c_data);
                            intent.putExtra("num", m_data);
                            startActivity(intent);
                        }
                    });
                } else {
                    attack.setVisibility(View.INVISIBLE);
                    m_data -= num;
                    c_dt.setText("[ " + c_data + " ]");
                    if(m_data <= 0) {
                        dt.setText("[ 0 ]");
                        next.setText("   큰까마귀는 가방을 문 채로 재빨리 날아올라 창을 피했습니다. 끈을 놓치고 바닥에 나동그라진 순찰대는 허망하게 하늘을 바라봅니다.");
                        ok.setVisibility(View.VISIBLE);
                        ok.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view){
                                Intent intent = new Intent(C_up.this, Crow_lose.class);
                                intent.putExtra("c_num", c_data);
                                intent.putExtra("num", m_data);
                                startActivity(intent);
                            }
                        });
                    } else {
                        dt.setText("[ " + m_data + " ]");
                        dicetext.setText("   큰까마귀는 가방을 놓고 창을 피했다가 바론의 망토를 물어 들어올리고는 저 멀리 내던졌습니다. 바론이 데굴데굴 굴러갑니다.");
                        next.setText("   순찰대는 바론을 부축하고 얼른 전열을 정비해 무기를 꺼냅니다.");
                        ok.setVisibility(View.VISIBLE);
                        ok.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view){
                                Intent intent = new Intent(C_up.this, C_up_2.class);
                                startActivity(intent);
                            }
                        });
                    }
                }
            }
        });
    }
//    @Override
//    public void onBackPressed() {
//        return;
//    }
}
