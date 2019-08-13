package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Roreta extends AppCompatActivity {
    TextView ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roreta);

        ok = (TextView) findViewById(R.id.textButton1);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Roreta.this, Root_roreta.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        return;
    }
}
