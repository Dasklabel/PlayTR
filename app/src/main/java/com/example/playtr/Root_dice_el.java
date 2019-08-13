package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Root_dice_el extends AppCompatActivity {
    TextView ok, cancle;
    CheckBox d_w, d_h, d_g, d_m, d_a, d_p, q_w, q_h, q_g, q_m, q_a, q_s, b_w, b_g, b_m, b_a, b_c, b_h, r_w, r_g, r_wo, r_c,
    r_a, r_s, r_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_root);

        ok = (TextView) findViewById(R.id.ok);
        cancle = (TextView) findViewById(R.id.cancle);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Root_dice_el.this, Dice_root.class);
                startActivity(intent);
            }
        });
        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Root_dice_el.this, Dice_root.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        return;
    }
}
