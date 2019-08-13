package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class P_G_Select extends AppCompatActivity {
    Button help;
    TextView p_side;
    TextView g_side;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p_g_select);
        p_side = (TextView) findViewById(R.id.textButton1);
        g_side = (TextView) findViewById(R.id.textButton2);

        help = (Button)findViewById(R.id.help);

        p_side.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(P_G_Select.this, Character.class);
                startActivity(intent);
            }
        });
        g_side.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(P_G_Select.this, StartActivity.class);
                startActivity(intent);
            }
        });
        Button.OnClickListener btnListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.help:
                        Intent intent = new Intent(P_G_Select.this, P_G_Help_Pop.class);
                        startActivityForResult(intent, 1);
                        break;
                }
            }
        };
        help.setOnClickListener(btnListener);
    }
    @Override
    public void onBackPressed() {
        return;
    }
}
