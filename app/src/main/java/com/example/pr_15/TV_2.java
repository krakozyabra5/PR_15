package com.example.pr_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TV_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv2);

        Button btnGoToSecAct = (Button) findViewById(R.id.button5);

        View.OnClickListener oclBtnGoToSecAct = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(TV_2.this,TV_4.class);
                startActivity(intent);
            }
        };
        btnGoToSecAct.setOnClickListener(oclBtnGoToSecAct);
    }
}