package com.example.mbarrafirdaus.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mbarrafirdaus.quiz.Dashboard;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void btn_psg(View view){
        Intent psg = new Intent(Dashboard.this, QuizActivity.class);
        startActivity(psg);
    }

    public void btn_sgt (View view){
        Intent sgt = new Intent(Dashboard.this, QuizActivityb.class);
        startActivity(sgt);
    }
    public void btn_jjg (View view){
        Intent jjg = new Intent(Dashboard.this, QuisActivityc.class);
        startActivity(jjg);
    }
    public void btn_bkt (View view){
        Intent bkt = new Intent(Dashboard.this, QuizActivityd.class);
        startActivity(bkt);
    }
    public void btn_lyly (View view){
        Intent lyly = new Intent(Dashboard.this, QuizActivitye.class);
        startActivity(lyly);
    }
    public void btn_abot (View view){
        Intent abot = new Intent(Dashboard.this, About.class);
        startActivity(abot);
    }
}
