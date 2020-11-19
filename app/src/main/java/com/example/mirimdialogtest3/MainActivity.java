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
            dialogView = View.inflate(MainActivity.this, R.layout.dialog1, null);
        }
    };

    View.OnClickListener btnShowListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialogView = View.inflate(MainActivity.this, R.layout.dialog, null);
            dlgImg = dialogView.findViewById(R.id.img);
            int selectedTitle = "";
            switch (rg.getChecedRadioButtonId()){
                case R.id.radio_dog:
                    selectedId = R.drawable.dog;
                    selectedTitle = radioDog.getText().toString();
                    break;
            }
        }
    }
}