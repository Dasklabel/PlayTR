package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class M_up_2 extends AppCompatActivity {
    TextView c_dt, dt, firstdice, dicetext, attack, next, next_2, ok;
    int c_data, m_data;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_up_2);

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
                    dicetext.setText("   까마귀의 몸집이 커 쏘아진 화살은 머리까지 닿지 않고 목 부근의 검은 깃털 사이에 박힙니다. 그것만으로도 까마귀는 놀라 하늘 위로 날아오릅니다.");
                    next.setText("   (이하 전투는 임의로 생략합니다). 순찰대는 그 사이 우편물 가방을 챙겨 서둘러 길프레지로 향합니다.");
                    ok.setVisibility(View.VISIBLE);
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view){
                            Intent intent = new Intent(M_up_2.this, Success_gill.class);
                            startActivity(intent);
                        }
                    });
                } else {
                    attack.setVisibility(View.INVISIBLE);
                    m_data -= num;
                    c_dt.setText("[ " + c_data + " ]");
                    if(m_data <= 0) {
                        dt.setText("[ 0 ]");
                        next.setText("   큰까마귀는 다인의 검을 빼앗아 물고는 그대로 날아 도망칩니다. 순찰대는 무기를 잃었다는 당황도 잠시 가방을 챙겨 서둘러 길프레지로 향합니다.");
                        ok.setVisibility(View.VISIBLE);
                        ok.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view){
                                Intent intent = new Intent(M_up_2.this, Success_gill.class);
                                startActivity(intent);
                            }
                        });
                    } else {
                        dt.setText("[ " + m_data + " ]");
                        dicetext.setText("   큰까마귀는 다인의 검을 빼앗아 물고는 그대로 날아 도망칩니다. 순찰대는 무기를 잃었다는 당황도 잠시 가방을 챙겨 서둘러 길프레지로 향합니다.");
                        next.setText("(이하의 전투는 임의로 생략합니다.)");
                        ok.setVisibility(View.VISIBLE);
                        ok.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view){
                                Intent intent = new Intent(M_up_2.this, Success_gill.class);
                                startActivity(intent);
                            }
                        });
                    }
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        return;
    }
}
