package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Root_roreta extends AppCompatActivity {

    TextView dice, el, dt;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root_roreta);

        rnd = new Random();
        dt = (TextView) findViewById(R.id.dice) ;
        dice = (TextView) findViewById(R.id.textButton1);
        el = (TextView) findViewById(R.id.textButton2);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = rnd.nextInt(4)+1;
                dt.setText("[ "+num + " ]");
                if(num == 4) {
                    Intent intent = new Intent(Root_roreta.this, Darkwood.class);
                    startActivity(intent);
                } else if(num == 3) {
                    Intent intent = new Intent(Root_roreta.this, Nearcity.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(Root_roreta.this, Backrock.class);
                    startActivity(intent);
                }
            }
        });
        el.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Root_roreta.this, Backrock.class);
                startActivity(intent);

            }
        });
    }
    @Override
    public void onBackPressed() {
        return;
    }
}
