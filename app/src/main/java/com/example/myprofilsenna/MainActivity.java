package com.example.myprofilsenna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScrollView scroll = (ScrollView) findViewById(R.id.scroll_utama);
        scroll.setFocusableInTouchMode(true);
        scroll.setDescendantFocusability(ViewGroup.FOCUS_BEFORE_DESCENDANTS);

        Button btn_UTS = (Button)findViewById(R.id.btn_UTS);
        btn_UTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toUTS();
            }
        });
    }

    public  void  toUTS() {
        Intent intent = new Intent(this, UTS_Activity.class);
        startActivity(intent);
    }
}
