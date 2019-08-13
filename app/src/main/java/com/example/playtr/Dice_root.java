package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Dice_root extends AppCompatActivity {

    TextView dice, el, dt;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_root);

        rnd = new Random();
        dt = (TextView) findViewById(R.id.dice) ;
        dice = (TextView) findViewById(R.id.textButton1);
        el = (TextView) findViewById(R.id.textButton2);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = rnd.nextInt(6)+1;
                dt.setText("[ "+num + " ]");
                if(num == 6) {
                    Intent intent = new Intent(Dice_root.this, Root_success.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(Dice_root.this, Root_fault.class);
                    startActivity(intent);
                }
            }
        });
        el.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dice_root.this, Dice_root_el.class);
                startActivity(intent);

            }
        });
    }
    @Override
    public void onBackPressed() {
        return;
    }
}
