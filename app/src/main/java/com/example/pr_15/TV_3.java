package com.example.pr_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TV_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv3);

        Button btnGoToSecAct = (Button) findViewById(R.id.button2);

        View.OnClickListener oclBtnGoToSecAct = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(TV_3.this,TV_2.class);
                startActivity(intent);
            }
        };

        btnGoToSecAct.setOnClickListener(oclBtnGoToSecAct);
    }
}