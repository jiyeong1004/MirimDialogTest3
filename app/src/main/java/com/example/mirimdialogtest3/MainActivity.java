package com.example.mirimdialogtest3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button showImg;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showImg = findViewById(R.id.btn_showImg);
        showImg.setOnClickListener(btnShowImgListener);
    }
    View.OnClickListener btnShowImgListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialogView = View.inflate(MainActivity.this, R.layout.dialog1, null)
        }
    };
}