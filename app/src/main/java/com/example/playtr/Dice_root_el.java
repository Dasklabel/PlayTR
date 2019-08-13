package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Dice_root_el extends AppCompatActivity {

    TextView dice, carp, warr, work;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_root_el);

        rnd = new Random();
        carp = (TextView) findViewById(R.id.carp);
        warr = (TextView) findViewById(R.id.warr);
        work = (TextView) findViewById(R.id.work);
        dice = (TextView) findViewById(R.id.textButton1);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c_num = rnd.nextInt(4)+1;
                int a_num = rnd.nextInt(2)+1;
                int o_num = rnd.nextInt(3)+1;
                carp.setText("목수 [ "+ c_num + " ]");
                warr.setText("전사 [ "+ a_num + " ]");
                work.setText("일꾼 [ "+ o_num + " ]");
                if(c_num >= 2 && a_num >= 1 && o_num >= 2) {
                    Intent intent = new Intent(Dice_root_el.this, Ship.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(Dice_root_el.this, Root_fault.class);
                    startActivity(intent);
                }
            }
        });
    }
//    @Override
//    public void onBackPressed() {
//        return;
//    }
}
