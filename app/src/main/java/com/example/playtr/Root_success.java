package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Root_success extends AppCompatActivity {
    TextView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root_success);

        b = (TextView) findViewById(R.id.textButton1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Root_success.this, Success_gill.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        return;
    }
}
