package com.example.mirimdialogtest3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton radioDog, radioCat, radioRabbit, radioHorse;
    View dialogView;
    ImageView dlgImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.rg);
        radioDog = findViewById(R.id.radio_dog);
        radioCat = findViewById(R.id.radio_cat);
        radioRabbit = findViewById(R.id.radio_rabbit);
        radioHorse = findViewById(R.id.radio_horse);
        Button btnShow = findViewById(R.id.btn_show);
        btnShow.setOnClickListener(btnShowListener);
    }

    View.OnClickListener btnShowListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialogView = View.inflate(MainActivity.this, R.layout.dialog1, null);
            dlgImg = dialogView.findViewById(R.id.img);
            int selectedId = 0;
            String selectedTitle = "";
            switch (rg.getCheckedRadioButtonId()){
                case R.id.radio_dog:
                    selectedId = R.drawable.dog;
                    selectedTitle = radioDog.getText().toString();
                    break;
                case R.id.radio_cat:
                    selectedId = R.drawable.dog;
                    selectedTitle = radioCat.getText().toString();
                    break;
                case R.id.radio_rabbit:
                    selectedId = R.drawable.dog;
                    selectedTitle = radioRabbit.getText().toString();
                    break;
                case R.id.radio_horse:
                    selectedId = R.drawable.dog;
                    selectedTitle = radioHorse.getText().toString();
                    break;
            }
            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            dlg.setTitle(selectedTitle);
            dlg.setView(dialogView);
            dlg.setPositiveButton("닫기", null);
            dlg.show();
        }
    };
}