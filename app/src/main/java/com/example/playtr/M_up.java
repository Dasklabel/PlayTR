package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class M_up extends AppCompatActivity {
    TextView c_dt, dt, firstdice, dicetext, attack, next, next_2, ok;
    int c_data, m_data;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_up);

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
                    dicetext.setText("   다인이 로빈의 뒷덜미를 잡아 뒤로 빼자마자 바론이 이번엔 큰까마귀의 발목을 찌릅니다. 울부짖은 큰까마귀는 훌쩍 날아 순찰대의 위를 빙빙 돌며 복수할 기회만을 찾고 있습니다.");
                    next.setText("   쿠엔틴이 활을 들고 화살을 쏘며 까마귀가 내려오지 않도록 견제하고 있습니다.");
                    ok.setVisibility(View.VISIBLE);
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view){
                            Intent intent = new Intent(M_up.this, M_up_2.class);
                            intent.putExtra("c_num", c_data);
                            intent.putExtra("num", m_data);
                            startActivity(intent);
                        }
                    });
                } else {
                    attack.setVisibility(View.INVISIBLE);
                    m_data -= num;
                    c_dt.setText("[ " + c_data + " ]");
                    dt.setText("[ " + m_data + " ]");
                    dicetext.setText("   악! 머리를 쪼인 로빈이 정수리를 부여잡고 펄쩍 뛰어 뒤로 도망칩니다. 다인은 그를 보호하면서 칼을 겨눕니다.");
                    next.setText("   쿠엔틴은 활에 화살을 장전하고, 바론은 창을 쥔 채로 까마귀를 노려봅니다.");
                    ok.setVisibility(View.VISIBLE);
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view){
                            Intent intent = new Intent(M_up.this, M_up_2.class);
                            intent.putExtra("c_num", c_data);
                            intent.putExtra("num", m_data);
                            startActivity(intent);
                        }
                    });
                }
            }
        });
    }
//    @Override
//    public void onBackPressed() {
//        return;
//    }
}
