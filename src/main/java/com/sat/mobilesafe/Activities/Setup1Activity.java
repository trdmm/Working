package com.sat.mobilesafe.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sat.mobilesafe.R;

/**
 * Created by knight on 17-2-6.
 */
public class Setup1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup1);
    }
    public void next_page(View v){
        Intent intent = new Intent(this, Setup2Activity.class);
        startActivity(intent);
        finish();
    }
}
