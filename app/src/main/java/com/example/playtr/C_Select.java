package com.example.playtr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class C_Select extends AppCompatActivity implements View.OnClickListener{
    public static final int REQUEST_CODE = 101;
    TextView kenzie, domic, saxon, sadie, dain, quentin, lieam, baron, natha, robin, sloan, ok, help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_select);

        kenzie = (TextView) findViewById(R.id.kenzie);
        kenzie.setOnClickListener(this);
        domic = (TextView) findViewById(R.id.domic);
        domic.setOnClickListener(this);
        saxon = (TextView) findViewById(R.id.saxon);
        saxon.setOnClickListener(this);
        sadie = (TextView) findViewById(R.id.sadie);
        sadie.setOnClickListener(this);
        dain = (TextView) findViewById(R.id.dain);
        dain.setOnClickListener(this);
        quentin = (TextView) findViewById(R.id.quentin);
        quentin.setOnClickListener(this);
        lieam = (TextView) findViewById(R.id.lieam);
        lieam.setOnClickListener(this);
        baron = (TextView) findViewById(R.id.baron);
        baron.setOnClickListener(this);
        natha = (TextView) findViewById(R.id.natha);
        natha.setOnClickListener(this);
        robin = (TextView) findViewById(R.id.robin);
        robin.setOnClickListener(this);
        sloan = (TextView) findViewById(R.id.sloan);
        sloan.setOnClickListener(this);
        ok = (TextView) findViewById(R.id.ok);
        ok.setOnClickListener(this);
        help = (TextView) findViewById(R.id.help);
        help.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.kenzie:
                Intent k_intent = new Intent(C_Select.this, Kenzie_help.class);
                startActivityForResult(k_intent, RESULT_OK);
                break;
            case R.id.domic:
                Intent d_intent = new Intent(C_Select.this, Kenzie_help.class);
                startActivity(d_intent);
                break;
            case R.id.saxon:
                Intent s_intent = new Intent(C_Select.this, Kenzie_help.class);
                startActivityForResult(s_intent, 1);
                break;
            case R.id.sadie:
                Intent a_intent = new Intent(C_Select.this, Kenzie_help.class);
                startActivityForResult(a_intent, 1);
                break;
            case R.id.dain:
                Intent da_intent = new Intent(C_Select.this, Kenzie_help.class);
                startActivityForResult(da_intent, 1);
                break;
            case R.id.quentin:
                Intent q_intent = new Intent(C_Select.this, Kenzie_help.class);
                startActivityForResult(q_intent, 1);
                break;
            case R.id.lieam:
                Intent l_intent = new Intent(C_Select.this, Kenzie_help.class);
                startActivityForResult(l_intent, 1);
                break;
            case R.id.baron:
                Intent b_intent = new Intent(getApplicationContext(), Baron_help.class);
                startActivityForResult(b_intent, RESULT_OK);
                break;
            case R.id.natha:
                Intent n_intent = new Intent(C_Select.this, Kenzie_help.class);
                startActivityForResult(n_intent, 1);
                break;
            case R.id.robin:
                Intent r_intent = new Intent(C_Select.this, Kenzie_help.class);
                startActivityForResult(r_intent, 1);
                break;
            case R.id.sloan:
                Intent sl_intent = new Intent(C_Select.this, Kenzie_help.class);
                startActivityForResult(sl_intent, 1);
                break;
            case R.id.help :
                Intent h_intent = new Intent(C_Select.this, C_Help_Pop.class);
                startActivityForResult(h_intent, 1);
                break;
            case R.id.ok:
                Intent o_intent = new Intent(C_Select.this, StartActivity.class);
                startActivityForResult(o_intent, 1);
                break;
        }

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch(resultCode) {
            case 1:
                kenzie.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.sky));
                break;
            case 2:
                baron.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.sky));
                break;
        }
    }

}
