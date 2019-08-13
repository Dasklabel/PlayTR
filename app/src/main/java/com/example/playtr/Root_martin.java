package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Root_martin extends AppCompatActivity {
    TextView dice, martin, member;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root_martin);

        rnd = new Random();
        dice = (TextView) findViewById(R.id.textButton1);
        martin = (TextView) findViewById(R.id.m_dice);
        member = (TextView) findViewById(R.id.dice);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c_num = rnd.nextInt(2) + 1;
                int num = rnd.nextInt(7)+3;
                martin.setText("[ " + c_num + " ]");
                member.setText("[ " + num + " ]");
                    Intent intent = new Intent(Root_martin.this, Martin_lose.class);
                    startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        return;
    }
}
