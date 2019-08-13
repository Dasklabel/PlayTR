package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Dice_camp extends AppCompatActivity {
    TextView dice, c_dt, dt, help;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_camp);

        rnd = new Random();
        c_dt = (TextView) findViewById(R.id.c_dice);
        dt = (TextView) findViewById(R.id.dice);
        dice = (TextView) findViewById(R.id.textButton1);
        help = (TextView) findViewById(R.id.help);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c_num = rnd.nextInt(8) + 1;
                c_num += 8;
                int num = rnd.nextInt(7)+1;
                num += 5;
                c_dt.setText("[ " + c_num + " ]");
                dt.setText("[ " + num + " ]");
                if(c_num >= num) {
                    Intent intent = new Intent(Dice_camp.this, C_up.class);
                    intent.putExtra("c_num", c_num);
                    intent.putExtra("num", num);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(Dice_camp.this, M_up.class);
                    startActivity(intent);
                }
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dice_camp.this, Battle_help_pop.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        return;
    }
}
